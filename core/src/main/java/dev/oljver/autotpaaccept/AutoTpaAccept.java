package dev.oljver.autotpaaccept;

import dev.oljver.autotpaaccept.config.AutoTpaAcceptConfig;
import dev.oljver.autotpaaccept.listeners.TpaListener;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;

@AddonMain
public class AutoTpaAccept extends LabyAddon<AutoTpaAcceptConfig> {

  @Override
  protected void enable() {
    registerSettingCategory();
    registerListener(new TpaListener(this));
  }

  @Override
  protected Class<? extends AutoTpaAcceptConfig> configurationClass() {
    return AutoTpaAcceptConfig.class;
  }
}