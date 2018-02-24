package city;

import processing.core.PApplet;

public class City 
{
	private PApplet parent;
	public int population, farms, size, houses, geography, jobs;
	
	public City(int pop, int farm, int sz, int house, int geo, int job)
	{
		population = pop;
		farms = farm;
		size = sz;
		houses = house;
		geography = geo;
		jobs = job;
	}
	
	public int getJobs()
	{
		return jobs;
	}
	
	public int getGeo()
	{
		return geography;
	}
	
	public int getHouses()
	{
		return houses;
	}
	
	public int getPop()
	{
		return population;
	}
	
	public int getFarms()
	{
		return farms;
	}
	
	public int getSize()
	{
		return size;
	}
}





