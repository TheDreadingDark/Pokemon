package pokemon.model;

public class NidoranFemale extends Pokemon implements Poison
{
	public NidoranFemale ()
	{
		super(29, "NidoranFemale");
		setup();
	}
	
	public NidoranFemale (String name)
	{
		super(29, name);
		setup();
	}
	
	public NidoranFemale (int number, String name)
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
