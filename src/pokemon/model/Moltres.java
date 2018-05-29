package pokemon.model;

public class Moltres extends Pokemon implements Fire, Flying
{
	public Moltres ()
	{
		super(146, "Moltres");
		setup();
	}
	
	public Moltres (String name)
	{
		super(146, name);
		setup();
	}
	
	public Moltres (int number, String name)
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