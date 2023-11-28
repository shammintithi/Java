import java.util.*;

class Vehicle{
    String vehicleName;
    Vehicle(){
        System.out.println("Non parameterized constructor");
    } // non parameterized constructor

    Vehicle(String name){
        this.vehicleName = name;
        System.out.println("Parameterized constructor");
        System.out.println("Vehicle name: " + vehicleName);
    } // parameterized constructor
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle vehicle1 = new Vehicle();

        System.out.print("Enter vehicle name: ");
        String name = sc.nextLine();
        Vehicle vehicle2 = new Vehicle(name);

        sc.close();
    }
}