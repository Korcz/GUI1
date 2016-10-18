package korczak.jakub.vehicles;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;

import korczak.kuba.transport.Stop;

public abstract class Vehicle
{
	private String nameOfProducers;
	private LocalDate dateOfManufacture;
	private double mileage;
	private boolean isALowFloorVehicle;
	private boolean isAnArticulatedVehicle;
	private int ageOfVehicle;
	
	private HashMap<Vehicle, Stop> lineTrans;
	
	

	public Vehicle(String nameOfProducers, int year, int month, int dayOfMonth, double mileage,
			boolean isALowFloorVehicle, boolean isAnArticulatedVehicle)
	{
		this.nameOfProducers = nameOfProducers;
		this.dateOfManufacture = LocalDate.of(year, month, dayOfMonth);
		this.mileage = mileage;
		this.isALowFloorVehicle = isALowFloorVehicle;
		this.isAnArticulatedVehicle = isAnArticulatedVehicle;
		this.ageOfVehicle = setAgeOfVehicle();
	}

	public String getNameOfProducers()
	{
		return nameOfProducers;
	}

	public void setNameOfProducers(String nameOfProducers)
	{
		this.nameOfProducers = nameOfProducers;
	}

	public LocalDate getDateOfManufacture()
	{
		return dateOfManufacture;
	}

	public void setDateOfManufacture(LocalDate dateOfManufacture)
	{
		this.dateOfManufacture = dateOfManufacture;
	}

	public double getMileage()
	{
		return mileage;
	}

	public void setMileage(double mileage)
	{
		this.mileage = mileage;
	}

	public boolean isALowFloorVehicle()
	{
		return isALowFloorVehicle;
	}

	public void setALowFloorVehicle(boolean isALowFloorVehicle)
	{
		this.isALowFloorVehicle = isALowFloorVehicle;
	}

	public boolean isAnArticulatedVehicle()
	{
		return isAnArticulatedVehicle;
	}

	public void setAnArticulatedVehicle(boolean isAnArticulatedVehicle)
	{
		this.isAnArticulatedVehicle = isAnArticulatedVehicle;
	}

	public int getAgeOfVehicle()
	{
		return ageOfVehicle;
	}

	public int setAgeOfVehicle()
	{
		LocalDate currentDate = LocalDate.now();
		if (dateOfManufacture != null)
		{
			return Period.between(dateOfManufacture, currentDate).getYears();
		} else
		{
			return 0;
		}
	}

	public void setAgeOfVehicle(int ageOfVehicle)
	{
		this.ageOfVehicle = ageOfVehicle;
	}

	@Override
	public String toString()
	{
		String show = "Producer: " + getNameOfProducers() + "\nMilage: " + getMileage() + " ";
		show += "Date of manufacturer:[" + dateOfManufacture.toString() + "] ";
		show += (isALowFloorVehicle == true) ? "Low Floor Vehicle = YES, " : "Low Floor Vehicle = NO, ";
		show += (isAnArticulatedVehicle == true) ? "Articulated Vehicle = YES.\n" : "Articulated Vehicle = NO.\n";
		show += "Age of vehicle: " + getAgeOfVehicle() + " years.";
		return show;
	}

}
