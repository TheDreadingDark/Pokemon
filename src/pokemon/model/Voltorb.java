package pokemon.model;

public class Voltorb extends Pokemon implements Electric
{
	public Voltorb ()
	{
		super(100, "Voltorb");
		setup();
	}
	
	public Voltorb (String name)
	{
		super(100, name);
		setup();
	}
	
	public Voltorb (int number, String name)
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