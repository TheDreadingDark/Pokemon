package pokemon.model;

public class Celebi extends Pokemon implements Grass, Psychic
{
	public Celebi(int number, String name)
	{
		super(number, name);
	}
	
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
