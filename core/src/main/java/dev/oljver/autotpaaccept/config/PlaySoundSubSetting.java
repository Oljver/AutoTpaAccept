package dev.oljver.autotpaaccept.config;

import net.labymod.api.client.gui.screen.widget.widgets.input.SliderWidget.SliderSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.dropdown.DropdownWidget.DropdownSetting;
import net.labymod.api.configuration.loader.Config;
import net.labymod.api.configuration.loader.annotation.ShowSettingInParent;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class PlaySoundSubSetting extends Config {

  @ShowSettingInParent
  @SwitchSetting
  private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);

  @SliderSetting(min = 0.1f, max = 5.0f, steps = 0.1f)
  private final ConfigProperty<Float> volume = new ConfigProperty<>(1.0f);

  @SliderSetting(min = 0.1f, max = 5.0f, steps = 0.1f)
  private final ConfigProperty<Float> pitch = new ConfigProperty<>(1.0f);

  @DropdownSetting
  private final ConfigProperty<SoundEnum> sound = new ConfigProperty<>(SoundEnum.ENTITY_EXPERIENCE_ORB_PICKUP);

  public ConfigProperty<Boolean> enabled() {
    return enabled;
  }

  public ConfigProperty<Float> getVolume() {
    return volume;
  }

  public ConfigProperty<Float> getPitch() {
    return pitch;
  }

  public ConfigProperty<SoundEnum> getSound() {
    return sound;
  }
}
