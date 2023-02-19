/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.ArrayList;


/**
 *
 * @author Lyzz
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<SmartTV> objetos = new ArrayList();
        
        objetos.add(new SmartTV(65, "Samsung", "4K", true, "UN65TU7000FXZX", "Negro"));
        
        objetos.add(new SmartTV(32, "Philips", "4K", true, "32PFL4756/F8", "Gris"));
        objetos.add(new SmartTV(40, "Hisense", "4K HD", true, "40H5G", "Negro"));
        System.out.println(objetos);
        System.out.println(objetos.get(0).BajarVolumen());
        System.out.println(objetos.get(1).Encender());
        System.out.println(objetos.get(2).SubirVolumen());
        System.out.println(objetos.get(2).ConectarBT());
        System.out.println(objetos.get(1).Apagar());
    }
}
