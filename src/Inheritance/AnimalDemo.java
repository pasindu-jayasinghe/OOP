package Inheritance;

public class AnimalDemo {
    public static void main(String[] args) {
        // Create an instance of the Animal class
        Animal genericAnimal = new Animal("Generic Animal", 5);

        // Accessing methods of the parent class
        System.out.println("Name: " + genericAnimal.getName());
        System.out.println("Age: " + genericAnimal.getAge());
        genericAnimal.makeSound();

        System.out.println();

        // Create an instance of the Dog class
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");

        // Accessing methods of both parent and child class
        System.out.println("Name: " + myDog.getName());
        System.out.println("Age: " + myDog.getAge());
        System.out.println("Breed: " + myDog.getBreed());
        myDog.makeSound();
        myDog.wagTail();
    }
}
