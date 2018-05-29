package pokemon.model;

public class Lickitung extends Pokemon implements Normal
{
	public Lickitung ()
	{
		super(108, "Lickitung");
		setup();
	}
	
	public Lickitung (String name)
	{
		super(108, name);
		setup();
	}
	
	public Lickitung (int number, String name)
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