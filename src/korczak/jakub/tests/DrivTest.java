package korczak.jakub.tests;
import static org.junit.Assert.*;
import org.junit.Test;

import korczak.jakub.drivers.Driver;

public class DrivTest
{
	@Test
	public void driveTest1()
	{
		Driver dr1 = new Driver("Michael", "Jackson", 1958, 8, 29, 2009, 6, 25, null);
		
		assertEquals("Zly wiek", 58, dr1.getAge());

	}
}
