public class Bicycle{
    String name;
    int age;
    boolean paper;
    int cc;

    public Bicycle(String name, int age, boolean paper, int cc){
        this.name = name;
        this.age = age;
        this.paper = paper;
        this.cc = cc;

        class TwoWheeler extends Bicycle{
            boolean paddleOrbattery;

            public TwoWheeler(String name, int age, boolean paper, int cc, boolean paddleOrbattery){
                super(name, age, paper, cc);
                this.paddleOrbattery = paddleOrbattery;
            }

            void bill(){
                System.out.println(name + "Different bill");
            }
        }
    }
    class ThreeWheeler extends Bicycle{
        boolean meterOrNegotiable;

        public ThreeWheeler(String name, int age, boolean paper, int cc, boolean meterOrNegotiable){
            super(name, age, paper, cc);
            this.meterOrNegotiable = meterOrNegotiable;
        }

        void time() {
            System.out.println("Reached!");
        }
    }
    public static void main(String[] args){
        Bicycle twoWheeler1 = new Bicycle("hasan ", 20 , true , 2324);

        System.out.println("Name: " + twoWheeler1.name + "Age: " + twoWheeler1.age + "Paper: " + twoWheeler1.paper + "cc: " + twoWheeler1.cc);
        
        System.out.println("Starting");
        System.out.println("Not reached!");
        
    }
}