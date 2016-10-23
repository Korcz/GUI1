package korczak.jakub.tests;
import static org.junit.Assert.*;

import org.junit.Test;

import korczak.jakub.vehicles.Bus;
import korczak.jakub.vehicles.Tram;

public class VehTest
{
	@Test
	public void tetsBus1()
	{
		Bus bus1 = new Bus("Solaris", 1990, 12, 22, 40000, true, false, 200, "Oil");
		Bus bus2 = new Bus("Solaris2", 1989, 12, 22, 40000, true, false, 200, "Oil");
		Bus bus3 = new Bus("Solaris3", 1988, 12, 22, 40000, true, false, 200, "Oil");
		
		Tram tr1 = new Tram("Mercedes", 1966, 6, 12, 500000, true, false);
		Tram tr2 = new Tram("Mercedes2", 1976, 6, 12, 500000, true, false);
		Tram tr3 = new Tram("Mercedes3", 1986, 6, 12, 500000, true, false);


		assertEquals("Nieprawidłowy wiek", 25, bus1.getAgeOfVehicle());
		assertEquals("Nieprawidłowy wiek", 26, bus2.getAgeOfVehicle());
		assertEquals("Nieprawidłowy wiek", 27, bus3.getAgeOfVehicle());
		
		assertEquals("Nieprawidłowy wiek", 50, tr1.getAgeOfVehicle());
		assertEquals("Nieprawidłowy wiek", 40, tr2.getAgeOfVehicle());
		assertEquals("Nieprawidłowy wiek", 30, tr3.getAgeOfVehicle());
		


	}
}
