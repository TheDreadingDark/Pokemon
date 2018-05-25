package pokemon.model;

public class Clefable extends Clefairy
{
	public Clefable ()
	{
		super(36, "Clefable");
		setup();
	}
	
	public Clefable (String name)
	{
		super(36, name);
		setup();
	}
	
	public Clefable (int number, String name)
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
