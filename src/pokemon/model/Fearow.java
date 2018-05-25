package pokemon.model;

public class Fearow extends Spearow
{
	public Fearow ()
	{
		super(22, "Fearow");
		setup();
	}
	
	public Fearow (String name)
	{
		super(22, name);
		setup();
	}
	
	public Fearow (int number, String name)
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
