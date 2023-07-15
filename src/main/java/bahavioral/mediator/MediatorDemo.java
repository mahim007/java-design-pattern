package bahavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light bedroom = new Light("Bedroom");
        Light kitchen = new Light("Kitchen");

        mediator.registerLight(bedroom);
        mediator.registerLight(kitchen);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        turnOnAllLightsCommand.execute();

        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
        turnOffAllLightsCommand.execute();
    }
}
