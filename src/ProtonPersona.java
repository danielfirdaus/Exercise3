/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danielfirdaus
 */
public class ProtonPersona extends Proton {
    String space; 
   
    ProtonPersona(){
        this.space = "Large boot";
    }
    
    public void boot(){
        System.out.println("| Proton Persona |");
        System.out.println("Bigger boot space:\n " + space);
    }
    
    void run(){
        System.out.println("Proton Persona is running safely");
    }
}
