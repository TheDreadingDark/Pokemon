package pokemon.model;

public class Venomoth extends Venonat
{
	public Venomoth ()
	{
		super(49, "Venomoth");
		setup();
	}
	
	public Venomoth (String name)
	{
		super(49, name);
		setup();
	}
	
	public Venomoth (int number, String name)
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