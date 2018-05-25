package pokemon.model;

public class Zubat extends Pokemon implements Poison, Flying
{
	public Zubat ()
	{
		super(41, "Zubat");
		setup();
	}
	
	public Zubat (String name)
	{
		super(41, name);
		setup();
	}
	
	public Zubat (int number, String name)
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