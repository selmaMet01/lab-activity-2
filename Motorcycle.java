public class Motorcycle extends Vehicle {
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
    public void moveBackwards() {
        System.out.println("Motorcycle goes back");
    }

     @Override
    public void moveLeft() {
        System.out.println("Motorcycle turns left");
    }

    @Override
    public void moveRight() {
        System.out.println("Motorcycle turns right");
    }
}
