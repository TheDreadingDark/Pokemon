package pokemon.model;

public class Weezing extends Koffing
{
	public Weezing ()
	{
		super(110, "Weezing");
		setup();
	}
	
	public Weezing (String name)
	{
		super(110, name);
		setup();
	}
	
	public Weezing (int number, String name)
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
