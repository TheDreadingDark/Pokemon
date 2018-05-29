package pokemon.model;

public class Bellsprout extends Pokemon implements Grass, Poison
{
	public Bellsprout ()
	{
		super(69, "Bellsprout");
		setup();
	}
	
	public Bellsprout (String name)
	{
		super(69, name);
		setup();
	}
	
	public Bellsprout (int number, String name)
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
