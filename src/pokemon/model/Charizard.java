package pokemon.model;

public class Charizard extends Charmeleon implements Flying
{
	public Charizard()
	{
		super(6, "Charizard");
		setup();
	}
	
	public Charizard(String name)
	{
		super(6, name);
		setup();
	}
	
	public Charizard(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(84);
		this.setCanEvolve(true);
		this.setHealthPoints(78);
	}
}