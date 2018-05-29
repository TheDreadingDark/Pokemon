package pokemon.model;

public class Grimer extends Pokemon implements Poison
{
	public Grimer ()
	{
		super(88, "Grimer");
		setup();
	}
	
	public Grimer (String name)
	{
		super(88, name);
		setup();
	}
	
	public Grimer (int number, String name)
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
