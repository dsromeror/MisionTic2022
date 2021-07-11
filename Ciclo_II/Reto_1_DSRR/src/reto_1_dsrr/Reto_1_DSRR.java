/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_1_dsrr;

import java.util.Scanner;

public class Reto_1_DSRR {

    public static String groot(int n){
        String s="";  
        for (int i = 1; i < n; i++) {
            if(i==1) s+= "";
              else {
                  if(i%2==0) s+=" that I groot";
                  if(i%2!=0) s+=" that I am";
              }
        }
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println("I am" + groot(n+1) + " it");
    }
}