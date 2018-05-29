package pokemon.model;

public class Articuno extends Pokemon implements Ice, Flying
{
	public Articuno ()
	{
		super(144, "Articuno");
		setup();
	}
	
	public Articuno (String name)
	{
		super(144, name);
		setup();
	}
	
	public Articuno (int number, String name)
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