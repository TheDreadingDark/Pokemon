package pokemon.model;

public class Vaporeon extends Pokemon implements Water
{
	public Vaporeon ()
	{
		super(134, "Vaporeon");
		setup();
	}
	
	public Vaporeon (String name)
	{
		super(134, name);
		setup();
	}
	
	public Vaporeon (int number, String name)
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