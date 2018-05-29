package pokemon.model;

public class Horsea extends Pokemon implements Water
{
	public Horsea ()
	{
		super(116, "Horsea");
		setup();
	}
	
	public Horsea (String name)
	{
		super(116, name);
		setup();
	}
	
	public Horsea (int number, String name)
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
