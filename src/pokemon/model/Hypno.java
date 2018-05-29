package pokemon.model;

public class Hypno extends Drowzee 
{
	public Hypno ()
	{
		super(97, "Hypno");
		setup();
	}
	
	public Hypno (String name)
	{
		super(97, name);
		setup();
	}
	
	public Hypno (int number, String name)
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