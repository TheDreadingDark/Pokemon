package pokemon.model;

public class Nidoking extends Nidorino implements Ground
{
	public Nidoking ()
	{
		super(34, "Nidoking");
		setup();
	}
	
	public Nidoking (String name)
	{
		super(34, name);
		setup();
	}
	
	public Nidoking (int number, String name)
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
