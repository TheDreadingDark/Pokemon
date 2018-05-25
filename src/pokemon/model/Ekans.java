package pokemon.model;

public class Ekans extends Pokemon implements Poison
{
	public Ekans ()
	{
		super(23, "Ekans");
		setup();
	}
	
	public Ekans (String name)
	{
		super(23, name);
		setup();
	}
	
	public Ekans (int number, String name)
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
