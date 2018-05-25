package pokemon.model;

public class Mankey extends Pokemon implements Fighting
{
	public Mankey ()
	{
		super(56, "Mankey");
		setup();
	}
	
	public Mankey (String name)
	{
		super(56, name);
		setup();
	}
	
	public Mankey (int number, String name)
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