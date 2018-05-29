package pokemon.model;

public class Snorlax extends Pokemon implements Normal
{
	public Snorlax ()
	{
		super(143, "Snorlax");
		setup();
	}
	
	public Snorlax (String name)
	{
		super(143, name);
		setup();
	}
	
	public Snorlax (int number, String name)
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