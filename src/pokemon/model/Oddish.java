package pokemon.model;

public class Oddish extends Pokemon implements Grass, Poison
{
	public Oddish ()
	{
		super(43, "Oddish");
		setup();
	}
	
	public Oddish (String name)
	{
		super(43, name);
		setup();
	}
	
	public Oddish (int number, String name)
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