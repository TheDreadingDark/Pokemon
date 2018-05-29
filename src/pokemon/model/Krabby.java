package pokemon.model;

public class Krabby extends Pokemon implements Water
{
	public Krabby ()
	{
		super(98, "Krabby");
		setup();
	}
	
	public Krabby (String name)
	{
		super(98, name);
		setup();
	}
	
	public Krabby (int number, String name)
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
