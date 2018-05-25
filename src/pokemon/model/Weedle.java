package pokemon.model;

public class Weedle extends Pokemon implements Bug, Poison
{
	public Weedle ()
	{
		super(13, "Weedle");
		setup();
	}
	
	public Weedle (String name)
	{
		super(13, name);
		setup();
	}
	
	public Weedle (int number, String name)
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
