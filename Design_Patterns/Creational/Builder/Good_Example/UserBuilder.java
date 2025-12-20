package Design_Patterns.Creational.Builder.Good_Example;

public class UserBuilder {
    private final String name;
    private int age;
    private int phone;

    public UserBuilder(String name) {
        this.name = name;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder phone(int phone) {
        this.phone = phone;
        return this;
    }

    public GoodUser build() {
        return new GoodUser(name, age, phone);
    }
}
