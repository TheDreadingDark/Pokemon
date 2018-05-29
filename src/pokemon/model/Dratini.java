package pokemon.model;

public class Dratini extends Pokemon implements Dragon
{
	public Dratini ()
	{
		super(147, "Dratini");
		setup();
	}
	
	public Dratini (String name)
	{
		super(147, name);
		setup();
	}
	
	public Dratini (int number, String name)
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