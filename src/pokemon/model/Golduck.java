package pokemon.model;

public class Golduck extends Psyduck
{
	public Golduck ()
	{
		super(55, "Golduck");
		setup();
	}
	
	public Golduck (String name)
	{
		super(55, name);
		setup();
	}
	
	public Golduck (int number, String name)
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
