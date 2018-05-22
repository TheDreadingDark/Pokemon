package pokemon.model;

public class Bulbasaur extends Pokemon implements Grass, Poison
{
	public Bulbasaur()
	{
		super(001, "Bulbasaur");
		setup();
	}
	
	public Bulbasaur(String name)
	{
		super(001, name);
		setup();
	}
	
	public Bulbasaur(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(49);
		this.setCanEvolve(true);
//		this.setEnhancementModifier(3);
		this.setHealthPoints(45);
	}
	
	//Grass Methods
//		public String moveRazorLeaf()
//		{
//			return this.getClass().getSimpleName() + " used Razor Leaf";
//		}
		
//		public String moveAbsorb()
//		{
//			return this.getClass().getSimpleName() + " used Absorb";
//		}
		
//		public String moveLeechSeed()
//		{
//			return this.getClass().getSimpleName() + " used Leech Seed";
//		}
}