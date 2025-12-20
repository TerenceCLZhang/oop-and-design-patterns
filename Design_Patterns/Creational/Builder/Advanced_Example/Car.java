package Design_Patterns.Creational.Builder.Advanced_Example;

public class Car {
    private final int id;
    private final String brand;
    private final String model;
    private final String color;
    private final int numDoors;
    private final String engine;
    private final int height;

    public Car(int id, String brand, String model, String color, int numDoors, String engine, int height) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.numDoors = numDoors;
        this.engine = engine;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", numDoors=" + numDoors +
                ", engine='" + engine + '\'' +
                ", height=" + height +
                '}';
    }
}
