/*
* ITESS-TICS MATEMATICAS DISCRETAS 2
* Profesor: Francisco Javier Montecillo Puente
* Periodo: Enero-Junio 2025
* Programador: FJMP
* Descripsión: Clase Grafo
* 13-febrero-2025
*/
package tema1grafos;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    protected List<Integer> v;
    protected List< List<Integer>> e;
    
    public Grafo() {
        v = new ArrayList<>();
        e = new ArrayList<>();
    }
    
    public Grafo(int[] v, int[][] e) {
        this.v = new ArrayList<>();
        this.e = new ArrayList<>();
        
        for (int i = 0; i < v.length; i++) {
            this.v.add(v[i]);
        }
        
        for (int i = 0; i < e.length; i++) {
            List<Integer> arista = new ArrayList<>();
            arista.add(e[i][0]);
            arista.add(e[i][1]);
            this.e.add(arista);
        }
    }
    
    public void agregarVertice(int v) {
        this.v.add(v);
    }
    
    public void agregarArista(int vInicio, int vTermina) {
        List<Integer> arista = new ArrayList<>();
        arista.add(vInicio);
        arista.add(vTermina);
        
        this.e.add(arista);
    }

    public int grado(int v) {
        int grado = 0;
        for (List<Integer> arista : this.e) {
            if (v == arista.get(0))
                grado++;
            if (v == arista.get(1))
                grado++;
        }
       return grado;
    }
    
    @Override
    public String toString() {
        return "Grafo{" + "v=" + v.toString() + ", e=" + e.toString() + '}';
    }
}
