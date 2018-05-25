package pokemon.model;

public class Caterpie extends Pokemon implements Bug
{
	public Caterpie()
	{
		super(10, "Caterpie");
		setup();
	}
	
	public Caterpie(String name)
	{
		super(10, name);
		setup();
	}
	
	public Caterpie(int number, String name)
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
