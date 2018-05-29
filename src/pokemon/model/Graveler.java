package pokemon.model;

public class Graveler extends Geodude 
{
	public Graveler ()
	{
		super(75, "Graveler");
		setup();
	}
	
	public Graveler (String name)
	{
		super(75, name);
		setup();
	}
	
	public Graveler (int number, String name)
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