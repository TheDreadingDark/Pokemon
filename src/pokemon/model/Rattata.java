package pokemon.model;

public class Rattata extends Pokemon implements Normal
{
	public Rattata ()
	{
		super(19, "Rattata");
		setup();
	}
	
	public Rattata (String name)
	{
		super(19, name);
		setup();
	}
	
	public Rattata (int number, String name)
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
