public class LightSwitch {

  public void turnOff() throws LightSwitchException {
    System.out.println("LightSwitch turning off");
    // prompt user for switch number
    // tell user about switch is broken
    // switch.off()
    throw new LightSwitchException("exception at LightSwitch");
  }
}
