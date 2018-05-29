package pokemon.model;

public class Abra extends Pokemon implements Psychic
{
	public Abra ()
	{
		super(63, "Abra");
		setup();
	}
	
	public Abra (String name)
	{
		super(63, name);
		setup();
	}
	
	public Abra (int number, String name)
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
