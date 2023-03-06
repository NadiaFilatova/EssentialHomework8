package homework.Task5;

public class Task5 {
    public static void main(String[] args) {
        Animal animal = new Animal(" Vaska", 4, true);
        Animal animal1 = new Animal(" Vaska", 367, true);
        System.out.println(animal);
        System.out.println(animal + ", hashCode =  " + animal.hashCode());
        boolean equal = animal.equals(animal1);
        System.out.println(equal);
    }
}
