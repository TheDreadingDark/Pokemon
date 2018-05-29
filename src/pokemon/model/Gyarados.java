package pokemon.model;

public class Gyarados extends Magikarp implements Flying
{
	public Gyarados ()
	{
		super(130, "Gyarados");
		setup();
	}
	
	public Gyarados (String name)
	{
		super(130, name);
		setup();
	}
	
	public Gyarados (int number, String name)
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
