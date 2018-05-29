package pokemon.model;

public class Koffing extends Pokemon implements Poison
{
	public Koffing ()
	{
		super(109, "Koffing");
		setup();
	}
	
	public Koffing (String name)
	{
		super(109, name);
		setup();
	}
	
	public Koffing (int number, String name)
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