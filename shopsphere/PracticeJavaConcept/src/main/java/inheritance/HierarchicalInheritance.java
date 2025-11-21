package inheritance;



class Shape
{
    void area()
    {
        System.out.println("area of Shape");
    }
}

class Rectangle extends Shape
{
    void areaOfRectangle()
    {
        System.out.println("area of rectangle");
    }
}
class Circle extends Shape
{
    void areaOfCircle()
    {
        System.out.println("area of circle");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.area();
        r.areaOfRectangle();
        Circle c=new Circle();
        c.area();
        c.areaOfCircle();


    }
}
