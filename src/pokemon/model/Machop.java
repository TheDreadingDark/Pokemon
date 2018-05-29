package pokemon.model;

public class Machop extends Pokemon implements Fighting
{
	public Machop ()
	{
		super(66, "Machop");
		setup();
	}
	
	public Machop (String name)
	{
		super(66, name);
		setup();
	}
	
	public Machop (int number, String name)
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