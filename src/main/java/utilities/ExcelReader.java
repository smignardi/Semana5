package utilities;

import com.poiji.bind.Poiji;
import models.PokemonModel;

import java.io.File;
import java.util.List;

public class ExcelReader {

    private final String EXCEL_PATH = "src/test/resources/testData/pokemonList.xlsx";
    private final Logs log;

    public ExcelReader() {
        log = new Logs();
    }

    public List<PokemonModel> readPokemons(){
        log.info("Leyendo datos del Excel");
        return Poiji.fromExcel(new File(EXCEL_PATH),PokemonModel.class);
    }
}