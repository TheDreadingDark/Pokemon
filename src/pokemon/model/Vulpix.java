package pokemon.model;

public class Vulpix extends Pokemon implements Fire
{
	public Vulpix ()
	{
		super(37, "Vulpix");
		setup();
	}
	
	public Vulpix (String name)
	{
		super(37, name);
		setup();
	}
	
	public Vulpix (int number, String name)
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