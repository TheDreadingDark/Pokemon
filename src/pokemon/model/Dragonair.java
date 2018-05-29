package pokemon.model;

public class Dragonair extends Dratini
{
	public Dragonair ()
	{
		super(148, "Dragonair");
		setup();
	}
	
	public Dragonair (String name)
	{
		super(148, name);
		setup();
	}
	
	public Dragonair (int number, String name)
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