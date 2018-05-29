package pokemon.model;

public class Growlithe extends Pokemon implements Fire
{
	public Growlithe ()
	{
		super(58, "Growlithe");
		setup();
	}
	
	public Growlithe (String name)
	{
		super(58, name);
		setup();
	}
	
	public Growlithe (int number, String name)
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