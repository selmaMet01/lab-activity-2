public class Main {
   public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
   }

    public static void main(String[] args) {
       // DEMO 1: A parent reference can refer to a child object.
        System.out.println("=== 1. Parent Reference ===");
        Vehicle vehicle = new Car("Mazda", "CX-5", 2022, 4);
        vehicle.displayInfo();
        System.out.println();
        
        vehicle = new Motorcycle("Honda", "Beat", 2023, "Gas");
        vehicle.displayInfo();
        System.out.println();
    
       // DEMO 2: Method Parameter
        System.out.println("=== 2. Method Parameter ===");
        Car car = new Car("Ford", "Ranger", 1983, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "Click", 2022, "Gas");
        Truck truck = new Truck("Isuzu", "Elf", 2020, 6);

        printDetails(car);
        printDetails(motorcycle);
        printDetails(truck);

       // DEMO 3: Polymorphic Array
        System.out.println("\n=== 3. Polymorphic Array ===");

        Vehicle[] vehicles = {
            new Car("Mazda", "3", 2024, 4),
            new Motorcycle("KTM", "Duke", 2023, "Gas"),
            new Truck("Fuso", "Canter", 2022, 6)
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            System.out.println();
        }
    }
}