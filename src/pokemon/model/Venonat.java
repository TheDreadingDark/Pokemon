package pokemon.model;

public class Venonat extends Pokemon implements Bug, Poison
{
	public Venonat ()
	{
		super(48, "Venonat");
		setup();
	}
	
	public Venonat (String name)
	{
		super(48, name);
		setup();
	}
	
	public Venonat (int number, String name)
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
