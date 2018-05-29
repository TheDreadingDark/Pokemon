package pokemon.model;

public class Staryu extends Pokemon implements Water
{
	public Staryu ()
	{
		super(120, "Staryu");
		setup();
	}
	
	public Staryu (String name)
	{
		super(120, name);
		setup();
	}
	
	public Staryu (int number, String name)
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
