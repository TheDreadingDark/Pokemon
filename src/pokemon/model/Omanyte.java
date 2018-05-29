package pokemon.model;

public class Omanyte extends Pokemon implements Rock, Water
{
	public Omanyte ()
	{
		super(138, "Omanyte");
		setup();
	}
	
	public Omanyte (String name)
	{
		super(138, name);
		setup();
	}
	
	public Omanyte (int number, String name)
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