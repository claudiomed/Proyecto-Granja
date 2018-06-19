/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

/**
 *
 * @author Claudio Medrano 
 * @since 2018-6-14
 */
public class Vaca {
    
    private final String MUGIDO = "mooooo!";
    private String name;
    
    public Vaca(){
        this.name="Vaca";
    }
    /**
     * Method that adds an id, a number, to the animal's name. 
     * @param identifier 
     *
     */
    public void setNombre(int identifier){
        this.name+=identifier;
    }
    /**
     * Method that returns a String variable with the name + the identifier. 
     * @return String
     */
    public String getNombre(){
        return this.name;
    }
    /**
     * Method that returns a String variable that simulates the animal sound. 
     * @return String 
     */
    public String mugir(){
        return this.MUGIDO;
    }
}
