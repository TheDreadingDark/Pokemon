package pokemon.model;

public class Poliwrath extends Poliwhirl 
{
	public Poliwrath ()
	{
		super(62, "Poliwrath");
		setup();
	}
	
	public Poliwrath (String name)
	{
		super(62, name);
		setup();
	}
	
	public Poliwrath (int number, String name)
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