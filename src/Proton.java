/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danielfirdaus
 */
public class Proton {
    String brand;  
    int tyresize; 

Proton(){
    this.brand = "Dunlop";
    this.tyresize = 18;
}

public void printProton() {
    
        Proton obj1 = new Proton();
     
        System.out.println("Tyre Brand : " + obj1.brand);
        System.out.println("Tyre size  : " + obj1.tyresize);
        
    }

void run(){
    System.out.println("Vehicle is running");
}
}

