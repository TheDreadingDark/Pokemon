package pokemon.model;

public class Exeggcute extends Pokemon implements Grass, Psychic
{
	public Exeggcute ()
	{
		super(102, "Exeggcute");
		setup();
	}
	
	public Exeggcute (String name)
	{
		super(102, name);
		setup();
	}
	
	public Exeggcute (int number, String name)
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