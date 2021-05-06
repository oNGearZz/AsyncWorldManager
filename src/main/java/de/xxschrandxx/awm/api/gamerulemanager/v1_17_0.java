package de.xxschrandxx.awm.api.gamerulemanager;

public class v1_17_0 extends v1_16_0 {
  static Rule<Boolean> FREEZEDAMAGE = null;
  static Rule<Integer> PLAYERSSLEEPINGPERCENTAGE = null;
  static void setup() {
    v1_16_0.setup();
    PLAYERSSLEEPINGPERCENTAGE = new Rule<Integer>("playersSleepingPercentage", Integer.class, 100, false);
  }
}
