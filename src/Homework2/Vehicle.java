package Homework2;

public class Vehicle {

    static double default_Fuel_Consumption = 1.25;
    double fuelConsumption;
    double fuel;
    int horspower;

    public Vehicle(double fuel, int horspower){
        setFuel(fuel);
        setHorsepower(horspower);
        setFuelConsumption(fuelConsumption);
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption(){
        return fuelConsumption;
    }

    private void setHorsepower(int horspower) {
        this.horspower=horspower;
    }
    public int getHorspower(){
      return   horspower;

    }

    private void setFuel(double fuel) {
        this.fuel=fuel;
    }

    public double getFuel(){
        return fuel;
    }

    public double getDefault_Fuel_Consumption(){
        return default_Fuel_Consumption;
    }

    public void drive(double kilometers){
        if (fuel-(fuelConsumption*kilometers/100)>=0){
            System.out.println("drive"+kilometers+"km");
            System.out.println(fuel-(fuelConsumption*kilometers/100) + " fuel left ");
        }
        else {
            System.out.println("not enouth fuel");
            double fuelNeeded = fuelConsumption*kilometers/100;
            double kilometersPeeFuel = kilometers/fuelNeeded;
            double kilometersLeft = (fuelNeeded - fuel)*kilometersPeeFuel;
            System.out.println("drove "+ (kilometers - kilometersLeft)+ " km");
        }
    }
}
