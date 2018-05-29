package pokemon.model;

public class Onix extends Pokemon implements Rock, Ground
{
	public Onix ()
	{
		super(95, "Onix");
		setup();
	}
	
	public Onix (String name)
	{
		super(95, name);
		setup();
	}
	
	public Onix (int number, String name)
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
