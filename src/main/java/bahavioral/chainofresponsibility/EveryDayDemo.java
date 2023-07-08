package bahavioral.chainofresponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EveryDayDemo {
    private static final Logger logger = Logger.getLogger(EveryDayDemo.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.FINER);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.FINER);
        logger.addHandler(handler);

        logger.finest("Finest level of logging");
        logger.finer("Finer level of logging");
        logger.fine("Fine level of logging");
    }
}
