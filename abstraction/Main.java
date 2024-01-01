//100% abstract class 3-5
//abstract class
abstract class Student {
    abstract void name(); //abstract method
    
    void id(){
        System.out.println("Non-abstract method");
    }
}

class Tithi extends Student {
    //@override
    void name(){
        System.out.println("Hi! I'm Tithi");
    }
}

class Shammin extends Student {
    //@override
    void name(){
        System.out.println("Hi! I'm Shammin");
    }
}

//main class
public class Main {
    public static void main (String[] args)
    {
        Student st; //reference variable
        st = new Tithi(); //object of Class tithi
        st.name(); //call abstract method of class tithi

        st = new Shammin(); //object of Class shammin
        st.name(); //call abstract method of class shammin
    }
}