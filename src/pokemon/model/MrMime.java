package pokemon.model;

public class MrMime extends Pokemon implements Psychic, Fairy
{
	public MrMime ()
	{
		super(122, "MrMime");
		setup();
	}
	
	public MrMime (String name)
	{
		super(122, name);
		setup();
	}
	
	public MrMime (int number, String name)
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