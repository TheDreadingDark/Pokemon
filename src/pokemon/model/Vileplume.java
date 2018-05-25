package pokemon.model;

public class Vileplume extends Gloom
{
	public Vileplume ()
	{
		super(45, "Vileplume");
		setup();
	}
	
	public Vileplume (String name)
	{
		super(45, name);
		setup();
	}
	
	public Vileplume (int number, String name)
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