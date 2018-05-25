package pokemon.model;

public class Primeape extends Mankey
{
	public Primeape ()
	{
		super(57, "Primeape");
		setup();
	}
	
	public Primeape (String name)
	{
		super(57, name);
		setup();
	}
	
	public Primeape (int number, String name)
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
