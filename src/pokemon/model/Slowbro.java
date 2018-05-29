package pokemon.model;

public class Slowbro extends Slowpoke 
{
	public Slowbro ()
	{
		super(80, "Slowbro");
		setup();
	}
	
	public Slowbro (String name)
	{
		super(80, name);
		setup();
	}
	
	public Slowbro (int number, String name)
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