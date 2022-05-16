package models;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("pokemonList")
public class PokemonModel {

    @ExcelCellName("ID")
    private int id;

    @ExcelCellName("NOMBRE")
    private String nombre;

    @ExcelCellName("NOMBRE JAPONES")
    private String nombreJapones;

    @ExcelCellName("ATK")
    private int atk;

    @ExcelCellName("DEF")
    private int def;

    @ExcelCellName("SP")
    private int sp;

    @ExcelCellName("SP DEF")
    private int spDef;

    @ExcelCellName("CRIT")
    private int critic;

    @ExcelCellName("PESO")
    private double peso;

    @ExcelCellName("ATRAPADO")
    private Boolean atrapado;

    public String getNombre() {
        return nombre;
    }

    public String getNombreJapones() {
        return nombreJapones;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getSp() {
        return sp;
    }

    public int getSpDef() {
        return spDef;
    }

    public int getCritic() {
        return critic;
    }

    public double getPeso() {
        return peso;
    }

    public Boolean getAtrapado() {
        return atrapado;
    }

    public int getId() {
        return id;
    }
}
