package pokemon.model;

public class Poliwhirl extends Poliwag
{
	public Poliwhirl ()
	{
		super(61, "Poliwhirl");
		setup();
	}
	
	public Poliwhirl (String name)
	{
		super(61, name);
		setup();
	}
	
	public Poliwhirl (int number, String name)
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