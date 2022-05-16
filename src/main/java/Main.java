import models.MaestroPokemonModel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        int id;

        do {
            System.out.println("Ingresar un numero del 1 al 150: ");
            id = scanner.nextInt();
        }while (id<1 || id>150);

        System.out.println("Ingresar un boolean: ");
        var seImprimeTodaLista=scanner.nextBoolean();

        scanner.close();

        var pokedex = new Pokedex();

        var pokemon =  pokedex.quienEsEsePokemon(id);
        pokedex.imprimirPokemon(pokemon);

        if(seImprimeTodaLista){
            pokedex.imprimirListaPokemon();
        }else{
            System.out.println("pipipipi");
        }


        //Info entrenador
        System.out.println("Info del entrenador: ");
        var entrenadorPokemon = new MaestroPokemonModel();
        System.out.println("Nombre: "+entrenadorPokemon.getNombre());
        System.out.println("Apellido: "+entrenadorPokemon.getApellido());

    }
}
