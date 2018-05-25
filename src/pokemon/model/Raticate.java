package pokemon.model;

public class Raticate extends Rattata
{
	public Raticate ()
	{
		super(20, "Raticate");
		setup();
	}
	
	public Raticate (String name)
	{
		super(20, name);
		setup();
	}
	
	public Raticate (int number, String name)
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
