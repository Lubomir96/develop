package Homework2;

public class SportCar extends  Vehicle {
    static double default_Fuel_Consumption = 10;

    public SportCar(double fuel, int horsepower) {
        super(fuel, horsepower);
        setFuelConsumption(default_Fuel_Consumption);
    }
}
