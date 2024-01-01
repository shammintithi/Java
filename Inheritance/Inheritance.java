//parent class
class Dessert {
    String name;

    //constructor
    Dessert (String name) {
        this.name = name; //variable assign kra.
    }

    //method
    void eat(){
        System.out.println(name + " loved it.");
    }
}
//subclass (child class) 
class Pudding extends Dessert{
    Boolean sweetness;
    int time;
//constructor
    Pudding (String name, Boolean sweetness, int time) {
        super(name); //parent er kache info pass kra cz already implementd the fuctionalities
        this.sweetness = sweetness; 
        this.time = time;
    }
    void cooking_time(){
        System.out.println(name + " needs " + time + " minutes");
        System.out.println(name + " sweetness overloaded.");
    }
}
class Inheritance {
    public static void main(String[] args){
        // //superclass or parent class
        // Dessert Dessert = new Dessert("Blueberies ");
        // Dessert.eat();

        //child class or subclass
        Pudding pudding = new Pudding("Blueberries", true, 30);
        pudding.eat();
        pudding.cooking_time();
    }
}
