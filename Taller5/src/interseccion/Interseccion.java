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
            Comparable[] a = {"A", "B", "C", "H"};
            Comparable[] b = {"B", "C", "H"};
            
            Comparable[] c = {3, 5, 1, 7};
            Comparable[] d = {2, 1, 8, 7, 3};
            
            Comparable[] e = {"A", "B", "C"};
            Comparable[] f = {"B", "C", "H"};
            
            StdOut.println(Taller5.interseccionOrdenados(a, b));
            StdOut.println(Taller5.interseccionOrdenados(e, f));
            StdOut.println(Taller5.interseccionNoOrdenados(c, d));
            
            
            
        } catch (Exception error) {
            StdOut.print("An error has been ocurred. Code: " + error);
        }
    }

}
