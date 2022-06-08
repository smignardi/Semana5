import models.MaestroPokemonModel;
import utilities.Logs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var log = new Logs();

        int id;

        log.info("Pidiendo un numero del 1 al 150");
        do {
            System.out.println("Ingresar un numero del 1 al 150: ");
            id = scanner.nextInt();
        }while (id<1 || id>150);

        log.info("Ingresando un boolean");
        System.out.println("Ingresar un boolean: ");
        var seImprimeTodaLista=scanner.nextBoolean();

        scanner.close();

        var pokedex = new Pokedex();

        var pokemon = pokedex.quienEsEsePokemon(id);
        pokedex.imprimirPokemon(pokemon);

        if (seImprimeTodaLista) {
            pokedex.imprimirListaPokemon();
        } else {
            log.info("pipipip");
        }

        //Info entrenador
        log.debug("Imprimiendo data del entrenador");
        System.out.println("Info del entrenador: ");
        var entrenadorPokemon = new MaestroPokemonModel();
        System.out.println("Nombre: " + entrenadorPokemon.getNombre());
        System.out.println("Apellido: " + entrenadorPokemon.getApellido());

    }
}
