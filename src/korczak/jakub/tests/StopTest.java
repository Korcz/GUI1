package korczak.jakub.tests;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import korczak.jakub.vehicles.Bus;
import korczak.jakub.vehicles.Tram;
import korczak.jakub.vehicles.Vehicle;
import korczak.kuba.transport.Stop;

public class StopTest
{
	@Test
	public void stopTest1()
	{
		Bus bus1 = new Bus("Solaris", 1990, 12, 22, 40000, true, false, 200, "Oil");
		Bus bus2 = new Bus("Solaris2", 1990, 12, 22, 40000, true, false, 200, "Oil");
		Bus bus3 = new Bus("Solaris3", 1990, 12, 22, 40000, true, false, 200, "Oil");
		

		Tram tr1 = new Tram("Mercedes", 1966, 6, 12, 500000, true, false);
		Tram tr2 = new Tram("Mercedes2", 1966, 6, 12, 500000, true, false);
		Tram tr3 = new Tram("Mercedes3", 1966, 6, 12, 500000, true, false);
		
		List<Vehicle> vehList = new ArrayList<>();
		vehList.add(tr1);
		vehList.add(tr2);
		vehList.add(bus1);
		
		Stop st1 = new Stop("Centrl Park", vehList);
		

		List<Vehicle> vehList2 = new ArrayList<>();
		vehList2.add(bus2);
		vehList2.add(bus3);
		
		Stop st2 = new Stop("Centrl Park", vehList2);
		
		assertNotNull("Null", st1.getVehList());
		assertTrue("Wrong", st1.isJunction());
		assertFalse("Wrong", st2.isJunction());
		assertNotEquals("Blad", st1.getName(), st2.getName());

	}
}
