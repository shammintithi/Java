class Employee{
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + "is working.");
    }

    public double calculateBonus(double performanceScore){
        return salary * performanceScore * 0.1;
    }

}

class Manager extends Employee {
    int teamSize;
    String department;

    public Manager(String name, int id, double salary,int teamSize, String department){
        super (name, id, salary);
        this.teamSize = teamSize;
        this.department = department;
    }

    @Override
    public void work(){
        System.out.println(name + "is managing the " + department + "department and leading a team of " + teamSize);
    }

    public void evaluateTeam(double performanceScore){
        System.out.println(name + "is evaluating the team in " + department + "department with a score of " + performanceScore);
    }
    public void conductMeeting(){
        System.out.println(name + "is conducting the meeting in " + department + "team");
    }

}

class Director extends Manager {
    int numOfDept;

    public Director(String name, int id, double salary,int teamSize, String department, int numOfDept) {
        super(name, id, salary, teamSize, department);
        this.numOfDept = numOfDept;
    }
        @Override
        public void work(){
            System.out.println(name + " is setting company strategy and overseeing " + numOfDept + " departments.");
        }


        public void companyStrategy(String strategy){
            System.out.println(name + " is setting the company strategy to: " + strategy);
        }
        public void evaluateManager(Manager mgr, double performanceScore){
            System.out.println(name + " is evaluating manager " + mgr.name + " with a performance score of " + performanceScore);
        }
}

public class EmployeeManageSys{
    public static void main(String[] args){
        Employee emp = new Employee("Alice", 101, 50000);
        emp.work();
        System.out.println("Bonus for Alice: " + emp.calculateBonus(0.7));

        Manager manager = new Manager("Bob", 102, 70000, 5, "Sales");
        manager.work();
        manager.evaluateTeam(0.8);
        manager.conductMeeting();
        System.out.println("Bonus for Bob: " + manager.calculateBonus(0.8));

        Director director = new Director("Carol", 103, 100000, 10, "Corporate", 3);
        director.work();
        director.companyStrategy("Expand Market Share");
        director.evaluateManager(manager, 0.90);
        System.out.println("Bonus for Carol: " + director.calculateBonus(1.0));

    }
}