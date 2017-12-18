package pokemon.model;

public class Turtwig extends Pokemon implements Grass
{
	public Turtwig(int number, String name)
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
}
