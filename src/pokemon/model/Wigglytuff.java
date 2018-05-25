package pokemon.model;

public class Wigglytuff extends Jigglypuff
{
	public Wigglytuff ()
	{
		super(40, "Wigglytuff");
		setup();
	}
	
	public Wigglytuff (String name)
	{
		super(40, name);
		setup();
	}
	
	public Wigglytuff (int number, String name)
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
