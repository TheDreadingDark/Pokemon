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
		
		appFrame = new PokemonFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private void buildPokedex()
	{
		pokedex.add(new Bulbasaur());
		pokedex.add(new Ivysaur());
		pokedex.add(new Venusaur());
		
		pokedex.add(new Charmander());
		pokedex.add(new Charmeleon());
		pokedex.add(new Charizard());
		
		pokedex.add(new Squirtle());
		pokedex.add(new Wartortle());
		pokedex.add(new Blastoise());
		
		pokedex.add(new Caterpie());
		pokedex.add(new Metapod());
		pokedex.add(new Butterfree());
		
		pokedex.add(new Weedle());
		pokedex.add(new Kakuna());
		pokedex.add(new Beedrill());
		
		pokedex.add(new Pidgey());
		pokedex.add(new Pidgeotto());
		pokedex.add(new Pidgeot());
		
		pokedex.add(new Rattata());
		pokedex.add(new Raticate());
		
		pokedex.add(new Spearow());
		pokedex.add(new Fearow());
		
		pokedex.add(new Ekans());
		pokedex.add(new Arbok());
		
		pokedex.add(new Pikachu());
		pokedex.add(new Raichu());
		
		pokedex.add(new Sandshrew());
		pokedex.add(new Sandslash());
		
		pokedex.add(new NidoranFemale());
		pokedex.add(new Nidorina());
		pokedex.add(new Nidoqueen());
		
		pokedex.add(new NidoranMale());
		pokedex.add(new Nidorino());
		pokedex.add(new Nidoking());
		
		pokedex.add(new Clefairy());
		pokedex.add(new Clefable());
		
		pokedex.add(new Vulpix());
		pokedex.add(new Ninetails());
		
		pokedex.add(new Jigglypuff());
		pokedex.add(new Wigglytuff());
		
		pokedex.add(new Zubat());
		pokedex.add(new Golbat());
		
		pokedex.add(new Oddish());
		pokedex.add(new Gloom());
		pokedex.add(new Vileplume());
		
		pokedex.add(new Paras());
		pokedex.add(new Parasect());
		
		pokedex.add(new Venonat());
		pokedex.add(new Venomoth());
		
		pokedex.add(new Diglett());
		pokedex.add(new Dugtrio());
		
		pokedex.add(new Meowth());
		pokedex.add(new Persian());
		
		pokedex.add(new Psyduck());
		pokedex.add(new Golduck());
		
		pokedex.add(new Mankey());
		pokedex.add(new Primeape());
		
		pokedex.add(new Growlithe());
		pokedex.add(new Arcanine());
		
		pokedex.add(new Poliwag());
		pokedex.add(new Poliwhirl());
		pokedex.add(new Poliwrath());
		
		pokedex.add(new Abra());
		pokedex.add(new Kadabra());
		pokedex.add(new Alakazam());
		
		pokedex.add(new Machop());
		pokedex.add(new Machoke());
		pokedex.add(new Machamp());
		
		pokedex.add(new Bellsprout());
		pokedex.add(new Weepinbell());
		pokedex.add(new Victreebel());
		
		pokedex.add(new Tentacool());
		pokedex.add(new Tentacruel());
		
		pokedex.add(new Geodude());
		pokedex.add(new Graveler());
		pokedex.add(new Golem());
		
		pokedex.add(new Ponyta());
		pokedex.add(new Rapidash());
		
		pokedex.add(new Slowpoke());
		pokedex.add(new Slowbro());
		
		pokedex.add(new Magnemite());
		pokedex.add(new Magneton());
		
		pokedex.add(new Farfetchd());
		
		pokedex.add(new Doduo());
		pokedex.add(new Dodrio());
		
		pokedex.add(new Seel());
		pokedex.add(new Dewgong());
		
		pokedex.add(new Grimer());
		pokedex.add(new Muk());
		
		pokedex.add(new Shellder());
		pokedex.add(new Cloyster());
		
		pokedex.add(new Gastly());
		pokedex.add(new Haunter());
		pokedex.add(new Gengar());
		
		pokedex.add(new Onix());
		
		pokedex.add(new Drowzee());
		pokedex.add(new Hypno());
		
		pokedex.add(new Krabby());
		pokedex.add(new Kingler());
		
		pokedex.add(new Voltorb());
		pokedex.add(new Electrode());
		
		pokedex.add(new Exeggcute());
		pokedex.add(new Exeggutor());
		
		pokedex.add(new Cubone());
		pokedex.add(new Marowak());
		
		pokedex.add(new Hitmonlee());
		pokedex.add(new Hitmonchan());
		
		pokedex.add(new Lickitung());
		
		pokedex.add(new Koffing());
		pokedex.add(new Weezing());
		
		pokedex.add(new Rhyhorn());
		pokedex.add(new Rhydon());
		
		pokedex.add(new Chansey());
		
		pokedex.add(new Tangela());
		
		pokedex.add(new Kangaskhan());
		
		pokedex.add(new Horsea());
		pokedex.add(new Seadra());
		
		pokedex.add(new Goldeen());
		pokedex.add(new Seaking());
		
		pokedex.add(new Staryu());
		pokedex.add(new Starmie());
		
		pokedex.add(new MrMime());
		
		pokedex.add(new Scyther());
		
		pokedex.add(new Jynx());
		
		pokedex.add(new Electabuzz());
		
		pokedex.add(new Magmar());
		
		pokedex.add(new Pinsir());
		
		pokedex.add(new Tauros());
		
		pokedex.add(new Magikarp());
		pokedex.add(new Gyarados());
		
		pokedex.add(new Lapras());
		
		pokedex.add(new Ditto());
		
		pokedex.add(new Eevee());
		pokedex.add(new Vaporeon());
		pokedex.add(new Jolteon());
		pokedex.add(new Flareon());
		
		pokedex.add(new Porygon());
		
		pokedex.add(new Omanyte());
		pokedex.add(new Omastar());
		
		pokedex.add(new Kabuto());
		pokedex.add(new Kabutops());
		
		pokedex.add(new Aerodactyl());
		
		pokedex.add(new Snorlax());
		
		pokedex.add(new Articuno());

		pokedex.add(new Zapdos());
		
		pokedex.add(new Moltres());
		
		pokedex.add(new Dratini());
		pokedex.add(new Dragonair());
		pokedex.add(new Dragonite());
		
		pokedex.add(new Mewtwo());
		
		pokedex.add(new Mew());
	}
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public boolean isValidInteger(String input)
	{
		return true;
	}
	
	public boolean isValidDouble(String input)
	{
		return true;
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
		Pokemon selected = pokedex.get(selection);
		
		selected.setAttackPoints(attack);
		selected.setCanEvolve(evolve);
//		selected.setEnhancementModifier(modify);
		selected.setName(name);
		selected.setHealthPoints(health);
		
		FileController.savePokemonToFile((ArrayList<Pokemon>) pokedex);
	}
}
