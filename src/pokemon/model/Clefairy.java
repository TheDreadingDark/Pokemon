package pokemon.model;

public class Clefairy extends Pokemon implements Fairy
{
	public Clefairy ()
	{
		super(35, "Clefairy");
		setup();
	}
	
	public Clefairy (String name)
	{
		super(35, name);
		setup();
	}
	
	public Clefairy (int number, String name)
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