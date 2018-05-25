package pokemon.model;

public class Metapod extends Caterpie
{
	public Metapod()
	{
		super(11, "Metapod");
		setup();
	}
	
	public Metapod(String name)
	{
		super(11, name);
		setup();
	}
	
	public Metapod(int number, String name)
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
