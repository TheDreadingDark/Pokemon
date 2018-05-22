package pokemon.model;

public class Ivysaur extends Bulbasaur
{
	public Ivysaur()
	{
		super(002, "Ivysaur");
		setup();
	}
	
	public Ivysaur(String name)
	{
		super(002, name);
		setup();
	}
	
	public Ivysaur(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	@Override
	protected void setup()
	{
		super.setup();
		this.setAttackPoints(62);
		this.setCanEvolve(true);
//		this.setEnhancementModifier(3);
		this.setHealthPoints(60);
	}
}
