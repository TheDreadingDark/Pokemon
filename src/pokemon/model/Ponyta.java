package pokemon.model;

public class Ponyta extends Pokemon implements Fire
{
	public Ponyta ()
	{
		super(77, "Ponyta");
		setup();
	}
	
	public Ponyta (String name)
	{
		super(77, name);
		setup();
	}
	
	public Ponyta (int number, String name)
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