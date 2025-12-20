package Design_Patterns.Creational.Builder.Good_Example;

public class GoodUser {
    private final String name;
    private final int age;
    private final int phone;

    GoodUser(String name, int age, int phone) {
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
