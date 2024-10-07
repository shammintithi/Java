public class Student{
    private String name;
    private int age;
    private String number;

    public Student(String name, int age, String number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNumber() {
        return number;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String toString() {
        return("Student name " + this.getName() + " age " + this.getAge() + " number " + this.getNumber());
    }

    public static void main(String[] args){
        Student student = new Student("Tithi", 28, "5476565778");

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getNumber());
    }
}