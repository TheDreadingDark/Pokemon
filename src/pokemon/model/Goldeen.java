package pokemon.model;

public class Goldeen extends Pokemon implements Water
{
	public Goldeen ()
	{
		super(118, "Goldeen");
		setup();
	}
	
	public Goldeen (String name)
	{
		super(118, name);
		setup();
	}
	
	public Goldeen (int number, String name)
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