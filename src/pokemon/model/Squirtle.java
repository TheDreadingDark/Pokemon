package pokemon.model;

public class Squirtle extends Pokemon implements Water
{
	public Squirtle()
	{
		super(7, "Squirtle");
		setup();
	}
	
	public Squirtle(String name)
	{
		super(7, name);
		setup();
	}
	
	public Squirtle(int number, String name)
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
