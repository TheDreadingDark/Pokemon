package pokemon.model;

public class Magnemite extends Pokemon implements Electric, Steel
{
	public Magnemite ()
	{
		super(81, "Magnemite");
		setup();
	}
	
	public Magnemite (String name)
	{
		super(81, name);
		setup();
	}
	
	public Magnemite (int number, String name)
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