package pokemon.model;

public class Arbok extends Ekans
{
	public Arbok ()
	{
		super(24, "Arbok");
		setup();
	}
	
	public Arbok (String name)
	{
		super(24, name);
		setup();
	}
	
	public Arbok (int number, String name)
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
