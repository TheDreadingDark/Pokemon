package pokemon.model;

public class Pikachu extends Pokemon implements Electric
{
	public Pikachu ()
	{
		super(25, "Pikachu");
		setup();
	}
	
	public Pikachu (String name)
	{
		super(25, name);
		setup();
	}
	
	public Pikachu (int number, String name)
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
