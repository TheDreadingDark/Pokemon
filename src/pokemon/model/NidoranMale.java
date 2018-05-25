package pokemon.model;

public class NidoranMale extends Pokemon implements Poison
{
	public NidoranMale ()
	{
		super(32, "NidoranMale");
		setup();
	}
	
	public NidoranMale (String name)
	{
		super(32, name);
		setup();
	}
	
	public NidoranMale (int number, String name)
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
