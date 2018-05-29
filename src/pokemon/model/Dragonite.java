package pokemon.model;

public class Dragonite extends Dragonair implements Flying
{
	public Dragonite ()
	{
		super(149, "Dragonite");
		setup();
	}
	
	public Dragonite (String name)
	{
		super(149, name);
		setup();
	}
	
	public Dragonite (int number, String name)
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
