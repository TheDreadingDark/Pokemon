package pokemon.model;

public class Celebi extends Pokemon implements Grass, Psychic
{
	public Celebi()
	{
		super(251, "Celebi");
		setup();
	}
	
	public Celebi(String name)
	{
		super(251, name);
		setup();
	}
	
	public Celebi(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(380);
		this.setCanEvolve(false);
		this.setEnhancementModifier(3);
		this.setHealthPoints(400);
	}
	
	//Grass and Psychic Methods
	public String moveRazorLeaf()
	{
		return this.getClass().getSimpleName() + " used Razor Leaf";
	}
	
	public String moveAbsorb()
	{
		return this.getClass().getSimpleName() + " used Absorb";
	}
	
	public String moveLeechSeed()
	{
		return this.getClass().getSimpleName() + " used Leech Seed";
	}
	
	public String moveExtrasensory()
	{
		return this.getClass().getSimpleName() + " used Extrasensory";
	}
	
	public String moveReflect()
	{
		return this.getClass().getSimpleName() + " used Reflect";
	}
	
	public String moveTeleport()
	{
		return this.getClass().getSimpleName() + " used Teleport";
	}
}
