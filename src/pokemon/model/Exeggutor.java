package pokemon.model;

public class Exeggutor extends Exeggcute
{
	public Exeggutor ()
	{
		super(103, "Exeggutor");
		setup();
	}
	
	public Exeggutor (String name)
	{
		super(103, name);
		setup();
	}
	
	public Exeggutor (int number, String name)
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
