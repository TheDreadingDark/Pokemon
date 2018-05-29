package pokemon.model;

public class Cubone extends Pokemon implements Ground
{
	public Cubone ()
	{
		super(104, "Cubone");
		setup();
	}
	
	public Cubone (String name)
	{
		super(104, name);
		setup();
	}
	
	public Cubone (int number, String name)
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