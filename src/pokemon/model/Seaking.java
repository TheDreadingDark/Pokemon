package pokemon.model;

public class Seaking extends Goldeen
{
	public Seaking ()
	{
		super(119, "Seaking");
		setup();
	}
	
	public Seaking (String name)
	{
		super(119, name);
		setup();
	}
	
	public Seaking (int number, String name)
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