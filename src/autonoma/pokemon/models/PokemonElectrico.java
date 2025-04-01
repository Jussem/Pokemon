/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package autonoma.pokemon.models;

/**
 *
 * @author juanb
 */
public interface PokemonElectrico {
   
    //metodo abstracto para el ataque con "Impactrueno"
    //@return Strinng
    public abstract String ataqueImpactrueno();
    
    //metodo abstracto para el ataque con "Puño Trueno"
    //@return String
    public abstract String ataquePunoTrueno();
    
    //metodo abstracto para el ataque con "Carga Electrica"
    //@return String
    public abstract String ataqueCargaElectrica();
    
    //metodo abstracto para el ataque con "Bols Trueno"
    //@return String
    public abstract String ataqueBolaTrueno();
}
