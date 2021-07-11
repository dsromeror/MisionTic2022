/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_3;

/**
 *
 * @author dsrom
 */
public class Particular extends Vehiculo {
    
    private String color;
    
    public Particular(int numeroPasajeros, int velocidadMaxima, String placa, String Tipo,String color) {
        super(numeroPasajeros, velocidadMaxima, placa, Tipo);
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public void setPlaca(String placa) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        
        String s="";
        s+="\tVehículo "+Tipo+" - Placa: "+placa+"\n";
        s+="\tvelocidad: "+velocidadMaxima+" km/h\n";
        s+="\tpasajeros: "+numeroPasajeros+"\n";
        s+="\tcolor: "+color;
        return s;
    }
}
