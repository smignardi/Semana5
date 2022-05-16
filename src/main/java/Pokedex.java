import models.PokemonModel;
import utilities.ExcelReader;
import utilities.MapParser;

public class Pokedex {

    public void imprimirPokemon(PokemonModel pokemon) {
        System.out.println(pokemon.getNombre());
    }

    public void imprimirListaPokemon() {
        var listPokemons = new ExcelReader().readPokemons();

        for (PokemonModel pm : listPokemons) {
            if (pm.getAtrapado()) {
                imprimirPokemon(pm);
            }
        }
    }

    public PokemonModel quienEsEsePokemon(int id) {
        return new MapParser().getPokemonMap().get(id);
    }
}
