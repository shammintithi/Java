import java.util.Scanner;

interface BMI{
    double calculateBMI();
    String getBMICategory();
}

abstract class Person implements BMI{
    double weight;
    double height;

    public Person(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double calculateBMI(){
        return weight / (height * height);
    }

}

class Adult extends Person {
    public Adult(double weight, double height) {
        super(weight, height);
    }

    @Override
    public String getBMICategory(){
        double bmi = calculateBMI();

        if(bmi < 18.5){
            return "Underweight";
        }
        else if (bmi >= 18.5 && bmi < 24.9){
            return "Normal Weight";
        }
        else if (bmi >= 25 && bmi < 29.9){
            return "Overweight";
        }
        else{
            return "Obesity";
        }
    }
}
class Child extends Person {
    public Child(double weight, double height) {
        super(weight, height);
    }

     @Override
    public String getBMICategory(){
        double bmi = calculateBMI();

        if(bmi < 14){
            return "Underweight";
        }
        else if (bmi >= 14 && bmi < 18 ){
            return "Normal Weight";
        }
        else if (bmi >= 18 && bmi < 22){
            return "Overweight";
        }
        else{
            return "Obesity";
        }
    }
}

public class BMICalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter weight(kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height(meters) or enter 0 for height (feet) : ");
        double height = sc.nextDouble();

        double heightInMeters;
        double heightInFeet = 0;

        if(height == 0) {
            System.out.print("Enter height in feet: ");
            heightInFeet = sc.nextDouble();
            heightInMeters = heightInFeet * 0.3048;
        }
        else {
            heightInMeters = height;
            heightInFeet = height / 0.3048;
        }

        BMI person;

        if (age >= 18){
            person = new Adult(weight, height);
            System.out.println("Classified as an adult.");
        }
        else {
            person = new Child(weight, height);
            System.out.println("Classified as an child/teenage.");
        }

        display(person, heightInMeters, heightInFeet);
    }
    public static void display(BMI person, double heightInMeters, double heightInFeet){
        System.out.println("BMI: " + person.calculateBMI());
        
        System.out.println("Category: " + person.getBMICategory());
    }
}