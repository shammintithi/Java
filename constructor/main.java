class vehicle{
    String vehiclename;
    vehicle(){
        System.out.println("Non-Parameterized Constructor");
    }
    vehicle(String n){
        this.vehiclename = n;
        System.out.println("Parameterized Constructor");
        System.out.println("Vehicle Name: " + vehiclename);
    }
}

public class main{
    public static void main(String[] args){
        vehicle vehicle1 = new vehicle();
        vehicle vehicle2 = new vehicle("car");
    }
}