package dev.oljver.autotpaaccept.listeners;

import dev.oljver.autotpaaccept.AutoTpaAccept;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.labymod.api.client.component.Component;
import net.labymod.api.client.component.event.ClickEvent;
import net.labymod.api.client.component.event.HoverEvent;
import net.labymod.api.client.component.format.NamedTextColor;
import net.labymod.api.client.component.format.Style;
import net.labymod.api.client.component.format.TextDecoration;
import net.labymod.api.client.resources.ResourceLocation;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.chat.ChatReceiveEvent;

public class TpaListener {

  private final AutoTpaAccept addon;
  private final Pattern tpaPattern = Pattern.compile("/tpa accept (\\w{3,16})");

  public TpaListener(AutoTpaAccept addon) {
    this.addon = addon;
  }

  @Subscribe
  public void onChatReceive(ChatReceiveEvent event) {
    if (!this.addon.configuration().enabled().get()) {
      return;
    }

    String plainText = event.chatMessage().getPlainText();
    Matcher matcher = tpaPattern.matcher(plainText);

    if (matcher.find()) {
      String playerName = matcher.group(1);
      String command = matcher.group(0);

      if (!this.addon.configuration().getShowOriginalMessage().get()) {
        event.setCancelled(true);
      }

      if (this.addon.configuration().getPlaySound().enabled().get()) {
        float volume = this.addon.configuration().getPlaySound().getVolume().get();
        float pitch = this.addon.configuration().getPlaySound().getPitch().get();
        String soundName = this.addon.configuration().getPlaySound().getSound().get().getSoundName();

        ResourceLocation soundResource = ResourceLocation.create("minecraft", soundName);
        this.addon.labyAPI().minecraft().sounds().playSound(soundResource, volume, pitch);
      }

      if (this.addon.configuration().getAutoAccept().get()) {
        this.addon.labyAPI().minecraft().chatExecutor().chat(command, false);
        this.addon.displayMessage(Component.text("TPA from ", NamedTextColor.GREEN)
            .append(Component.text(playerName, NamedTextColor.YELLOW))
            .append(Component.text(" automatically accepted.", NamedTextColor.GREEN)));
      } else {
        Component message;
        if (this.addon.configuration().getShowPlayerName().get()) {
          message = Component.text("TPA request from ", NamedTextColor.AQUA)
              .append(Component.text(playerName, NamedTextColor.YELLOW))
              .append(Component.text(". ", NamedTextColor.AQUA))
              .append(Component.text("[ACCEPT]", Style.builder()
                  .color(NamedTextColor.GREEN)
                  .decorate(TextDecoration.BOLD)
                  .clickEvent(ClickEvent.runCommand(command))
                  .hoverEvent(HoverEvent.showText(Component.text("Click to accept the TPA from " + playerName)))
                  .build()
              ));
        } else {
          message = Component.text("A TPA request was detected. ", NamedTextColor.AQUA)
              .append(Component.text("[ACCEPT]", Style.builder()
                  .color(NamedTextColor.GREEN)
                  .decorate(TextDecoration.BOLD)
                  .clickEvent(ClickEvent.runCommand(command))
                  .hoverEvent(HoverEvent.showText(Component.text("Click to accept the TPA")))
                  .build()
              ));
        }
        this.addon.displayMessage(message);
      }
    }
  }
}
