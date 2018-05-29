package pokemon.model;

public class Tentacool extends Pokemon implements Water, Poison
{
	public Tentacool ()
	{
		super(72, "Tentacool");
		setup();
	}
	
	public Tentacool (String name)
	{
		super(72, name);
		setup();
	}
	
	public Tentacool (int number, String name)
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
