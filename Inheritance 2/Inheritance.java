//parent class
class Pizza{
    String name;

    //constructor
    Pizza(String name){
        this.name = name;
    }

    //method
    void type(){
        System.out.println(name + "most populer. ");
    }
}
//subclass
class Burger extends Pizza {
    Boolean spicy;
    int time;
    Burger(String name, Boolean spicy, int time){
        super(name);
        this.spicy = spicy;
        this.time = time;
    }
    void cooking_time(){
        System.out.println(name + " needs " + time + " minutes for bake.");
        System.out.println(name + "is more than spicy");
    }
}

class Inheritance{
    public static void main(String[] args){
        Burger obj = new Burger("Peparoni Pizza ", true, 15);
        obj.type();
        obj.cooking_time();
    }
}