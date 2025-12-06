package Design_Patterns.Creational.Singleton;

import java.util.ArrayList;
import java.util.List;

public class BadFancyLogger {

    List<String> logs = new ArrayList<>();
    ;

    public void log(String message) {
        logs.add(message);
        System.out.println("FANCY: " + message);
    }

    public void printLogCount() {
        System.out.println("There are " + logs.size() + " logs.");
    }
}
