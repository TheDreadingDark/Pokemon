package pokemon.model;

public class Nidorino extends NidoranMale
{
	public Nidorino ()
	{
		super(33, "Nidorino");
		setup();
	}
	
	public Nidorino (String name)
	{
		super(33, name);
		setup();
	}
	
	public Nidorino (int number, String name)
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
