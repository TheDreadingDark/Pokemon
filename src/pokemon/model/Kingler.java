package pokemon.model;

public class Kingler extends Krabby 
{
	public Kingler ()
	{
		super(99, "Kingler");
		setup();
	}
	
	public Kingler (String name)
	{
		super(99, name);
		setup();
	}
	
	public Kingler (int number, String name)
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