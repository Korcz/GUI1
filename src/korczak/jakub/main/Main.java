package korczak.jakub.main;

import java.util.ArrayList;
import java.util.List;

import korczak.jakub.drivers.Driver;
import korczak.jakub.vehicles.Bus;
import korczak.jakub.vehicles.Tram;
import korczak.jakub.vehicles.Vehicle;
import korczak.kuba.transport.Stop;

public class Main
{

	public static void main(String[] args)
	{
		Driver dr1 = new Driver("Michael", "Jackson", 1958, 8, 29, 2009, 6, 25, null);
		System.out.println(dr1.toString());
		System.out.println("------------------");

		Bus bus1 = new Bus("Solaris", 1990, 12, 22, 40000, true, false, 200, "Oil");
		Bus bus2 = new Bus("Solaris2", 1990, 12, 22, 40000, true, false, 200, "Oil");
		Bus bus3 = new Bus("Solaris3", 1990, 12, 22, 40000, true, false, 200, "Oil");
		System.out.println(bus1.toString());
		System.out.println("------------------");

		Tram tr1 = new Tram("Mercedes", 1966, 6, 12, 500000, true, false);
		Tram tr2 = new Tram("Mercedes2", 1966, 6, 12, 500000, true, false);
		Tram tr3 = new Tram("Mercedes3", 1966, 6, 12, 500000, true, false);
		System.out.println(tr1.toString());
		System.out.println("-------------------");

		Stop st1 = new Stop("Centrl Park");
		System.out.println(st1.toString());

		Stop st2 = new Stop("Centrl Park");
		System.out.println(st2.toString());
		

	}

}
