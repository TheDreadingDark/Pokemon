package pokemon.model;

public class Kyogre extends Pokemon implements Water
{
	public Kyogre(int number, String name)
	{
		super(number, name);
	}
	
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
