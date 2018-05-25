package pokemon.model;

public class Nidoqueen extends Nidorina implements Ground
{
	public Nidoqueen ()
	{
		super(31, "Nidoqueen");
		setup();
	}
	
	public Nidoqueen (String name)
	{
		super(31, name);
		setup();
	}
	
	public Nidoqueen (int number, String name)
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
