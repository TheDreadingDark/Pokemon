package pokemon.model;

public class Poliwag extends Pokemon implements Water
{
	public Poliwag ()
	{
		super(60, "Poliwag");
		setup();
	}
	
	public Poliwag (String name)
	{
		super(60, name);
		setup();
	}
	
	public Poliwag (int number, String name)
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
