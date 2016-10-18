package korczak.kuba.transport;

import java.util.List;

import korczak.jakub.vehicles.Vehicle;

public class Line
{
	
	private List<Stop> stops;
	private String lineName;
	
	
	public List<Stop> getStops()
	{
		return stops;
	}
	public void setStops(List<Stop> stops)
	{
		this.stops = stops;
	}
	public String getLineName()
	{
		return lineName;
	}
	public void setLineName(String lineName)
	{
		this.lineName = lineName;
	}

	
	
}
