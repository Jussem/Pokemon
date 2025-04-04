/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pokemon.models;

/**
 *
 * @author juanb
 */
public class Pikachu extends Pokemon implements PokemonElectrico{
    //CONSTRUCTOR
    public Pikachu(int numPokedex, String nombre, float pesoPokemon, String temporada){
        super(numPokedex, nombre, pesoPokemon, temporada);
    }
    //metodo para uasr el ataque "Placaje"
    @Override
    public String ataquePlacaje() {
        return("Pikachu ataca con 'Placaje'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo para uasr el ataque "Arañazo"
    @Override
    public String ataqueAranazo() {
        return("Pikachu ataca con 'Aranazo'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo para uasr el ataque "Mordisco"
    @Override
    public String ataqueMordisco() {
        return("Pikachu ataca con 'Mordisco'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo para uasr el ataque "Impactrueno"
    @Override
    public String ataqueImpactrueno() {
        return("Pikachu ataca con 'Impactrueno'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo para uasr el ataque "Puño Trueno"
    @Override
    public String ataquePunoTrueno() {
        return("Pikachu ataca con 'Puno Trueno'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo para uasr el ataque "Carga Electrica"
    @Override
    public String ataqueCargaElectrica() {
        return("Pikachu ataca con 'Carga Electrica'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodo para uasr el ataque "Bola Trueno"
    @Override
    public String ataqueBolaTrueno() {
        return("Pikachu ataca con 'Bola Trueno'"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
