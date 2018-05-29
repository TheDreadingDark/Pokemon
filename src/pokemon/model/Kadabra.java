package pokemon.model;

public class Kadabra extends Abra
{
	public Kadabra ()
	{
		super(64, "Kadabra");
		setup();
	}
	
	public Kadabra (String name)
	{
		super(64, name);
		setup();
	}
	
	public Kadabra (int number, String name)
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
