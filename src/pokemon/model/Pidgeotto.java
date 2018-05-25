package pokemon.model;

public class Pidgeotto extends Pidgey
{
	public Pidgeotto ()
	{
		super(17, "Pidgeotto");
		setup();
	}
	
	public Pidgeotto (String name)
	{
		super(17, name);
		setup();
	}
	
	public Pidgeotto (int number, String name)
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
