package pokemon.model;

public class Hitmonchan extends Pokemon implements Fighting
{
	public Hitmonchan ()
	{
		super(107, "Hitmonchan");
		setup();
	}
	
	public Hitmonchan (String name)
	{
		super(107, name);
		setup();
	}
	
	public Hitmonchan (int number, String name)
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