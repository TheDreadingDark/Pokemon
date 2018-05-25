package pokemon.model;

public class Psyduck extends Pokemon implements Water
{
	public Psyduck ()
	{
		super(54, "Psyduck");
		setup();
	}
	
	public Psyduck (String name)
	{
		super(54, name);
		setup();
	}
	
	public Psyduck (int number, String name)
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