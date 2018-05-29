package pokemon.model;

public class Porygon extends Pokemon implements Normal
{
	public Porygon ()
	{
		super(137, "Porygon");
		setup();
	}
	
	public Porygon (String name)
	{
		super(137, name);
		setup();
	}
	
	public Porygon (int number, String name)
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