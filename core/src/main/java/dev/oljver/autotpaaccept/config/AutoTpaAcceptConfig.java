package dev.oljver.autotpaaccept.config;

import net.labymod.api.addon.AddonConfig;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.configuration.loader.annotation.ConfigName;
import net.labymod.api.configuration.loader.property.ConfigProperty;
import net.labymod.api.configuration.settings.annotation.SettingSection;

@ConfigName("settings")
public class AutoTpaAcceptConfig extends AddonConfig {

  @SwitchSetting
  private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);

  @SettingSection("auto-accept-settings")
  @SwitchSetting
  private final ConfigProperty<Boolean> autoAcceptTpa = new ConfigProperty<>(false);

  @SwitchSetting
  private final ConfigProperty<Boolean> autoAcceptTpaHere = new ConfigProperty<>(false);

  @SettingSection("message-settings")
  @SwitchSetting
  private final ConfigProperty<Boolean> showOriginalMessage = new ConfigProperty<>(true);

  @SwitchSetting
  private final ConfigProperty<Boolean> showPlayerName = new ConfigProperty<>(true);

  @SettingSection("play-sound-settings")
  private final PlaySoundSubSetting playSound = new PlaySoundSubSetting();

  @Override
  public ConfigProperty<Boolean> enabled() {
    return enabled;
  }

  public ConfigProperty<Boolean> getAutoAcceptTpa() {
    return autoAcceptTpa;
  }

  public ConfigProperty<Boolean> getAutoAcceptTpaHere() {
    return autoAcceptTpaHere;
  }

  public ConfigProperty<Boolean> getShowOriginalMessage() {
    return showOriginalMessage;
  }

  public ConfigProperty<Boolean> getShowPlayerName() {
    return showPlayerName;
  }

  public PlaySoundSubSetting getPlaySound() {
    return playSound;
  }
}