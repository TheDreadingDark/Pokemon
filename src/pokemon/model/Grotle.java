package pokemon.model;

public class Grotle extends Turtwig
{
	public Grotle()
	{
		super(388, "Grotle");
		setup();
	}
	
	public Grotle(String name)
	{
		super(388, name);
		setup();
	}
	
	public Grotle(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	@Override
	protected void setup()
	{
		super.setup();
		this.setAttackPoints(324);
		this.setCanEvolve(true);
		this.setEnhancementModifier(1.23);
		this.setHealthPoints(234);
	}
}