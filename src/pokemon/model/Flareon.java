package pokemon.model;

public class Flareon extends Pokemon implements Fire
{
	public Flareon ()
	{
		super(136, "Flareon");
		setup();
	}
	
	public Flareon (String name)
	{
		super(136, name);
		setup();
	}
	
	public Flareon (int number, String name)
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