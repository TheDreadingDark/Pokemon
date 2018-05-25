package pokemon.model;

public class Jigglypuff extends Pokemon implements Normal, Fairy
{
	public Jigglypuff ()
	{
		super(39, "Jigglypuff");
		setup();
	}
	
	public Jigglypuff (String name)
	{
		super(39, name);
		setup();
	}
	
	public Jigglypuff (int number, String name)
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
