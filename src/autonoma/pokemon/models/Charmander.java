/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pokemon.models;

/**
 *
 * @author juanb
 */
public class Charmander extends Pokemon implements PokemonFuego{
    //CONSTRUCTOR
    public Charmander(int numPokedex, String nombre, float pesoPokemon, String temporada){
        super(numPokedex, nombre, pesoPokemon, temporada);
    }
    //metodo para uasr el ataque "Placaje"
    @Override
    public String ataquePlacaje() {
        return("Charmander ataca con 'Placaje'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo para uasr el ataque "Aranazo"
    @Override
    public String ataqueAranazo() {
        return("Charmander ataca con 'Aranazo'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo para uasr el ataque "Mordisco"
    @Override
    public String ataqueMordisco() {
        return("Charmander ataca con 'Mordisco'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo para uasr el ataque "Puño Fuego"
    @Override
    public String ataquePunioFuego() {
        return("Charmander ataca con 'Puno Fuego'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo para uasr el ataque "Bola Fuego"
    @Override
    public String ataqueBolaFuego() {
        return("Charmander ataca con 'Bola Fuego'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo para uasr el ataque "Lanzallamas"
    @Override
    public String ataqueLanzallamas() {
        return("Charmander ataca con 'lanzallamas'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo para uasr el ataque "Ascuas"
    @Override
    public String ataqueAscuas() {
        return("Charmander ataca con 'Ascuas'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
