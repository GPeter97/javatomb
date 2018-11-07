/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp_02_tomb;

import java.util.Random;

/**
 *
 * @author grabe
 */
public class JavaApp_02_tomb {

    
    public static void main(String[] args) {
       
        int[] tomb= veletlenEgeszTomb(3500,-10, 25);
        for (int item : tomb) {
            System.out.println(item);
        }
    }
    public static int[] veletlenEgeszTomb(int db, int min, int max){
        Random rnd = new Random();
        int[] t= new int[db];
        for (int i = 0; i < db; i++) {
           // t[i]=(int)(Math.random()*(max-min)+min);
           t[i]=(int)(rnd.nextDouble()*(max-min)+min);
        }
        
        return t;
    }
}
