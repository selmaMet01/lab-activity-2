public class Truck extends Vehicle {
    private int numberofWheels;

    public Truck(String brand, String model, int year, int numbofWheels) {
        super(brand, model, year);
        this.numberofWheels = numbofWheels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of wheels: " + numberofWheels);
    }
    
    @Override
    public void moveForward() {
        System.out.println("Truck moves ahead");
    }

    @Override
    public void moveBackwards() {
        System.out.println("Truck moves back");
    }

    @Override
    public void moveLeft() {
        System.out.println("Truck turns left");
    }

    @Override
    public void moveRight() {
        System.out.println("Truck turns right");
    }
}
