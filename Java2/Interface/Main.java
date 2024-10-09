// Define the interface
interface Animal {
    // Abstract method (no implementation)
    void sound();
    void name();
    void printDetails();
}

// Implementing classes
class Dog implements Animal {
    String food;
    int age;

    Dog(String food, int age) {
        this.food = food;
        age = age;
    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }
    public void name(){
        System.out.println("Dog");
    }

    // Method to print Dog details
    public void printDetails() {
        System.out.println("Food: " + food + ", Age: " + age);
    }
}

class Cat implements Animal {
    String name;
    String food;

    Cat(String name, String food){
        this.name = name;
        this.food = food;
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void name() {
        System.out.println("Cat");
    }
    // Method to print Cat details
    public void printDetails() {
        System.out.println("Name: " + name + ", Food: " + food);
    }
}

public class Main {
    public static void main(String[] args) {
        // Use polymorphism to create objects of classes that implement the interface
        Animal myDog = new Dog("Dog food", 3);
        Animal myCat = new Cat("Mini", "Cat food"); 
        
        // Call methods on the interface
        myDog.sound();  // Output: Woof
        myDog.name(); 
        myDog.printDetails();

        //another method for print details is casting 
        //((Dog)myDog).printDetails();

        myCat.sound();  // Output: Meow
        myCat.name(); 
        myCat.printDetails(); 

        //another method for print details is casting
        //((Cat)myCat).printDetails();
    }
}
