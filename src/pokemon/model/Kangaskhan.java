package pokemon.model;

public class Kangaskhan extends Pokemon implements Normal
{
	public Kangaskhan ()
	{
		super(115, "Kangaskhan");
		setup();
	}
	
	public Kangaskhan (String name)
	{
		super(115, name);
		setup();
	}
	
	public Kangaskhan (int number, String name)
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
