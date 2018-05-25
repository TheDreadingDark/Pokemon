package pokemon.model;

public class Butterfree extends Metapod implements Flying
{
	public Butterfree()
	{
		super(12, "Butterfree");
		setup();
	}
	
	public Butterfree(String name)
	{
		super(12, name);
		setup();
	}
	
	public Butterfree(int number, String name)
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
