public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand != null && !brand.isEmpty() ? brand : "default";
        this.model = model != null && !model.isEmpty() ? model : "default";
        this.engineVolume = engineVolume > 0 ? engineVolume : 1.5;
        this.color = color != null && !color.isEmpty() ? color : "white";
        this.year = year > 0 ? year : 2000;
        this.country = country != null && !country.isEmpty() ? country : "default";
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }
}
