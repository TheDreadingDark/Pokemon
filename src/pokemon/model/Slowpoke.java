package pokemon.model;

public class Slowpoke extends Pokemon implements Water, Psychic
{
	public Slowpoke ()
	{
		super(79, "Slowpoke");
		setup();
	}
	
	public Slowpoke (String name)
	{
		super(79, name);
		setup();
	}
	
	public Slowpoke (int number, String name)
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