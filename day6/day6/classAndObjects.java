// Class doesn't take space until object is created

class Car {

    // Instance variables
    String color;
    String brand;
    String model;
    int maxSpeed;

    // Constructor
    Car(String color, String brand, String model, int maxSpeed){
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public static void main(String[] args) {

        // Creating object using constructor
        Car car1 = new Car("Black", "Toyota", "Innova", 300);

        System.out.println(car1.brand + " " + car1.model + " " + car1.maxSpeed);
    }
}