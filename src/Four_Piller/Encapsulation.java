package Four_Piller;
public class Encapsulation {
    public static void main(String[] args) {
        Car car=new Car();
        car.color="Blue";
        //car.speed=50;
        car.brand="Tata";
       // car.year=2020;
        car.model="Safari";



        car.setSpeed(60);

        car.accelerate(2);
        System.out.println("Car speed now: "+car.getSpeed());
        System.out.println("Car Model: "+car.model);


    }

}

 class Car{
    String color;
    String brand;
   String model;
   private int speed;
   private int year;


     public void setSpeed() {
         setSpeed();
     }



     public int getYear() {
         return year;
     }

     public void setYear(int year) {
         this.year = year;
     }

     public int getSpeed() {
         return speed;
     }

     public void setSpeed(int speed) {
         this.speed = speed;
     }

     public String getModel() {
         return model;
     }

     public void setModel(String model) {
         this.model = model;
     }

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public String getBrand() {
         return brand;
     }

     public void setBrand(String brand) {
         this.brand = brand;
     }

     public void accelerate(int increment){
        speed+= increment;

    }

    public void brake(int decrement){
        speed-= decrement;

    }


}
