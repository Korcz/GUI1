package korczak.kuba.transport;

import java.util.List;

import korczak.jakub.vehicles.Tram;
import korczak.jakub.vehicles.Vehicle;

public class Stop
{
	private String name;
	private boolean isJunction;
	private List<Vehicle> vehList;
	private static long ID = 1;

	public Stop(String name)
	{
		this.name = name + "-" + ID++;
		this.isJunction = isJunction();
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	

	public List<Vehicle> getVehList()
	{
		return vehList;
	}

	public void setVehList(List<Vehicle> vehList)
	{
		this.vehList = vehList;
	}

	@Override
	public String toString()
	{
		return name;
	}

	public boolean isJunction()
	{
		int tramNumb = 0;
		int busNumb = 0;
		for (Vehicle vehicle : vehList)
		{
			if (vehicle.getClass() == Tram.class)
			{
				tramNumb++;
			} else
			{
				busNumb++;
			}
		}
		
		if (tramNumb != 0 && busNumb != 0)
		{
			return true;
		}
		else {
			return false;
		}
	}

}
