import java.util.ArrayList;

public class Hangar {

    public static void main(String[] args) {
        Boat barquette = new Boat("Barquette");
        Boat paquebot = new Boat("Paquebot");
        Car toyota = new Car("Toyota");
        Car deudeuch = new Car("Deudeuch");


        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(barquette);
        vehicles.add(paquebot);
        vehicles.add(toyota);
        vehicles.add(deudeuch);

        System.out.println("Vehicles list: ");
        // iterate over the list
        for (Vehicle vehicle : vehicles) {
            System.out.println("- " + vehicle.doStuff());
        }
    }

}
