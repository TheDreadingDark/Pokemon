package pokemon.model;

public class Tauros extends Pokemon implements Normal
{
	public Tauros ()
	{
		super(128, "Tauros");
		setup();
	}
	
	public Tauros (String name)
	{
		super(128, name);
		setup();
	}
	
	public Tauros (int number, String name)
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
