package pokemon.model;

public class Seel extends Pokemon implements Water
{
	public Seel ()
	{
		super(86, "Seel");
		setup();
	}
	
	public Seel (String name)
	{
		super(86, name);
		setup();
	}
	
	public Seel (int number, String name)
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
