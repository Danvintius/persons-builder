import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected static int age;
    protected static String address;
    //...

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName(String name) {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static int getAge() {
        return age;
    }

    public static String getAddress() {
        return address;
    }

    public boolean hasAge() {
        return age >= 0;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public int happyBirthday() {
        return age++;
    }

    @Override
    public String toString() {
        return name + surname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

    public PersonBuilder newChildBuilder() { /*...*/ }
}
