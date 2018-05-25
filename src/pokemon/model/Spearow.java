package pokemon.model;

public class Spearow extends Pokemon implements Normal, Flying
{
	public Spearow ()
	{
		super(21, "Spearow");
		setup();
	}
	
	public Spearow (String name)
	{
		super(21, name);
		setup();
	}
	
	public Spearow (int number, String name)
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
