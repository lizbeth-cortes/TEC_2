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
public class Automovil {
    private String marca;
    private String submarca;
    private int anio;
    private int kilometraje;
    private String transmision;

    public Automovil() {
    }

    public Automovil(String marca, String submarca, int anio, int kilometraje, String transmision) {
        this.marca = marca;
        this.submarca = submarca;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.transmision = transmision;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
    
    public String avanzar(int km){
        return "El automóvil ha avanzado " + km +" kilómetros...";
    }
    
    public String frenar(){
        return "El automóvil ha frenado...";
    }

    @Override
    public String toString() {
        return "Automovil" + "\n- Marca: " + marca + "\n- Submarca: " + submarca + "\n- Anio: " + anio + " \n- Kilometraje: " + kilometraje + "\n- Transmisión: " + transmision;
    }

    
    
}
