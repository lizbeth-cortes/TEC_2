/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaAutomovil;

/**
 *
 * @author Lyzz
 */
public class MainAutomovil {
    public static void main(String[] args) {
        
        Automovil auto1 = new Automovil("Toyota", "GR", 2022, 10000, "Automática");        
        System.out.println(auto1);
        System.out.println(auto1.avanzar(30));
        System.out.println(auto1.frenar());
        
        System.out.println("----");
        
        Automovil auto2 = new Automovil("Hyundai", "IONIQ", 2020, 20000, "Estándar");        
        System.out.println(auto2);
        System.out.println(auto2.avanzar(5000));
        System.out.println(auto2.frenar());
        System.out.println(auto2.avanzar(5));
    }
}
