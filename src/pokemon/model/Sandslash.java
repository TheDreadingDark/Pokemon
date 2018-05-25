package pokemon.model;

public class Sandslash extends Sandshrew
{
	public Sandslash ()
	{
		super(28, "Sandslash");
		setup();
	}
	
	public Sandslash (String name)
	{
		super(28, name);
		setup();
	}
	
	public Sandslash (int number, String name)
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
