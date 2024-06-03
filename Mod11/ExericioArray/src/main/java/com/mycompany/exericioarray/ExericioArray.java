

package com.mycompany.exericioarray;

/**
 *
 * @author Marcos
 */
import java.lang.reflect.Array;
import java.util.*;


public class ExericioArray {

    public static void main(String[] args) {
        
        ExercicioArray1();
        
    }

    private static void ExercicioArray1() {
        
        Scanner teclado = new Scanner(System.in);
        List<String> lista = new <String>ArrayList();
       
        System.out.println("Informe um nome e será adicionado à lista. Digite 'sair' para para o programa"); 
        
        while(true){
           String nome = teclado.next();
            
           if(nome.equalsIgnoreCase("sair")){
               
                System.out.println("Fim programa!!");
                break;
           }
           
           lista.add(nome);
           Collections.sort(lista);
           System.out.println(lista);
        }
    }
}
