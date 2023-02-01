package transport;

import Drivers.DriverB;
import Enums.BodyType;
import Enums.VehicleType;
import Interfaces.Competing;
import Exception.TransportTypeException;

public class Car extends transport<DriverB> implements Competing {

    private BodyType bodyType;
    private VehicleType vehicleType;

    public Car(String brand, String model, double engineVolume, DriverB driver, BodyType bodyType, VehicleType vehicleType) {
        super(brand, model, engineVolume, driver);
        this.bodyType = bodyType;
        this.vehicleType = vehicleType;
    }


    public BodyType getBodyType() {
        return bodyType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void start() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " начинает движение");
    }

    public void stop() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " заканчивает движение");
    }

    @Override
    public void diagnose() {
        System.out.println("Провести диагностику автомобиля");
    }


    public void pitStop() {
        System.out.println("Пит-стоп для автомобиля");
    }

    public void bestLapTime() {
        System.out.println("Лучшее время круга " + getBrand() + " " + getModel());
    }

    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel());
    }

    public void printType() {
        if (vehicleType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип транспортного средства " + vehicleType);
        }
    }


    @Override
    public String toString() {
        return "Car: " + bodyType + " " + super.toString();
    }
}


