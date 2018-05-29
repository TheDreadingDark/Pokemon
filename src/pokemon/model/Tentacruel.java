package pokemon.model;

public class  Tentacruel extends Tentacool
{
	public Tentacruel ()
	{
		super(73, "Tentacruel");
		setup();
	}
	
	public Tentacruel (String name)
	{
		super(73, name);
		setup();
	}
	
	public Tentacruel (int number, String name)
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
