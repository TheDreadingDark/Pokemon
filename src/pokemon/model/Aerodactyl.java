package pokemon.model;

public class Aerodactyl extends Pokemon implements Rock, Flying
{
	public Aerodactyl ()
	{
		super(142, "Aerodactyl");
		setup();
	}
	
	public Aerodactyl (String name)
	{
		super(142, name);
		setup();
	}
	
	public Aerodactyl (int number, String name)
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