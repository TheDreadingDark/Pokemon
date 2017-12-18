package pokemon.model;

public class Torterra extends Grotle implements Ground
{
	public Torterra(int number, String name)
	{
		super (number, name);
	}
	
	public String moveEarthquake()
	{
		return this.getClass().getSimpleName() + " used Earthquake"; 
	}
	
	public String moveFissure()
	{
		return this.getClass().getSimpleName() + " used Fissure";
	}
	
	public String moveSandTomb()
	{
		return this.getClass().getSimpleName() + " used Sand Tomb";
	}
}
