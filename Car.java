public class Car extends Vehicle implements Serviceable {
    private int numberofDoors;

    public Car(String brand, String model, int year, int numbofDoors) {
        super(brand, model, year);
        this.numberofDoors = numbofDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberofDoors);
    }
   
   @Override
    public void moveForward() {
        System.out.println("Car moves forward");
    }

    @Override
    public void service() {
        System.out.println("Car: check oil and brakes.");
    }
}
