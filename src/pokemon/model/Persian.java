package pokemon.model;

public class Persian extends Meowth
{
	public Persian ()
	{
		super(53, "Persian");
		setup();
	}
	
	public Persian (String name)
	{
		super(53, name);
		setup();
	}
	
	public Persian (int number, String name)
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
