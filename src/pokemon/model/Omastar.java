package pokemon.model;

public class Omastar extends Omanyte
{
	public Omastar ()
	{
		super(139, "Omastar");
		setup();
	}
	
	public Omastar (String name)
	{
		super(139, name);
		setup();
	}
	
	public Omastar (int number, String name)
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