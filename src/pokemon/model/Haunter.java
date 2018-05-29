package pokemon.model;

public class Haunter extends Gastly
{
	public Haunter ()
	{
		super(93, "Haunter");
		setup();
	}
	
	public Haunter (String name)
	{
		super(93, name);
		setup();
	}
	
	public Haunter (int number, String name)
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