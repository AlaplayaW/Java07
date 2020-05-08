public abstract class Vehicle {

    // Attributs
    private String brand;
    private int kilometers;

    // Constructeur
    public Vehicle(String brand) {
        this.brand = brand;
        this.kilometers = 0;
    }

    // Methode abstraite
    public abstract String doStuff();

    // Getters
    public String getBrand() {
        return this.brand;
    }
    public int getKilometers() {
        return this.kilometers;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
}