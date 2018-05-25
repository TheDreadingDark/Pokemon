package pokemon.model;

public class Pidgey extends Pokemon implements Normal, Flying
{
	public Pidgey ()
	{
		super(16, "Pidgey");
		setup();
	}
	
	public Pidgey (String name)
	{
		super(16, name);
		setup();
	}
	
	public Pidgey (int number, String name)
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
