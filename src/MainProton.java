/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 GetterNSetter/Poly/Encap
 * @author Danielfirdaus
 */
public class MainProton {

    public static void main(String[] args) {
        
        //Persona
        ProtonPersona p = new ProtonPersona();
        p.boot();
        p.run();
        p.printProton();
        System.out.println();
        
        //X70
        ProtonX70 x1 = new ProtonX70();
        x1.pilot();
        x1.run();
        x1.printProton();
        System.out.println();
        
        //X50
        ProtonX50 x2 = new ProtonX50();
        x2.parking();
        x2.run();
        x2.printProton();
        System.out.println();
        
        //Saga
        ProtonSaga s = new ProtonSaga();
        s.save();
        s.run();
        s.printProton();
        System.out.println(); 
        
    }
    
}
