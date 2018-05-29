package pokemon.model;

public class Dewgong extends Seel implements Ice
{
	public Dewgong ()
	{
		super(87, "Dewgong");
		setup();
	}
	
	public Dewgong (String name)
	{
		super(87, name);
		setup();
	}
	
	public Dewgong (int number, String name)
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
