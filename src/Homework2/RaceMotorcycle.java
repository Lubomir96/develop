package Homework2;

public class RaceMotorcycle extends Vehicle {
    static double default_Fuel_Consumption = 8;

    public RaceMotorcycle(double fuel, int horsepower) {
        super(fuel, horsepower);
        setFuelConsumption(default_Fuel_Consumption);
    }
}
