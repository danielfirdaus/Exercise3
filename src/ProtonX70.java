/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danielfirdaus
 */
public class ProtonX70 extends Proton {
    
    String autoPilot;
    
    ProtonX70(){
        this.autoPilot = "Auto Drive";
    }
    
    public void pilot(){
        System.out.println("| Proton X70 |");
        System.out.println("Auto Driving assist:\n " + autoPilot);
    }
    
    void run(){
        System.out.println("Proton X70 is running safely");
    }
}
