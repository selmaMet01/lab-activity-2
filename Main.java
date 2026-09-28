public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Mitsubishi","Lancer", 1973);

        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());
        System.out.println();

        Vehicle v2 = new Vehicle("Honda", "Civic", 1972);

        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage: " + v2.isVintage());
        System.out.println();

        Vehicle v3 = new Vehicle("Ford", "Ranger", 1983);

        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage: " + v3.isVintage());
        System.out.println();

   
    }
}