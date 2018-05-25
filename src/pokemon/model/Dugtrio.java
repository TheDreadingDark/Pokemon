package pokemon.model;

public class Dugtrio extends Diglett
{
	public Dugtrio ()
	{
		super(51, "Dugtrio");
		setup();
	}
	
	public Dugtrio (String name)
	{
		super(51, name);
		setup();
	}
	
	public Dugtrio (int number, String name)
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
