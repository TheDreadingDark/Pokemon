package pokemon.model;

public class Kakuna extends Weedle
{
	public Kakuna ()
	{
		super(14, "Kakuna");
		setup();
	}
	
	public Kakuna (String name)
	{
		super(14, name);
		setup();
	}
	
	public Kakuna (int number, String name)
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