package pokemon.model;

public class Machoke extends Machop
{
	public Machoke ()
	{
		super(67, "Machoke");
		setup();
	}
	
	public Machoke (String name)
	{
		super(67, name);
		setup();
	}
	
	public Machoke (int number, String name)
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