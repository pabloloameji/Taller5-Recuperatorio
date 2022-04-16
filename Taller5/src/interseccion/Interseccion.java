/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interseccion;

import edu.princeton.cs.algs4.StdOut;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 

/**
 *
 * @author Pablo
 */
public class Interseccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Comparable[] a = {1, 2, 3 ,4};
            Comparable[] b = {3, 4, 5, 6};
            
            Comparable[] c = {3, 5, 1, 7};
            Comparable[] d = {2, 1, 8, 7, 3};
            
            Taller5 conjuntoOrdenado = new Taller5(a, b);
            Taller5 conjuntoNoOrdenado = new Taller5(c, d);
            
            StdOut.println(conjuntoOrdenado.interseccionOrdenados());
            StdOut.println(conjuntoNoOrdenado.interseccionNoOrdenados());
            
        } catch (Exception error){
            StdOut.print("An error has been ocurred. Code: " + error);
        }
    }
    
}
