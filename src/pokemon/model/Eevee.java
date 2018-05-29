package pokemon.model;

public class Eevee extends Pokemon implements Normal
{
	public Eevee ()
	{
		super(133, "Eevee");
		setup();
	}
	
	public Eevee (String name)
	{
		super(133, name);
		setup();
	}
	
	public Eevee (int number, String name)
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