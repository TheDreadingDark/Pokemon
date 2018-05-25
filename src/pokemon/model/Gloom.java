package pokemon.model;

public class Gloom extends Oddish
{
	public Gloom ()
	{
		super(44, "Gloom");
		setup();
	}
	
	public Gloom (String name)
	{
		super(44, name);
		setup();
	}
	
	public Gloom (int number, String name)
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
