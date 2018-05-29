package pokemon.model;

public class Kabuto extends Pokemon implements Rock, Water
{
	public Kabuto ()
	{
		super(140, "Kabuto");
		setup();
	}
	
	public Kabuto (String name)
	{
		super(140, name);
		setup();
	}
	
	public Kabuto (int number, String name)
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