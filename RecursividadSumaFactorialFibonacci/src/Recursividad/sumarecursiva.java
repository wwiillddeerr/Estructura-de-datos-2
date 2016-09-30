
package Recursividad;

public class sumarecursiva 
{
    public static int sumarecursiva (int numero) 
    {
        if (numero==0)
        return 0;
        else
        return numero + sumarecursiva(numero-1);
    }
    
    public static void main(String[] args) 
    {
        System.out.println(sumarecursiva(3));    
    }
}
