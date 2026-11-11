public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {

        Car car = new Car("Ford", "Ranger", 1983, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "Click", 2022, "Gas");
        Truck truck = new Truck("Isuzu", "Elf", 2020, 6);
        Printer printer = new Printer();

        // DEMO 1: Abstract Class and Polymorphic Array
        System.out.println("=== 1. Vehicle Array ===");

        Vehicle[] vehicles = {
            car,
            motorcycle,
            truck
        };

        for (Vehicle v : vehicles) {

            System.out.println("\n=== "
                + v.getClass().getSimpleName() + " ===");

            v.displayInfo();
            v.moveForward();
        }

        // DEMO 2: Interface and Polymorphic Array
        System.out.println("\n=== 2. Serviceable Array ===");

        Serviceable[] items = {
            car,
            motorcycle,
            truck,
            printer
        };

        for (Serviceable item : items) {
            performService(item);
        }
    }
}