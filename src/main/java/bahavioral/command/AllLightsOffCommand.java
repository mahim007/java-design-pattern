package bahavioral.command;

import java.util.ArrayList;
import java.util.List;

public class AllLightsOffCommand implements Command {
    List<Light> lights = new ArrayList<>();

    public AllLightsOffCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.forEach(Light::off);
    }
}
