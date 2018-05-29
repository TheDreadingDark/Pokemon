package pokemon.model;

public class Hitmonlee extends Pokemon implements Fighting
{
	public Hitmonlee ()
	{
		super(106, "Hitmonlee");
		setup();
	}
	
	public Hitmonlee (String name)
	{
		super(106, name);
		setup();
	}
	
	public Hitmonlee (int number, String name)
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