package pokemon.model;

public class Cloyster extends Shellder implements Ice
{
	public Cloyster ()
	{
		super(91, "Cloyster");
		setup();
	}
	
	public Cloyster (String name)
	{
		super(91, name);
		setup();
	}
	
	public Cloyster (int number, String name)
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
