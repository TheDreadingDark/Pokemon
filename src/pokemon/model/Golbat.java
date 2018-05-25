package pokemon.model;

public class Golbat extends Zubat
{
	public Golbat ()
	{
		super(42, "Golbat");
		setup();
	}
	
	public Golbat (String name)
	{
		super(42, name);
		setup();
	}
	
	public Golbat (int number, String name)
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