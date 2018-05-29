package pokemon.model;

public class Chansey extends Pokemon implements Normal
{
	public Chansey ()
	{
		super(113, "Chansey");
		setup();
	}
	
	public Chansey (String name)
	{
		super(113, name);
		setup();
	}
	
	public Chansey (int number, String name)
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