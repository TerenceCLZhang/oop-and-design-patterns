package Design_Patterns.Creational.Builder;

import Design_Patterns.Creational.Builder.Advanced_Example.Car;
import Design_Patterns.Creational.Builder.Advanced_Example.CarBuilder;
import Design_Patterns.Creational.Builder.Advanced_Example.Director;
import Design_Patterns.Creational.Builder.Bad_Example.BadUser;
import Design_Patterns.Creational.Builder.Good_Example.GoodUser;
import Design_Patterns.Creational.Builder.Good_Example.UserBuilder;

public class Builder {
    /*
        The Builder Design Pattern is used to construct complex objects step by step, separating how an object is built
        from what the final object looks like.

        In short: it helps you create objects with many optional parts in a clean, readable and safe way.

        https://www.youtube.com/watch?v=MaY_MDdWkQw
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

    public void advancedExample() {
        // Optionally, we can have a director class which would be used to define the order in which we should call the construction
        // steps so that we can reuse specific configurations of products we are building.

        // It also has the benefit of hiding the details of product construction from the client code.
        Director director = new Director();
        CarBuilder toyotaBuilder = new CarBuilder(1).model("Rogue").color("Blue").height(100);
        director.buildToyota(toyotaBuilder);
        Car toyota = toyotaBuilder.build();
        System.out.println(toyota);
    }
}
