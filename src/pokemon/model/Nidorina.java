package pokemon.model;

public class Nidorina extends NidoranFemale
{
	public Nidorina ()
	{
		super(30, "Nidorina");
		setup();
	}
	
	public Nidorina (String name)
	{
		super(30, name);
		setup();
	}
	
	public Nidorina (int number, String name)
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