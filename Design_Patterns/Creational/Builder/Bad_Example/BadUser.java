package Design_Patterns.Creational.Builder.Bad_Example;

public class BadUser {
    private String name;
    private int age;
    private int phone;

    public BadUser(String name, int age, int phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }
}
