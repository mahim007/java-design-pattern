package bahavioral.command;

import java.util.ArrayList;
import java.util.List;

public class AllLightsOnCommand implements Command {
    List<Light> lights = new ArrayList<>();

    public AllLightsOnCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.forEach(Light::on);
    }
}
