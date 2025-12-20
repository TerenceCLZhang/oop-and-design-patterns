package Design_Patterns.Creational.Builder.Advanced_Example;

public class Director {
    public void buildNissan(CarBuilder builder) {
        builder.brand("Nissan").numDoors(4).engine("2.3 L");
    }

    public void buildToyota(CarBuilder builder) {
        builder.brand("Toyota").numDoors(4).engine("2.4 L");
    }
}
