/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author Lyzz
 */
public class SmartTV {
    private float tamano;
    private String marca;
    private String resolucion;
    private boolean bluetooth;
    private String modelo;
    private String color;

    public SmartTV() {
    }

    public SmartTV(float tamano, String marca, String resolucion, boolean bluetooth, String modelo, String color) {
        this.tamano = tamano;
        this.marca = marca;
        this.resolucion = resolucion;
        this.bluetooth = bluetooth;
        this.modelo = modelo;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String Encender(){
        return "\n" + marca + " se ha encendido...";
    }
    
    public String Apagar(){
        return  "\n" + marca +" se ha apagado...";
    }
    
    public String ConectarBT(){
        return "\n" + marca +" se ha conectado a otro dispositivo mediante Bluetooth";
    }
    
    public String SubirVolumen(){
        return "\n" + marca +" ha subido el volumen";
    }
    
    public String BajarVolumen(){
        return "\n" + marca +" ha bajado el volumen";
    }

    @Override
    public String toString() {
        return "\n\nSMART TV: " + "\n- Tamaño: " + tamano + " pulagadas" + "\n- Marca: " + marca + "\n- Resolución: " + resolucion + "\n- Bluetooth: " + bluetooth + "\n- Modelo: " + modelo + "\n- Color: " + color ;
    }

    
    
}
