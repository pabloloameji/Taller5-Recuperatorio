/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interseccion;

import edu.princeton.cs.algs4.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pablo
 */
public class Taller5 {
    
    private Comparable[] a;
    private Comparable[] b;
    
    public Taller5(Comparable[] a, Comparable[] b) {
        this.a = a;
        this.b = b;
    }
    
    public List<Comparable> interseccionOrdenados() {
        List<Comparable> interseccion = new ArrayList<Comparable>();
        
        for(Comparable i : a) {
            for(Comparable j : b) {
                if(j.equals(i)) {
                    interseccion.add(j);
                }
            }
        }
        return interseccion; 
    }
    
    public List<Comparable> interseccionNoOrdenados() {
        List<Comparable> interseccion = new ArrayList<Comparable>();
        
        Quick3way.sort(a);
        Quick3way.sort(b);
        
        for(Comparable i : a) {
            for(Comparable j : b) {
                if(j.equals(i)) {
                    interseccion.add(j);
                }
            }
        }
        
        return interseccion;
    }
    
   
    
}
