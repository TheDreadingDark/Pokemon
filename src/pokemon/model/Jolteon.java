package pokemon.model;

public class Jolteon extends Pokemon implements Electric
{
	public Jolteon ()
	{
		super(135, "Jolteon");
		setup();
	}
	
	public Jolteon (String name)
	{
		super(135, name);
		setup();
	}
	
	public Jolteon (int number, String name)
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
