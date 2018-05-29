package pokemon.model;

public class Jynx extends Pokemon implements Ice, Psychic
{
	public Jynx ()
	{
		super(124, "Jynx");
		setup();
	}
	
	public Jynx (String name)
	{
		super(124, name);
		setup();
	}
	
	public Jynx (int number, String name)
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
