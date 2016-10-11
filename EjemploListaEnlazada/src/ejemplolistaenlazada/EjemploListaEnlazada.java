
package ejemplolistaenlazada;

public class EjemploListaEnlazada {

    public static void main(String[] args) 
    {
        Lista lista = new Lista();
        //Adjuntando datos
        lista.addDato("Hola");
        lista.addDato("mundo");
        lista.addDato("aqui");
        lista.addDato("estoy");
  
        System.out.println("-------Imprimiendo datos-------");
  
        for(int i = 0;i < lista.getTamaño();i ++)
        {
            System.out.println(lista.getDato(i));
        }
    } 
}
