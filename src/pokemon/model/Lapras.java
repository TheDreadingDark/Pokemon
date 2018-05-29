package pokemon.model;

public class Lapras extends Pokemon implements Water, Ice
{
	public Lapras ()
	{
		super(131, "Lapras");
		setup();
	}
	
	public Lapras (String name)
	{
		super(131, name);
		setup();
	}
	
	public Lapras (int number, String name)
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
