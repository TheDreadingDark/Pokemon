package pokemon.model;

public class Weepinbell extends Bellsprout 
{
	public Weepinbell ()
	{
		super(70, "Weepinbell");
		setup();
	}
	
	public Weepinbell (String name)
	{
		super(70, name);
		setup();
	}
	
	public Weepinbell (int number, String name)
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