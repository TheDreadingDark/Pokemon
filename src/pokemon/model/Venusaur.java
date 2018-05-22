package pokemon.model;

public class Venusaur extends Ivysaur
{
	public Venusaur()
	{
		super (003, "Venusaur");
		setup();
	}
	
	public Venusaur(String name)
	{
		super(003, name);
		setup();
	}
	
	public Venusaur(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	@Override
	protected void setup()
	{
		super.setup();
		this.setAttackPoints(82);
		this.setCanEvolve(false);
//		this.setEnhancementModifier(3);
		this.setHealthPoints(80);
	}
}
