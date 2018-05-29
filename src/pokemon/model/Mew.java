package pokemon.model;

public class Mew extends Pokemon implements Psychic
{
	public Mew ()
	{
		super(151, "Mew");
		setup();
	}
	
	public Mew (String name)
	{
		super(151, name);
		setup();
	}
	
	public Mew (int number, String name)
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