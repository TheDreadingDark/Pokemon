package pokemon.model;

public class Drowzee extends Pokemon implements Psychic
{
	public Drowzee ()
	{
		super(96, "Drowzee");
		setup();
	}
	
	public Drowzee (String name)
	{
		super(96, name);
		setup();
	}
	
	public Drowzee (int number, String name)
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
