package Design_Patterns.Creational.Builder;

import Design_Patterns.Creational.Builder.Bad_Example.BadUser;
import Design_Patterns.Creational.Builder.Good_Example.GoodUser;
import Design_Patterns.Creational.Builder.Good_Example.UserBuilder;

public class Builder {
    /*
        The Builder Design Pattern is used to construct complex objects step by step, separating how an object is built
        from what the final object looks like.

        In short: it helps you create objects with many optional parts in a clean, readable and safe way.
     */

    public void badExample() {
        // We want only name, but we need to add age, phone and address, even if they are not used
        BadUser badUser = new BadUser("Bob", 0, 0);
        System.out.println(badUser);
    }

    public void goodExample() {
        // Builder pattern lets us configure only the fields we need while keeping construction readable
        GoodUser goodUser = new UserBuilder("Bob").phone(345712345).build();
        System.out.println(goodUser);
    }
}
