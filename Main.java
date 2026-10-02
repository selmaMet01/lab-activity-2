public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Mitsubishi", "Lancer", 1973);

        v1.displayInfo();
        System.out.println("Brand: " + v1.getBrand());
        System.out.println("Model: " + v1.getModel());
        System.out.println("Year: " + v1.getYear());
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());
        System.out.println();

        Vehicle v2 = new Vehicle("Honda", "Civic", 1972);

        v2.displayInfo();
        System.out.println("Brand: " + v2.getBrand());
        System.out.println("Model: " + v2.getModel());
        System.out.println("Year: " + v2.getYear());
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage: " + v2.isVintage());
        System.out.println();

        Vehicle v3 = new Vehicle("Ford", "Ranger", 1983);

        v3.displayInfo();
        System.out.println("Brand: " + v3.getBrand());
        System.out.println("Model: " + v3.getModel());
        System.out.println("Year: " + v3.getYear());
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage: " + v3.isVintage());
        System.out.println();

        System.out.println("setYear(2000): " + v1.setYear(2000));
        System.out.println("Stored year: " + v1.getYear());
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());
        System.out.println();

        System.out.println("setYear(1885): " + v1.setYear(1885));
        System.out.println("Stored year: " + v1.getYear());
        System.out.println();

        System.out.println("setYear(2027): " + v1.setYear(2027));
        System.out.println("Stored year: " + v1.getYear());
        System.out.println();

        Vehicle v4 = new Vehicle("BMW", "M3", 1885);
        System.out.println("New vehicle with year 1885: " + v4.getYear());

        Vehicle v5 = new Vehicle("Nissan", "Silvia", 2027);
        System.out.println("New vehicle with year 2027: " + v5.getYear());
    }
}