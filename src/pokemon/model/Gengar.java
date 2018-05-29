package pokemon.model;

public class Gengar extends Haunter 
{
	public Gengar ()
	{
		super(94, "Gengar");
		setup();
	}
	
	public Gengar (String name)
	{
		super(94, name);
		setup();
	}
	
	public Gengar (int number, String name)
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
