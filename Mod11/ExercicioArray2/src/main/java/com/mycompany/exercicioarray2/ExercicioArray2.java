

package com.mycompany.exercicioarray2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class ExercicioArray2 {

    public static void main(String[] args) {
        
        ListaGeneros();
    }

    private static void ListaGeneros() {
        
    Scanner scanner = new Scanner(System.in);
        List<String> listaDeHomens = new <String> ArrayList();
        List<String> listaDeMulheres = new <String> ArrayList();
       
        while (true) {

    System.out.print("Digite um nome e gênero (Exemplo: Jose-M ou Maria-F) ou 'sair' para encerrar: ");

    String entrada = scanner.nextLine();

    if (entrada.equalsIgnoreCase("sair")) {
        
        //Quando o user digita "Sair", irá aparecer todos os nomes digitados em uma lista separada por genero.
        
        System.out.println("****Lista de Homens****");
        System.out.println(listaDeHomens);
        System.out.println("****Lista de Mulheres****");
        System.out.println(listaDeMulheres);

        break;

    } else {

        String[] partes = entrada.split("-");

        if (partes.length == 2) {

            String nome = partes[0];

            String genero = partes[1];

            if (genero.equalsIgnoreCase("M")) {
                
                System.out.println("*****LISTA DE HOMENS****");

                listaDeHomens.add(nome);
                Collections.sort(listaDeHomens);
                System.out.println(listaDeHomens);
                

            }else if(genero.equalsIgnoreCase("F")){
                
                
                System.out.println("****LISTA DE MULHERES****");
                listaDeMulheres.add(nome);
                Collections.sort(listaDeMulheres);
                System.out.println(listaDeMulheres);
        }
       }
     }
   }
  }
}
