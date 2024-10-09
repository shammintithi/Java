abstract class Shape{
    abstract void draw();
    abstract void resize();
}

class Circle extends Shape{

    void draw(){
        System.out.println("drawing a circle");
    }

    void resize(){
        System.out.println("resizing the circle");
    }
}
class Rectangle extends Shape{

    void draw(){
        System.out.println("drawing a rectangle");
    }

    void resize(){
        System.out.println("resizing the rectangle");
    }
}
public class Main{
    public static void main(String[] args){
        Shape circle = new Circle();
        circle.draw();
        circle.resize();

        Shape rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();
    }
}
