package pokemon.model;

public class Piplup extends Pokemon implements Water
{
	public Piplup(int number, String name)
	{
		super(number, name);
	}
	
	public String moveWaterGun()
	{
		return "Piplup uses Water Gun";
	}
	
	public String moveHydroPump()
	{
		return "Piplup uses Hydro Pump";
	}
	
	public String moveAquaJet()
	{
		return "Piplup uses Aqua Jet";
	}
}
