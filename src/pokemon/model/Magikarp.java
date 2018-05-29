package pokemon.model;

public class Magikarp extends Pokemon implements Water
{
	public Magikarp ()
	{
		super(129, "Magikarp");
		setup();
	}
	
	public Magikarp (String name)
	{
		super(129, name);
		setup();
	}
	
	public Magikarp (int number, String name)
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
