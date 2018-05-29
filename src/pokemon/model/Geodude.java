package pokemon.model;

public class Geodude extends Pokemon implements Rock, Ground
{
	public Geodude ()
	{
		super(74, "Geodude");
		setup();
	}
	
	public Geodude (String name)
	{
		super(74, name);
		setup();
	}
	
	public Geodude (int number, String name)
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
