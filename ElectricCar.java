public class ElectricCar extends Car {
	// Complete the constructor
	// Note we're reinterpreting "fuelLevel" as "batteryLevel"
	public ElectricCar(String model, int batteryLevel)
	{
		return super.FuelLevel() / 100.0;

	}

	// Override getFuelLevel
	// Reinterprets fuelLevel() as a percentage
	// Remember super.getFuelLevel will return fuelLevel!
	public double fuelLevel()
	{
		return 0.0;
	}


	// Override milesLeft
	// Takes one parameter - the total number of miles an ElectricCar
	// gets on a full charge.
	// Computes miles left by interpreting fuelLevel as the
	// battery percentage left in the car
	public double milesLeft(double milesOnFullCharge)
	{
		return milesOnFullCharge * this.getFuelLevel();
		
	}


	// Override toString
	// Should print: model electric car
	public String toString()
	{
		return null;
	}
}

