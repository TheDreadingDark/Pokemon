package pokemon.model;

public class Electabuzz extends Pokemon implements Electric
{
	public Electabuzz ()
	{
		super(125, "Electabuzz");
		setup();
	}
	
	public Electabuzz (String name)
	{
		super(125, name);
		setup();
	}
	
	public Electabuzz (int number, String name)
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
