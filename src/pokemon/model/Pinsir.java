package pokemon.model;

public class Pinsir extends Pokemon implements Bug
{
	public Pinsir ()
	{
		super(127, "Pinsir");
		setup();
	}
	
	public Pinsir (String name)
	{
		super(127, name);
		setup();
	}
	
	public Pinsir (int number, String name)
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
