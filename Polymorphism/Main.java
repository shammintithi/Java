class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Subclass 1
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }

    // Dog-specific method
    public void wagTail() {
        System.out.println("Wagging tail");
    }
}

// Subclass 2
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }

    public void purr() {
        System.out.println("Purring");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); 
        cat.makeSound();
    }
}