package pokemon.model;

public class Alakazam extends Kadabra
{
	public Alakazam ()
	{
		super(65, "Alakazam");
		setup();
	}
	
	public Alakazam (String name)
	{
		super(65, name);
		setup();
	}
	
	public Alakazam (int number, String name)
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
