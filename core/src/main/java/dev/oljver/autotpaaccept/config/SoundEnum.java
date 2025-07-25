package dev.oljver.autotpaaccept.config;

public enum SoundEnum {
  ENTITY_EXPERIENCE_ORB_PICKUP("entity.experience_orb.pickup"),
  ENTITY_PLAYER_LEVELUP("entity.player.levelup");

  private final String soundName;

  SoundEnum(String soundName) {
    this.soundName = soundName;
  }

  public String getSoundName() {
    return soundName;
  }
}