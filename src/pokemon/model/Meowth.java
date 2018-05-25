package pokemon.model;

public class Meowth extends Pokemon implements Normal
{
	public Meowth ()
	{
		super(52, "Meowth");
		setup();
	}
	
	public Meowth (String name)
	{
		super(52, name);
		setup();
	}
	
	public Meowth (int number, String name)
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
