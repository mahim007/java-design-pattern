package bahavioral.command;

import java.util.List;

public class CommandDemo {
    public static void main(String[] args) {
        Light light1 = new Light();
        Light light2 = new Light();
        Light light3 = new Light();

        Switch aSwitch = new Switch();

        List<Light> lights = List.of(light1, light2, light3);
        AllLightsOnCommand allLightsOnCommand = new AllLightsOnCommand(lights);
        aSwitch.storeAndExecute(allLightsOnCommand);

        ToggleCommand toggleCommand = new ToggleCommand(light2);
        aSwitch.storeAndExecute(toggleCommand);
        aSwitch.storeAndExecute(toggleCommand);

        AllLightsOffCommand allLightsOffCommand = new AllLightsOffCommand(lights);
        aSwitch.storeAndExecute(allLightsOffCommand);
    }
}
