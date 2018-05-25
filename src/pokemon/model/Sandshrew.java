package pokemon.model;

public class Sandshrew extends Pokemon implements Ground
{
	public Sandshrew ()
	{
		super(27, "Sandshrew");
		setup();
	}
	
	public Sandshrew (String name)
	{
		super(27, name);
		setup();
	}
	
	public Sandshrew (int number, String name)
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