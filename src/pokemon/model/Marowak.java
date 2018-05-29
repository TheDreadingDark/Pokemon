package pokemon.model;

public class Marowak extends Cubone 
{
	public Marowak ()
	{
		super(105, "Marowak");
		setup();
	}
	
	public Marowak (String name)
	{
		super(105, name);
		setup();
	}
	
	public Marowak (int number, String name)
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
