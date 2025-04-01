/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pokemon.models;

/**
 *
 * @author juanb
 */
public abstract class Pokemon {
    //ATRIBUTOS
    
    //numero de pokemones
    private int numPokedex;
    
    //nombre del pokemon
    private String nombre;
    
    //peso del pokemon;
    private float pesoPokemon;
    
    //temporada del pokemon
    private String temporada;

    public Pokemon(int numPokedex, String nombre, float pesoPokemon, String temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.pesoPokemon = pesoPokemon;
        this.temporada = temporada;
    }
    
    //METODOS DE ACCESO

    public String getNombre() {
        return nombre;
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public float getPesoPokemon() {
        return pesoPokemon;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public void setPesoPokemon(float pesoPokemon) {
        this.pesoPokemon = pesoPokemon;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
    
    //ATAQUES BASICOS DE TODOS LOS POKEMONES
    //metodo de ataque placaje y retorna un string
    public abstract String ataquePlacaje();
    
    //metodo de ataque con arañazo y retorna un String
    public abstract String ataqueAranazo();
    
    //metodo de ataque con mordisco y retorna un string
    public abstract String ataqueMordisco();
}
