package korczak.jakub.vehicles;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Tram extends Vehicle
{
	
	public Tram(String nameOfProducers, int year, int month, int dayOfMonth, double mileage, boolean isALowFloorVehicle,
			boolean isAnArticulatedVehicle)
	{
		super(nameOfProducers, year, month, dayOfMonth, mileage, isALowFloorVehicle, isAnArticulatedVehicle);
	}

	/*public Tram()
	{
		System.out.println("Podaj nazwe marki");
		Scanner sc = new Scanner(System.in);
		String nameOfProducers = sc.nextLine();
		setNameOfProducers(nameOfProducers);
		System.out.println("Podaj rok");
		int rok = Integer.parseInt(sc.nextLine());
		System.out.println("Podaj miesi¹c");
		int miesiac = Integer.parseInt(sc.nextLine());
		System.out.println("Podaj dzieñ");
		int dzien =  Integer.parseInt(sc.nextLine());
		setDateOfManufacture(LocalDate.of(rok, miesiac, dzien));
		System.out.println("Podaj przebieg");
		double mileage = Double.parseDouble(sc.nextLine());
		setMileage(mileage);
		System.out.println("Podaj czy nieskoPodlogowy");
		int niskoPodlogowy = Integer.parseInt(sc.nextLine());
		if (niskoPodlogowy == 1)
		{
			setAlowFloorVehicle(true);
		}
		else
		{
			setAlowFloorVehicle(false);
		}
		System.out.println("Podaj czy przegubowy");
		int czyPrzegubowy = Integer.parseInt(sc.nextLine());
		if (czyPrzegubowy == 1)
		{
			setAnArticulatedVehicle(true);
		}
		else
		{
			setAnArticulatedVehicle(false);
		}
	}*/

}
