package pokemon.model;

public class Parasect extends Paras
{
	public Parasect ()
	{
		super(47, "Parasect");
		setup();
	}
	
	public Parasect (String name)
	{
		super(47, name);
		setup();
	}
	
	public Parasect (int number, String name)
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