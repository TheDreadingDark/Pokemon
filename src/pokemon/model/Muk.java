package pokemon.model;

public class Muk extends Grimer
{
	public Muk ()
	{
		super(89, "Muk");
		setup();
	}
	
	public Muk (String name)
	{
		super(89, name);
		setup();
	}
	
	public Muk (int number, String name)
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
