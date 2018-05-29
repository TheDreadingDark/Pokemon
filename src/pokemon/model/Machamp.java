package pokemon.model;

public class Machamp extends Machoke
{
	public Machamp ()
	{
		super(68, "Machamp");
		setup();
	}
	
	public Machamp (String name)
	{
		super(68, name);
		setup();
	}
	
	public Machamp (int number, String name)
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