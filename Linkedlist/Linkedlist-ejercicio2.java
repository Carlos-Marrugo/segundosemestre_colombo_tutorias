package linkdlist;

import java.util.*;

public class Linkdlist {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        LinkedList<Integer> numeros = new LinkedList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        
        System.out.print("Lista de numeros: "+numeros);
        
        System.out.println("Ingrese numero a insertar al inicio: ");
        int numeroInicio = entrada.nextInt();
        numeros.addFirst(numeroInicio);
        System.out.println("Numeros actualizados: "+numeros);
        
        System.out.println("Ingrese numero a insertar al final: ");
        int numeroFinal = entrada.nextInt();
        numeros.addLast(numeroFinal);
        System.out.println("Numeros actualizados: "+numeros);
        
        
        
    }
    
}
