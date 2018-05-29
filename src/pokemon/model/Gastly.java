package pokemon.model;

public class Gastly extends Pokemon implements Ghost, Poison
{
	public Gastly ()
	{
		super(92, "Gastly");
		setup();
	}
	
	public Gastly (String name)
	{
		super(92, name);
		setup();
	}
	
	public Gastly (int number, String name)
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
