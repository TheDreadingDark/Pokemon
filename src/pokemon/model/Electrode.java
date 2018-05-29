package pokemon.model;

public class Electrode extends Voltorb
{
	public Electrode ()
	{
		super(101, "Electrode");
		setup();
	}
	
	public Electrode (String name)
	{
		super(101, name);
		setup();
	}
	
	public Electrode (int number, String name)
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
