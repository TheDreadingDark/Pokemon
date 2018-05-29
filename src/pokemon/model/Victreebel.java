package pokemon.model;

public class Victreebel extends Weepinbell 
{
	public Victreebel ()
	{
		super(71, "Victreebel");
		setup();
	}
	
	public Victreebel (String name)
	{
		super(71, name);
		setup();
	}
	
	public Victreebel (int number, String name)
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