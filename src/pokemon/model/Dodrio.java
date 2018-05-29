package pokemon.model;

public class Dodrio extends Doduo
{
	public Dodrio ()
	{
		super(85, "Dodrio");
		setup();
	}
	
	public Dodrio (String name)
	{
		super(85, name);
		setup();
	}
	
	public Dodrio (int number, String name)
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
