package Inheritance;

//Parent Class
public class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to make the animal sound
    public void makeSound() {
        System.out.println("Generic animal sound");
    }

}
