package pokemon.model;

public class Rhyhorn extends Pokemon implements Ground, Rock
{
	public Rhyhorn ()
	{
		super(110, "Rhyhorn");
		setup();
	}
	
	public Rhyhorn (String name)
	{
		super(110, name);
		setup();
	}
	
	public Rhyhorn (int number, String name)
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
