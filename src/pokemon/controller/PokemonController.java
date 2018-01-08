package pokemon.controller;

import pokemon.model.*;
import pokemon.view.PokemonFrame;

import java.util.List;
import java.util.ArrayList;

public class PokemonController
{
	private List<Pokemon> pokedex;
	private PokemonFrame appFrame;
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
//		appFrame = new PokemonFrame(this);
	}
	
	private void buildPokedex()
	{
		pokedex.add(new Turtwig());
		pokedex.add(new Grotle());
		pokedex.add(new Torterra());
		
		pokedex.add(new Celebi());
		
		pokedex.add(new Kyogre());
		
		pokedex.add(new Mewtwo());
	}
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public boolean isValidInteger(String input)
	{
		return false;
	}
	
	public boolean isValidDouble(String input)
	{
		return false;
	}
	
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
	
	public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name)
	{
		
	}
}
