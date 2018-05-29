package pokemon.model;

public class Scyther extends Pokemon implements Bug, Flying
{
	public Scyther ()
	{
		super(123, "Scyther");
		setup();
	}
	
	public Scyther (String name)
	{
		super(123, name);
		setup();
	}
	
	public Scyther (int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(1);
		this.setCanEvolve(false);
		this.setHealthPoints(1);
	}
}
