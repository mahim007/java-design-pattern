package bahavioral.observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject {
    private Deque<String> messages = new ArrayDeque<>();

    @Override
    void setState(String state) {
        messages.add(state);
        this.notifyObservers();
    }

    @Override
    String getState() {
        return messages.getLast();
    }
}
