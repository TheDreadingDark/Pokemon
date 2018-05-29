package pokemon.model;

public class Zapdos extends Pokemon implements Electric, Flying
{
	public Zapdos ()
	{
		super(145, "Zapdos");
		setup();
	}
	
	public Zapdos (String name)
	{
		super(145, name);
		setup();
	}
	
	public Zapdos (int number, String name)
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