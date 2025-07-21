package dev.oljver.autotpaaccept.config;

public enum SoundEnum {
  ENTITY_EXPERIENCE_ORB_PICKUP("entity.experience_orb.pickup"),
  ENTITY_PLAYER_LEVELUP("entity.player.levelup"),
  BLOCK_NOTE_BASEDRUM("block.note.basedrum"),
  BLOCK_NOTE_BASS("block.note.bass"),
  BLOCK_NOTE_BELL("block.note.bell"),
  BLOCK_NOTE_CHIME("block.note.chime"),
  BLOCK_NOTE_FLUTE("block.note.flute"),
  BLOCK_NOTE_GUITAR("block.note.guitar"),
  BLOCK_NOTE_HARP("block.note.harp"),
  BLOCK_NOTE_HAT("block.note.hat"),
  BLOCK_NOTE_PLING("block.note.pling"),
  BLOCK_NOTE_SNARE("block.note.snare"),
  BLOCK_NOTE_XYLOPHONE("block.note.xylophone");

  private final String soundName;

  SoundEnum(String soundName) {
    this.soundName = soundName;
  }

  public String getSoundName() {
    return soundName;
  }
}
