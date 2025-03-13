/*
* ITESS-TICS MATEMATICAS DISCRETAS 2
* Profesor: Francisco Javier Montecillo Puente
* Periodo: Enero-Junio 2025
* Programador: FJMP
* Descripsión: Clase Grafo
* 13-febrero-2025
*/
package tema1grafos;

public class GrafoTest {
    public static void main(String[] args) {
        System.out.println("test grafo:::::::");
        testGrafo();
        
        System.out.println("test grado:::::::");
        testGrado();
    }
    
    public static void testGrafo() {
        int[] v = {1,2,3};
        int[][] e = {{1,2}};

        Grafo g = new Grafo(v, e);
        
        System.out.println(g.toString());
    }
    
    public static void testGrado() {
        int[] v = {1,2,3,4};
        int[][] e = {{1,2},{1,1},{2,3}};
        
        Grafo g = new Grafo(v, e);
        System.out.println("gr(1)=" + g.grado(1)); 
        System.out.println("gr(2)=" + g.grado(2));
        System.out.println("gr(3)=" + g.grado(3));
        System.out.println("gr(4)=" + g.grado(4));
    }
}
