package pokemon.model;

public class Rapidash extends Ponyta
{
	public Rapidash ()
	{
		super(77, "Rapidash");
		setup();
	}
	
	public Rapidash (String name)
	{
		super(77, name);
		setup();
	}
	
	public Rapidash (int number, String name)
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