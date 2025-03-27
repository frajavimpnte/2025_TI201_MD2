package tema1grafos;

import java.util.ArrayList;
import java.util.List;


public class GrafoPonderado extends Grafo{
    private List<Integer> w;
    
    public GrafoPonderado() {
        super();
        this.w = new ArrayList<>();
    }
    
    public GrafoPonderado(int[] v, int[][] e, int [] w) {
        super(v,e);
        
        this.w = new ArrayList<>();
        for (int i = 0; i < w.length; i++) {
            this.w.add(w[i]);
        }
    }

    public void agregarArista(int vInicio, int vTermina, int w) {
        super.agregarArista(vInicio, vTermina);
        this.w.add(w);
    }
    
    private int calcularMyINF() {
        int INF = 0;
        for (Integer w: this.w) {
            INF += w;
        }
        return INF+1;
    }
    
    public void dijkstra(int verticeInicial, int verticeFinal) {
        int a = verticeInicial;
        int z = verticeFinal;
        
        int myINF = calcularMyINF();
        
        System.out.println("myINF: " + myINF);
        
        // paso 1. inicializar T
        Grafo T = new Grafo();
        T.agregarVertice(a);
        
        // paso 2. inicializar L
        int[] L = new int[v.size() + 1];
        for (int i=0; i < L.length; i++) {
            L[i] = myINF;
        }
        L[a] = 0;
        
        // paso 3. 
        
        
    }
    
    @Override
    public String toString() {
        return    super.toString() +   ", pesos{" + "w=" + w.toString() + '}';
    }
}
