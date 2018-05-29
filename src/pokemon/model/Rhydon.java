package pokemon.model;

public class Rhydon extends Rhyhorn
{
	public Rhydon ()
	{
		super(112, "Rhydon");
		setup();
	}
	
	public Rhydon (String name)
	{
		super(112, name);
		setup();
	}
	
	public Rhydon (int number, String name)
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
