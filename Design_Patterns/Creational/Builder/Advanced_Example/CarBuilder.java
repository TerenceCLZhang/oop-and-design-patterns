package Design_Patterns.Creational.Builder.Advanced_Example;

public class CarBuilder {
    private int id;
    private String brand;
    private String model;
    private String color;
    private int numDoors;
    private String engine;
    private int height;

    public CarBuilder(int id) {
        this.id = id;
    }

    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder numDoors(int numDoors) {
        this.numDoors = numDoors;
        return this;
    }

    public CarBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder height(int height) {
        this.height = height;
        return this;
    }

    public Car build() {
        return new Car(id, brand, model, color, numDoors, engine, height);
    }
}
