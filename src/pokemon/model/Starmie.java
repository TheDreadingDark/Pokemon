package pokemon.model;

public class Starmie extends Pokemon implements Psychic
{
	public Starmie ()
	{
		super(121, "Starmie");
		setup();
	}
	
	public Starmie (String name)
	{
		super(121, name);
		setup();
	}
	
	public Starmie (int number, String name)
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
