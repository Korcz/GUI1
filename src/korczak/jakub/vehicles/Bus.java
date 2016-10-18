package korczak.jakub.vehicles;
import java.time.LocalDate;
import java.util.Scanner;

public class Bus extends Vehicle
{
	private double engineCapacity;
	private String typeOfFuel;
	
	public Bus(String nameOfProducers, int year, int month, int dayOfMonth, double mileage, boolean isALowFloorVehicle,
			boolean isAnArticulatedVehicle, double engineCapacity, String typeOfFuel)
	{
		super(nameOfProducers, year, month, dayOfMonth, mileage, isALowFloorVehicle, isAnArticulatedVehicle);
		this.engineCapacity = engineCapacity;
		this.typeOfFuel = typeOfFuel;
	}

	public double getEngineCapacity()

	{
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity)
	{
		this.engineCapacity = engineCapacity;
	}
	
	
	public String getTypeOfFuel()
	{
		return typeOfFuel;
	}

	public void setTypeOfFuel(String typeOfFuel)
	{
		this.typeOfFuel = typeOfFuel;
	}

	@Override
	public String toString()
	{
		return super.toString() + "\nEngine Capacity: " + getEngineCapacity() + ".\nType of fuel: " + getTypeOfFuel() + ".";
	}

	
}
