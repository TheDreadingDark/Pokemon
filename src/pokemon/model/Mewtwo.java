package pokemon.model;

public class Mewtwo extends Pokemon implements Psychic
{
	public Mewtwo(int number, String name)
	{
		super(number, name);
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
