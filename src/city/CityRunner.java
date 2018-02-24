package city;

import processing.core.PApplet;

public class CityRunner extends PApplet
{
	int amount = 15;
	City[] cities = new City[amount];
			
	public static void main(String[] args)
	{
		PApplet.main("city.City");
	}
	
	public void settings()
	{
		size(1800, 900);
	}
	
	public void setup()
	{
		for(int i = 0; i < amount; i++)
		{
			cities[i] = City(/* put stuff here*/ );
		}
	}
	
	public void draw()
	{
		
	}
}
