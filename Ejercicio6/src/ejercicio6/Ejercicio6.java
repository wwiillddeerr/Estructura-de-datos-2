
package ejercicio6;

public class Ejercicio6 {

    public static void main(String[] args) 
    {
        int arreglo[] = {50, 26, 7, 9, 15, 27};
        int aux;
        for (int i = 0; i < arreglo.length - 1; i++) 
        {
            for (int j = i+1; j < arreglo.length ; j++) 
            {
                if (arreglo[i] > arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=aux;
                }                       
            }
        }
        for (int k = 0; k < arreglo.length; k++)
        {            
            System.out.print(arreglo[k] + " ");
        } 
    }
    
}
