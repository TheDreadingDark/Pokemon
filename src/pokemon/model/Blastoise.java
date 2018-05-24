package pokemon.model;

public class Blastoise extends Wartortle
{
	public Blastoise()
	{
		super(9, "Blastoise");
		setup();
	}
	
	public Blastoise(String name)
	{
		super(9, name);
		setup();
	}
	
	public Blastoise(int number, String name)
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
