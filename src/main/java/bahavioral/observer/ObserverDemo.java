package bahavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject stream = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(stream);
        TabletClient tabletClient = new TabletClient(stream);

        phoneClient.addMessage("Here is a new message!");
        tabletClient.addMessage("Here is another message");
    }
}
