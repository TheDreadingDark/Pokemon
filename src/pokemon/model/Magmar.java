package pokemon.model;

public class Magmar extends Pokemon implements Fire
{
	public Magmar ()
	{
		super(126, "Magmar");
		setup();
	}
	
	public Magmar (String name)
	{
		super(126, name);
		setup();
	}
	
	public Magmar (int number, String name)
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
