package pokemon.model;

public class Tangela extends Pokemon implements Grass
{
	public Tangela ()
	{
		super(114, "Tangela");
		setup();
	}
	
	public Tangela (String name)
	{
		super(114, name);
		setup();
	}
	
	public Tangela (int number, String name)
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
