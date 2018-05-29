package pokemon.model;

public class Kabutops extends Kabuto
{
	public Kabutops ()
	{
		super(141, "Kabutops");
		setup();
	}
	
	public Kabutops (String name)
	{
		super(141, name);
		setup();
	}
	
	public Kabutops (int number, String name)
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
