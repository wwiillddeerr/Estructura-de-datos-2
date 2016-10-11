
package ejercicio5;
import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) 
    {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(59);
        lista.add(46);
        lista.add(61);
        
        int tamaño = lista.size();
        System.out.println("El número de elementos es de: " + tamaño);
        
        for (int i = 0; i < lista.size(); i++) 
        {
            System.out.println(lista.get(i));          
        }   
    }
    
}
