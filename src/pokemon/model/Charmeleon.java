package pokemon.model;

public class Charmeleon extends Charmander
{
	public Charmeleon()
	{
		super(5, "Charmeleon");
		setup();
	}
	
	public Charmeleon(String name)
	{
		super(5, name);
		setup();
	}
	
	public Charmeleon(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(64);
		this.setCanEvolve(true);
		this.setHealthPoints(58);
	}
}