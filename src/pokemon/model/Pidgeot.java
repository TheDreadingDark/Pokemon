package pokemon.model;

public class Pidgeot extends Pidgeotto
{
	public Pidgeot ()
	{
		super(18, "Pidgeot");
		setup();
	}
	
	public Pidgeot (String name)
	{
		super(18, name);
		setup();
	}
	
	public Pidgeot (int number, String name)
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