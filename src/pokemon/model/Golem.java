package pokemon.model;

public class Golem extends Graveler
{
	public Golem ()
	{
		super(76, "Golem");
		setup();
	}
	
	public Golem (String name)
	{
		super(76, name);
		setup();
	}
	
	public Golem (int number, String name)
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