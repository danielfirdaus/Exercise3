/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danielfirdaus
 */
public class ProtonX50 extends Proton {
    
    String park;
    
    ProtonX50(){
        this.park = "Auto park";
    }
    
    public void parking(){
        System.out.println("| Proton X50 |");
        System.out.println("Auto parking assist:\n " + park);
    }
    
    void run(){
        System.out.println("Proton X50 is running safely");
    }
}
