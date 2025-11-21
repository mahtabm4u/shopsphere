package inheritance;
 class Vehicle
 {
     void run()
     {
         System.out.println("Vehicle run");
     }

 }

 class Car extends Vehicle
 {
     void applyBrake()
     {
         System.out.println("Car Stopped");
     }
 }

 class SportsCar extends Car
 {
     void highSpeed()
     {
         System.out.println("Sports Car has High Speed");
     }
 }

/*Animal with method eat()
Dog extends Animal with method bark()
BabyDog extends Dog with method weep()
Create an object of BabyDog and call all three methods.*/
public class MultiLevelInheritance {

    public static void main(String[] args) {
        SportsCar sc=new SportsCar();
        sc.run();
        sc.applyBrake();
        sc.highSpeed();

    }
}
