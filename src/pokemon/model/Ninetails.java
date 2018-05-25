package pokemon.model;

public class Ninetails extends Vulpix
{
	public Ninetails ()
	{
		super(38, "Ninetails");
		setup();
	}
	
	public Ninetails (String name)
	{
		super(38, name);
		setup();
	}
	
	public Ninetails (int number, String name)
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
