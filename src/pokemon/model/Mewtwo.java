package pokemon.model;

public class Mewtwo extends Pokemon implements Psychic
{
	public Mewtwo()
	{
		super(150, "Mewtwo");
		setup();
	}
	
	public Mewtwo(String name)
	{
		super(150, name);
		setup();
	}
	
	public Mewtwo(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(420);
		this.setCanEvolve(false);
//		this.setEnhancementModifier(4.20);
		this.setHealthPoints(420);
	}
	
	//Psychic Methods
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
