package pokemon.model;

public class Beedrill extends Kakuna
{
	public Beedrill ()
	{
		super(15, "Beedrill");
		setup();
	}
	
	public Beedrill (String name)
	{
		super(15, name);
		setup();
	}
	
	public Beedrill (int number, String name)
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

