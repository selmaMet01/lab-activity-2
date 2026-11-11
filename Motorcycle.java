public class Motorcycle extends Vehicle implements Serviceable {
    private String EngineType;

    public Motorcycle(String brand, String model, int year, String engineType) {
        super(brand, model, year);
        this.EngineType = engineType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Type: " + EngineType);
    }
   
    @Override
    public void moveForward() {
        System.out.println("Motorcycle goes forward");
    }

    @Override
    public void service() {
        System.out.println("Motorcycle: inspect tires and brakes.");
    }
}
