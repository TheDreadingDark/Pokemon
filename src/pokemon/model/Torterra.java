package pokemon.model;

public class Torterra extends Grotle implements Ground
{
	public Torterra()
	{
		super (389, "Torterra");
		setup();
	}
	
	public Torterra(String name)
	{
		super(389, name);
		setup();
	}
	
	public Torterra(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	@Override
	protected void setup()
	{
		super.setup();
		this.setAttackPoints(423);
		this.setCanEvolve(false);
		this.setEnhancementModifier(2.5);
		this.setHealthPoints(324);
	}
	
	//Ground Methods
	public String moveEarthquake()
	{
		return this.getClass().getSimpleName() + " used Earthquake"; 
	}
	
	public String moveFissure()
	{
		return this.getClass().getSimpleName() + " used Fissure";
	}
	
	public String moveSandTomb()
	{
		return this.getClass().getSimpleName() + " used Sand Tomb";
	}
}
