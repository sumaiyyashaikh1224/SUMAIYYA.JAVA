abstract class vehicle{
   abstract void start();

}
  class car extends vehicle{
    @Override
    void start(){
      System.out.println("car is starting.....");
    }
    void drive(){
      System.out.println("car is driving");
    }


  } 

public class Singlelnheritance {

  public static void main(String[] args) {
    car car = new car();
    car.start();
    car.drive();
  }


}


