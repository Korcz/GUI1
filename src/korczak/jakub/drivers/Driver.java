package korczak.jakub.drivers;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Driver
{
	private String firstName;
	private String surname;
	private LocalDate birthDate;
	private LocalDate licenceAwarded;
	private int age;
	
	private String job; //bus or term driver.

	public Driver(String firstName, String surname, int year, int month, int day, int year2, int month2, int day2, String job)
	{
		this.firstName = firstName;
		this.surname = surname;
		this.birthDate = LocalDate.of(year, month, day);
		this.licenceAwarded = LocalDate.of(year2, month2, day2);
		this.age = setAge();
		this.job = job;
	}
	/*public Driver()
	{
		System.out.println("Podaj imie kierowcy");
		Scanner sc = new Scanner(System.in);
		firstName = sc.nextLine();
		setFirstName(firstName);
		System.out.println("Podaj nazwisko kierowcy");
		surname = sc.nextLine();
		setSurname(surname);
		System.out.println("Podaj date urodzenia");
		System.out.println("Podaj rok");
		int rok = Integer.parseInt(sc.nextLine());
		System.out.println("Podaj miesi¹c");
		int miesiac = Integer.parseInt(sc.nextLine());
		System.out.println("Podaj dzieñ");
		int dzien = Integer.parseInt(sc.nextLine());
		setBirthDate(LocalDate.of(rok, miesiac, dzien));
		System.out.println("Podaj date otrzymania licencji");
		System.out.println("Podaj rok");
		int rok2 = Integer.parseInt(sc.nextLine());
		System.out.println("Podaj miesi¹c");
		int miesiac2 = Integer.parseInt(sc.nextLine());
		System.out.println("Podaj dzieñ");
		int dzien2 = Integer.parseInt(sc.nextLine());
		setLicenceAwarded(LocalDate.of(rok2,  miesiac2, dzien2));
		age = setAge();
		
		System.out.println("Podaj zawod(Wybierz 1 lub 2): \n1.Tram driver\n2.Bus driver");
		int x = Integer.parseInt(sc.nextLine());
		
		switch (x)
		{
		case 1:
			job = "Bus driver";
			break;
		case 2:
			job = "Tram driver";
			break;
		default:
			System.out.println("Zly numer");
			break;
		}
	}
	*/

	


	public String getFirstName()
	{
		return firstName;
	}


	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}


	public String getSurname()
	{
		return surname;
	}


	public void setSurname(String surname)
	{
		this.surname = surname;
	}


	public LocalDate getBirthDate()
	{
		return birthDate;
	}


	public void setBirthDate(LocalDate birthDate)
	{
		this.birthDate = birthDate;
	}


	public LocalDate getLicenceAwarded()
	{
		return licenceAwarded;
	}


	public void setLicenceAwarded(LocalDate licenceAwarded)
	{
		this.licenceAwarded = licenceAwarded;
	}


	public String getJob()
	{
		return job;
	}

	public void setJob(String job)
	{
		this.job = job;
	}
	
	public int getAge()
	{
		return age;
	}

	public int setAge()
	{
		LocalDate currentDate = LocalDate.now();
		if ((birthDate != null) && (currentDate != null))
		{
			return Period.between(birthDate, currentDate).getYears();
		} else
		{
			return 0;
		}
	}

	@Override
	public String toString()
	{
		return "Driver: First name: " + firstName + ", surname: " + surname + ", birth date: " + birthDate
				+ "\nLicence awarded: " + licenceAwarded + ", age: " + age + "\nJob: " + job + ".";
	}

	
}
