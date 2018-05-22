package pokemon.model;

public class Charmander extends Pokemon implements Fire
{
	public Charmander()
	{
		super(4, "Charmander");
		setup();
	}
	
	public Charmander(String name)
	{
		super(4, name);
		setup();
	}
	
	public Charmander(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(52);
		this.setCanEvolve(true);
		this.setHealthPoints(39);
	}
}