package pokemon.model;

public class Farfetchd extends Pokemon implements Normal, Flying
{
	public Farfetchd ()
	{
		super(83, "Farfetchd");
		setup();
	}
	
	public Farfetchd (String name)
	{
		super(83, name);
		setup();
	}
	
	public Farfetchd (int number, String name)
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