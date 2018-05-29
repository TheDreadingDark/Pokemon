package pokemon.model;

public class Arcanine extends Growlithe
{
	public Arcanine ()
	{
		super(59, "Arcanine");
		setup();
	}
	
	public Arcanine (String name)
	{
		super(59, name);
		setup();
	}
	
	public Arcanine (int number, String name)
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
