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
public class Comercial extends Vehiculo{
    
    private int peso_maximo;
    
    public Comercial(int numeroPasajeros, int velocidadMaxima, String placa, String Tipo,int peso_maximo) {
        super(numeroPasajeros, velocidadMaxima, placa, Tipo);
        this.peso_maximo = peso_maximo;
    }
    
    public int getPesoMaximo() {
        return peso_maximo;
    }

    public void setPesoMaximo(int peso_maximo) {
        this.peso_maximo = peso_maximo;
    }
    
    @Override
    public String toString() {
        
        String s="";
        s+="\tVehículo "+Tipo+" - Placa: "+placa+"\n";
        s+="\tvelocidad: "+velocidadMaxima+" km/h\n";
        s+="\tpasajeros: "+numeroPasajeros+"\n";
        s+="\tCarga máxima: "+peso_maximo+"kg";
        return s;
    }
}