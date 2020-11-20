/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danielfirdaus
 */
public class ProtonSaga extends Proton{
    
    String savefuel;
    
    ProtonSaga(){
        this.savefuel = "Save Fuel for a Better Environment ";
    }
    
    public void save(){
        System.out.println(" | Proton Saga |");
        System.out.println("Safe Fuel:\n " + savefuel);
    }
    
    void run(){
        System.out.println("Proton Saga is running safely");
    }
}
