package inheritance;





class Animal
{
    void eat()
    {
        System.out.println("Animal eat");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog Barking");
    }
}


public class SingleLevelInheritance {

    public static void main(String[] args) {
       Dog d=new Dog();
       d.bark();
       d.eat();

    }



}
