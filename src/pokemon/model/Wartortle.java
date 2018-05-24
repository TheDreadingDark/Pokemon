package pokemon.model;

public class Wartortle extends Squirtle
{
	public Wartortle()
	{
		super(8, "Wartortle");
		setup();
	}
	
	public Wartortle(String name)
	{
		super(8, name);
		setup();
	}
	
	public Wartortle(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(1);
		this.setCanEvolve(true);
		this.setHealthPoints(1);
	}
}
