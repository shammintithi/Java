import java.util.Scanner;
//import java.util *;

class bevarages{
    String bevaragesName;
    
    bevarages(){
        System.out.println("Non-Parameterizzed Constructor");
    }
    bevarages(String name){
        this.bevaragesName = name;
        System.out.println("Parameterized Constructor");
        System.out.println("Name of the bevarages: " + bevaragesName);
    }
}

public class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        bevarages obj1 = new bevarages();
        System.out.print("Bevarages Name: ");
        String name = input.nextLine();

        bevarages obj2 = new bevarages(name);

        input.close();  
    }
}