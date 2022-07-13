package Homework2;

public class Car extends Vehicle{
    static double default_Fuel_Consumption = 3;

    public Car(double fuel , int horsepower){
        super(fuel,horsepower);
        setFuelConsumption(default_Fuel_Consumption);
    }
}
