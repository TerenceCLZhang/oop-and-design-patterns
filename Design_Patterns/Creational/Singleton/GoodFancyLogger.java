package Design_Patterns.Creational.Singleton;

import java.util.ArrayList;
import java.util.List;

public class GoodFancyLogger {

    private static GoodFancyLogger goodFancyLogger;
    List<String> logs = new ArrayList<>();
    
    public static GoodFancyLogger getGoodFancyLogger() {
        if (goodFancyLogger == null) {
            goodFancyLogger = new GoodFancyLogger();
        }
        return goodFancyLogger;
    }

    public void log(String message) {
        logs.add(message);
        System.out.println("FANCY: " + message);
    }

    public void printLogCount() {
        System.out.println("There are " + logs.size() + " logs.");
    }
}
