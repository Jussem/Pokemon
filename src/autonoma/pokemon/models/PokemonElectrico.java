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
    /*<<abstract>> + ataqueImpactrueno()
<<abstract>> + ataquePuñoTrueno()
<<abstract>> + ataqueCargaElctrica()
<<abstract>> + ataqueBolaTrueno()
*/
   
    //metodo de ataque con "Impactrueno"
    //@return Strinng
    public abstract String ataqueImpactrueno();
    
    //metodo de ataque con "Puño Trueno"
    //@return String
    public abstract String ataquePunoTrueno();
    
    //metodo de ataque con "Carga Electrica"
    //@return String
    public abstract String ataqueCargaElectrica();
    
    //metodo de ataque con "Bols Trueno"
    //@return String
    public abstract String ataqueBolaTrueno();
}
