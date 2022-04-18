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
    
    public static List<Comparable> interseccionOrdenados(Comparable[] a, Comparable[] b) {
        List<Comparable> interseccion = new ArrayList<Comparable>();
        for(Comparable i: a) {
            for(Comparable j : b) {
                if(j.equals(i)) {
                    interseccion.add(j);
                } else if (less(i , j)) {
                    break;
                }
            }
            
        }
        return interseccion; 
    }
    
    public static List<Comparable> interseccionNoOrdenados(Comparable[] a, Comparable[] b) {
        Taller5.sort(a);
        Taller5.sort(b);
        return interseccionOrdenados(a,b);
    }
    
    
    //QuickShort
    
    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
        assert isSorted(a);
    }

    private static void sort(Comparable[] a, int lo, int hi) { 
        if (hi <= lo) return;
        int lt = lo, gt = hi;
        Comparable v = a[lo];
        int i = lo + 1;
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if      (cmp < 0) exch(a, lt++, i++);
            else if (cmp > 0) exch(a, i, gt--);
            else              i++;
        }
        sort(a, lo, lt-1);
        sort(a, gt+1, hi);
        assert isSorted(a, lo, hi);
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
       
    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }

    private static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }
    
}
