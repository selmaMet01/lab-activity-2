public class Truck extends Vehicle implements Serviceable {
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
        System.out.println("Truck moves ahead.");
    }

    @Override
    public void service() {
        System.out.println("Truck: inspect cargo brakes.");
    }
}
