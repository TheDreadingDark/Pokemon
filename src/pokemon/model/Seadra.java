package pokemon.model;

public class Seadra extends Horsea
{
	public Seadra ()
	{
		super(117, "Seadra");
		setup();
	}
	
	public Seadra (String name)
	{
		super(117, name);
		setup();
	}
	
	public Seadra (int number, String name)
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
