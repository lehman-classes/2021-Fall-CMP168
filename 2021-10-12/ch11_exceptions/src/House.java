public class House {

  public void turnOffLights() throws LightSwitchException {
    System.out.println("house turning off lights");

    // try {
    LightSwitch lightSwitch = new LightSwitch();
    lightSwitch.turnOff();
    // } catch (LightSwitchException e) {
    // System.out.println("Light catched");
    // }

    System.out.println("all good");
    // throw new HouseException("no power");
  }

}
