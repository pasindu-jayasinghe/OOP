package Inheritance;

public class Dog extends Animal{

    private String breed;

    public Dog(String name, int age, String bread) {
        super(name, age);
        this.breed = bread;
    }

    // Getter method
    public String getBreed() {
        return breed;
    }

    // Override the makeSound method in the parent class
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Additional method specific to Dog class
    public void wagTail() {
        System.out.println("Tail wagging happily!");
    }
}
