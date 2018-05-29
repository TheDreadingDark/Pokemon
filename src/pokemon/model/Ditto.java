package pokemon.model;

public class Ditto extends Pokemon implements Normal
{
	public Ditto ()
	{
		super(132, "Ditto");
		setup();
	}
	
	public Ditto (String name)
	{
		super(132, name);
		setup();
	}
	
	public Ditto (int number, String name)
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