package pokemon.model;

public class Magneton extends Magnemite 
{
	public Magneton ()
	{
		super(82, "Magneton");
		setup();
	}
	
	public Magneton (String name)
	{
		super(82, name);
		setup();
	}
	
	public Magneton (int number, String name)
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