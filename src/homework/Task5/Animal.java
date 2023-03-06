package homework.Task5;

import java.util.Objects;

public class Animal {
    private final String name;
    private final int age;
    private final Boolean tail;

    @Override
    public String toString() {
        return "Ім'я: " + name + '\'' +
                ", вік: " + age +
                ", хвіст: " + tail +
                '"';
    }

    public Animal(String name, int age, Boolean tail) {
        this.age = age;
        this.tail = tail;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(tail, animal.tail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}
