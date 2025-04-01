/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemon;

import autonoma.pokemon.models.Bulbasaur;
import autonoma.pokemon.models.Charmander;
import autonoma.pokemon.models.Pikachu;
import autonoma.pokemon.models.PokemonAgua;
import autonoma.pokemon.models.PokemonElectrico;
import autonoma.pokemon.models.Squirtle;

/**
 *@author Juan José Morales A.
 * @version 20250327
 * @since 1.0
 */
public class Pokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Charmander charmander = new Charmander (4, "Charmander",(float) 2.8,"Primera temporada");
        Pikachu pikachu =new Pikachu (2, "Pikachu",(float) 3.1,"Segunda temporada");
        Bulbasaur bulbasaur =new Bulbasaur(3, "Bulbasaur",(float) 1.1,"Tercera temporada");
        Squirtle squirtle =new Squirtle(1, "Squirtle",(float) 5.1,"Cuarta temporada");
        
        System.out.println(charmander.ataquePunioFuego()+"\n");
        System.out.println(pikachu.ataqueBolaTrueno()+"\n");
        System.out.println(bulbasaur.ataqueDrenaje()+"\n");
        System.out.println(squirtle.ataquePistolaAgua()+"\n");
    }
    
}
