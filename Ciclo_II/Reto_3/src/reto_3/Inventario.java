/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_3;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author dsrom
 */
public class Inventario {

    private ArrayList<Vehiculo> vehiculo;
    private ArrayList<Integer> particular = new ArrayList<Integer>();
    private ArrayList<Integer> comercial = new ArrayList<Integer>();

    public Inventario() {
        vehiculo = new ArrayList();
    }

    public Inventario(ArrayList<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void agregarVehiculo(Vehiculo p){
        vehiculo.add(p);
    }
    
    public void listarInventario(){
        System.out.println("***Inventario de vehículos***");
        for (Vehiculo p : vehiculo) {
            System.out.println(p.toString());   
        }
    }
    public void listarTirilla(){
        System.out.println("CONCESIONARIO UNCAR\nUNCAR - UNIVA\nNIT: 899.999.063");
    }
    public void procesarComandos(){
        Scanner s= new Scanner(System.in);
        
        String comando[]=new String[6];
        String bandera="activo";
        while(bandera!="terminar"){
            comando=s.nextLine().split("&");
            Vehiculo p;
            if(comando[0].equals("1")){
                String Tipo=(comando[1]);
                int NumeroPasajeros = Integer.parseInt(comando[2]);
                int VelocidadMaxima = Integer.parseInt(comando[3]);
                String Placa = comando[4];
                if (comando[1].equals("Comercial")){
                    int PesoMaximo = Integer.parseInt(comando[5]);
                    p = new Comercial(NumeroPasajeros,VelocidadMaxima,Placa,Tipo,PesoMaximo);
                } else{
                    String Color = comando[5];
                    p = new Particular(NumeroPasajeros,VelocidadMaxima,Placa,Tipo, Color);
                }
                agregarVehiculo(p);
            }
            if(comando[0].equals("2")){
                listarInventario();
            }
            if(comando[0].equals("3")){
                particular.add(Integer.parseInt(comando[2]));
                comercial.add(Integer.parseInt(comando[4]));
                int sumaParticular = 0;
                    for (int i = 0; i < particular.size(); i++) {
                        int valor = (particular.get(i));
                        sumaParticular+=valor;
                    }
                int sumaComercial = 0;
                    for (int i = 0; i < comercial.size(); i++) {
                        int valor = (comercial.get(i));
                        sumaComercial+=valor;
                    }
                float poriva = 0;
                if (Integer.parseInt(comando[2])+Integer.parseInt(comando[4])>20){
                    poriva=0;
                }else{
                    poriva=(21-(Integer.parseInt(comando[2])+Integer.parseInt(comando[4])));
                }            
                int subtotal=(Integer.parseInt(comando[2])*30000000)+(Integer.parseInt(comando[4])*40000000); 
                long iva = (long) Math.ceil((subtotal*poriva)/100);
                int total = 0;
                total = (int) (subtotal+iva);
                if (sumaParticular>100 || sumaComercial>100){
                    System.out.println("Lo sentimos no tenemos stock suficiente");
                    System.out.println("---");
                }else{
                    listarTirilla();                
                    System.out.println("Cliente: "+comando[5]+"\nVehículo Cant Precio");
                    System.out.println("Particular x"+Integer.parseInt(comando[2])+" $30000000");
                    System.out.println("Comercial x"+Integer.parseInt(comando[4])+" $40000000");
                    System.out.println("Iva: $"+iva);
                    System.out.println("Total: $"+total);
                    System.out.println("---");
                }
                total=0;
            }
            if(comando[0].equals("4")){
                int sumaParticular = 0;
                    for (int i = 0; i < particular.size(); i++) {
                        int valor = (particular.get(i));
                        sumaParticular+=valor;
                    }
                int sumaComercial = 0;
                    for (int i = 0; i < comercial.size(); i++) {
                        int valor = (comercial.get(i));
                        sumaComercial+=valor;
                    }
                if (sumaParticular>100 || sumaComercial>100 ){
                    System.out.println("Particular: 100");
                    System.out.println("Comercial: 100");
                    System.out.println("---");
                }else{                   
                    int inventarioParticular = 100 - sumaParticular;
                    int inventarioComercial = 100 - sumaComercial;
                    System.out.println("Particular: "+inventarioParticular);
                    System.out.println("Comercial: "+inventarioComercial); 
                    System.out.println("---");
                }
            }
            if(comando[0].equals("5")){
                bandera="terminar";
            }
       }
        
    }
    public static void main(String[] args) {
        new Inventario().procesarComandos();
    }
    
}