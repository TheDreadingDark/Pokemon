package pokemon.model;

public class Shellder extends Pokemon implements Water
{
	public Shellder ()
	{
		super(90, "Shellder");
		setup();
	}
	
	public Shellder (String name)
	{
		super(90, name);
		setup();
	}
	
	public Shellder (int number, String name)
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
