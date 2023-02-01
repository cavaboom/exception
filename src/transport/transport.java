package transport;
import Utilities.Utilities;
import Drivers.Driver;
import Exception.TransportTypeException;
public abstract class transport <T extends Driver>{
    private String brand;
    private String model;
    private double engineVolume;
    private T driver;

    public transport(String brand, String model, double engineVolume, T driver) {
        this.brand = Utilities.check(brand);
        this.model = Utilities.check(model);
        this.engineVolume = Utilities.check(engineVolume);
        this.driver = driver;
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

    public T getDriver() {
        return driver;
    }

    public void setBrand(String brand) {
        this.brand = Utilities.check(brand);
    }

    public void setModel(String model) {
        this.model = Utilities.check(model);
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Utilities.check(engineVolume);
    }

    public abstract void printType();
    public void start() {
        System.out.println("Начать движение");
    }

    public void stop() {
        System.out.println("Закончить движение");
    }

    public abstract void diagnose() throws TransportTypeException;

    @Override
    public String toString() {
        return brand + " " + model + " " + engineVolume;
    }
}
