/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasestring;

/**
 *
 * @author andrei
 */
public class ClaseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String s = "Iesmaralboran.com";
      // tamaño de la cadena
        System.out.println("Tamaño: "+ s.length());
        
        // obtener el char de una posicion concreta
        System.out.println("Char almacenado en la posicion 5: "+ s.charAt(5));
        
        // obtener subcadena desde el caracter i-esimo hasta el final 
        // de la cadena
        String subcadena = s.substring(8,17);
        // le quitaria los 3 primeros 
        System.out.println("Subcadena = "+ subcadena);
        
        // concatenar cadenas . equivale al operador +
        String s1 = "ies";
        String s2 = "untre";
        String nuevo = s1+s2;
        String nuevo2 = s1.concat(s2);
        System.out.println(nuevo);
        System.out.println(nuevo2);
        
        // devuelve el indice dentro de la cadena
        // de la primera aparicion de la cadena a buscar 
        int indice = nuevo.indexOf("unt");
                System.out.println("Indice :"+ indice);    
                indice = nuevo.indexOf("tre", 4);
                 System.out.println("Indice :"+ indice);  
                 
                 // Metodo equals y equalsIgnoreCase
                 System.out.println("Igualdad Java y java "+ "Java".equals("java"));
                 System.out.println("Igualdad Java y java(IGNORE CASE) "+ "Java".equalsIgnoreCase("java"));
    }
    
    
    
}
