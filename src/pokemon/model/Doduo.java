package pokemon.model;

public class Doduo extends Pokemon implements Normal, Flying
{
	public Doduo ()
	{
		super(84, "Doduo");
		setup();
	}
	
	public Doduo (String name)
	{
		super(84, name);
		setup();
	}
	
	public Doduo (int number, String name)
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