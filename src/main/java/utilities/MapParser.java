package utilities;

import models.PokemonModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class MapParser {

    private final Logs log;

    public MapParser() {
        log = new Logs();
    }

    public HashMap<Integer,PokemonModel> getPokemonMap() {
        var listPokemons = new ExcelReader().readPokemons();

        var hm = new HashMap<Integer,PokemonModel>();

        log.debug("Insertando data en el HashMap");
        for (var pm : listPokemons) {
            hm.put(pm.getId(), pm);
        }

        return hm;
    }

}
