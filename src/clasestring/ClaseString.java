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
                 
                 // Comparacion de cadenas(diccionario)
                 //Devuelve cero si las cadenas son iguales
                 // un positivio si  s1 esta antes de s2 en el diccionario(menor)
                 // negativo si  s1 esta despues de s2 en el diccionario ( mayor)
                 int compareTo = s1.compareTo(s1);
                 System.out.println("Comparacion de s1 y s1 :"+ compareTo);
                 compareTo = s1.compareTo("aes");
                  System.out.println("Comparacion de s1 y aes :"+ compareTo);
                   compareTo = "aes".compareTo(s1);
                  System.out.println("Comparacion de aes y s1 :"+ compareTo);
                  
                  // Conversion mayusculas y minusculas
                  System.out.println("s2 en mayus:"+ s2.toUpperCase());
                  System.out.println(" s2 en minusculas "+ s2.toLowerCase());
                  String espacios = " palabra  palabra pasapalabra ";
                  System.out.println("Tamaño de espacios: " +espacios.length());
                  
                  // quitar espacios delante y detras
                  String sinEspacios = espacios.trim();
                  System.out.println("Tamaño de sinEspacios"+ sinEspacios.length());
                  
                  //Reemplazo de caracteres
                  System.out.println("String original: "+ s2);
                  String str2 = s2.replace('e','x');
                  System.out.println("String reemplazado :"+ str2);
                  
                  // Conteido 
                  String aBuscar = "unt"; 
                  System.out.println("Contiene "+ s2+ " la subcadena "+ aBuscar + " ? "+ s2.contains(aBuscar));
                  
                  // Probar metodos endsWith, startsWith, isEmpty
                  
                  
                  //Obtener un array de char de la cadena
                  
                  // Declaracion de una variable array de tipo char
                  char[] arrayChar ;
                  arrayChar = s2.toCharArray();
                  System.out.println(arrayChar);
                  // el atributo length existe e todos los arrays y 
                  // me indica su tamaño equivalente al metodo length()
                  // de los String
                  for(int i = 0 ; i < arrayChar.length; i++){
                  // para acceder a cada posicion del array uso 
                  // los corchetes
                      System.out.println("Posicion i ="+ i+"contenido = "+ arrayChar[i]);
                  }
    
    }
    
    
    
}
