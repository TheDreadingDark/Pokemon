package pokemon.model;

public class Kyogre extends Pokemon implements Water
{
	public Kyogre()
	{
		super(382, "Kyogre");
		setup();
	}
	
	public Kyogre(String name)
	{
		super(382, name);
		setup();
	}
	
	public Kyogre(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(405);
		this.setCanEvolve(false);
		this.setEnhancementModifier(3);
		this.setHealthPoints(400);
	}
	
	//Water Methods
	public String moveWaterGun()
	{
		return this.getClass().getSimpleName() + " used Water Gun";
	}
	
	public String moveHydroPump()
	{
		return this.getClass().getSimpleName() + " used Hydro Pump";
	}
	
	public String moveAquaJet()
	{
		return this.getClass().getSimpleName() + " used Aqua Jet";
	}
}
