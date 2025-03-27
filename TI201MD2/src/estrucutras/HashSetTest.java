package estrucutras;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main (String ... args) {
        // usar conjuetos
        Set<Integer> s1 = new HashSet<>();
        System.out.println("s1: " + s1.toString());
        
        // agregar
        s1.add(1);
        s1.add(2);
        s1.add(3);
        System.out.println("s1: " + s1.toString());
        
        // union
        Set<Integer> s2 = new HashSet<>();
        s2.add(3);
        s2.add(4);
        System.out.println("s2: " + s2.toString());
        
        s1.addAll(s2);
        System.out.println("s1:" + s1.toString());
        
        // elemento pertenece o no al conjunto
        System.out.println("5 e s1: " + s1.contains(5));        
        System.out.println("1 e s1: " + s1.contains(1)); 
        
        // restar un elemento o eliminar un elemento
        s1.remove(4);
        System.out.println("s1 - {4}: " + s1.toString());
        
        
        // 
        
    }
}
