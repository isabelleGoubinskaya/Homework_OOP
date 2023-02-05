public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany");
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany");
        Car kiaSportage = new Car("Kia", "Sportage 4th generation", 2.4, "red", 2018, "South Korea");
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea");

        System.out.println("Lada Granta:");
        System.out.println("Brand: " + ladaGranta.getBrand());
        System.out.println("Model: " + ladaGranta.getModel());
        System.out.println("Engine Volume: " + ladaGranta.getEngineVolume() + "L");
        System.out.println("Color: " + ladaGranta.getColor());
        System.out.println("Year of Production: " + ladaGranta.getYear());
        System.out.println("Assembly Country: " + ladaGranta.getCountry());

        System.out.println("\nAudi A8:");
        System.out.println("Brand: " + audiA8.getBrand());
        System.out.println("Model: " + audiA8.getModel());
        System.out.println("Engine Volume: " + audiA8.getEngineVolume() + "L");
        System.out.println("Color: " + audiA8.getColor());
        System.out.println("Year of Production: " + audiA8.getYear());
        System.out.println("Assembly Country: " + audiA8.getCountry());

        System.out.println("\nBMW Z8:");
        System.out.println("Brand: " + bmwZ8.getBrand());
    }
}