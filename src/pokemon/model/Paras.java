package pokemon.model;

public class Paras extends Pokemon implements Bug, Grass
{
	public Paras ()
	{
		super(46, "Paras");
		setup();
	}
	
	public Paras (String name)
	{
		super(46, name);
		setup();
	}
	
	public Paras (int number, String name)
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
