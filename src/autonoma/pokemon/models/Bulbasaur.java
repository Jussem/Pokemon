/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pokemon.models;

/**
 *
 * @author juanb
 */
public class Bulbasaur extends Pokemon implements PokemonPlanta {
    //CONSTRUCTOR
    public Bulbasaur(int numPokedex,String nombre, float pesoPokemon, String temporada){
        super(numPokedex, nombre, pesoPokemon, temporada);
    }
    //metodo para uasr el ataque "Placaje"
    @Override
    public String ataquePlacaje() {
        return("Bulbasaur ataca con 'Placaje'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo para uasr el ataque "Arañazo"
    @Override
    public String ataqueAranazo() {
        return("Bulbasaur ataca con 'Aranazo'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo para uasr el ataque "Mordisco"
    @Override
    public String ataqueMordisco() {
        return("Bulbasaur ataca con 'Mordisco'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo para uasr el ataque "Paralizar"
    @Override
    public String ataqueParalizar() {
        return("Bulbasaur ataca con 'Paralizar'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo para uasr el ataque "Hoja Afilada"
    @Override
    public String ataqueHojaAfilada() {
        return("Bulbasaur ataca con 'Hoja Afilada'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo para uasr el ataque "Drenaje"
    @Override
    public String ataqueDrenaje() {
        return("Bulbasaur ataca con 'Drenaje'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo para uasr el ataque "Latigocepa"
    @Override
    public String ataqueLatigocepa() {
        return("Bulbasaur ataca con 'Latigocepa'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
