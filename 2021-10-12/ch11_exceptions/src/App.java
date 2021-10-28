public class App {
  public static void main(String[] args) throws Exception {

    House house = new House();
    try {

      // do stuff with file here
      house.turnOffLights();

      // some other code

      /*
       * } catch (HouseException he) { System.out.println("House Exception"); //
       * house.turnOffLights();
       */} catch (LightSwitchException lse) {
      System.out.println("LS Exception");
    } catch (Exception e) {
      System.out.println("Not sure what happened?");
    } finally {
      // write any code here to finish unresolved issues
      // like closing files, handles, etc...
      // cleanup stuff goes here
    }

  }

}
