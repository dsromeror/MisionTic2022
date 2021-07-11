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
public abstract class Vehiculo {
    protected int numeroPasajeros;
    protected int velocidadMaxima;
    protected String placa;
    protected String Tipo;
    
    public Vehiculo(){
        numeroPasajeros=0;   
    }
    
    public Vehiculo(int numeroPasajeros, int velocidadMaxima, String placa, String Tipo){
        this.numeroPasajeros = numeroPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.placa = placa;
        this.Tipo = Tipo;
    }
 
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public abstract String toString();
         
}

