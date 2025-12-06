package Design_Patterns.Creational.Singleton;

public class Singleton {
    /*
        The Singleton pattern is used to ensure that only one instance of a class exists throughout an application, and
        that this instance is globally accessible.

        However, it comes with drawbacks. Because many components may depend on the Singleton, it can introduce tight
        coupling, making the system harder to test and modify. Additionally, without careful implementation,
        it may lead to race conditions in multithreaded environments.

        Despite its limitations, the pattern can be useful in specific scenarios, such as managing small, shared
        pieces of information or configuration across an application, where a centralised and unified access point
        simplifies development.
     */

    public void badExample() {
        // This FancyLogger allows us to create multiple loggers, even though it is more beneficial to have one.

        BadFancyLogger badFancyLogger1 = new BadFancyLogger();
        badFancyLogger1.printLogCount(); // 0
        badFancyLogger1.log("First"); // FANCY: First
        badFancyLogger1.printLogCount(); // 1

        BadFancyLogger badFancyLogger2 = new BadFancyLogger();
        badFancyLogger2.printLogCount(); // 0
        badFancyLogger2.log("Second"); // FANCY: Second
        badFancyLogger2.printLogCount(); // 1
    }

    public void goodExample() {
        GoodFancyLogger goodFancyLogger1 = GoodFancyLogger.getGoodFancyLogger();
        goodFancyLogger1.printLogCount(); // 0
        goodFancyLogger1.log("First"); // FANCY: First
        goodFancyLogger1.printLogCount(); // 1

        GoodFancyLogger goodFancyLogger2 = GoodFancyLogger.getGoodFancyLogger();
        goodFancyLogger2.printLogCount(); // 1
        goodFancyLogger2.log("Second"); // FANCY: Second
        goodFancyLogger2.printLogCount(); // 2
    }

}
