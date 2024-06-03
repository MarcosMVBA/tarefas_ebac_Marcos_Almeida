import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {

        String nome, s;
        
        Scanner t = new Scanner(System.in);

        System.out.print("\n Olá, informe o nome do aluno: ");

            nome = t.nextLine();
            
        System.out.println("\nIrei calcular a média do aluno(a):  " + nome );

        System.out.println("Digite Sim, para darmos continuidade.");

            s = t.nextLine();

            while (s.equals("Sim")) {

                System.out.print("\nInforme a Primeira nota: ");
                
                int n1 = t.nextInt();

                System.out.print("Informe a Segunda nota: ");

                int n2 = t.nextInt();

                System.out.print("Informe a Terceira nota: ");

                int n3 = t.nextInt();

                System.out.print("Informe a Quarta nota: ");

                int n4 = t.nextInt();

                int media = (n1 + n2 + n3 + n4)/4;

                

                if(media >= 7){
                    System.out.println("Parabens " + nome + ", Você está APROVADO!!" + " Sua nota foi " + media);

                }else if(media <= 4 ){

                    System.out.println("Infelizmente você foi reprovado." + " Sua nota foi " + media);
                }else{

                    System.out.println("Ficou de recuperação." + " Sua nota foi " + media);
                }
                
                System.out.println("\n \n Deseja calcular uma nova média? \n ");

                s = t.next(); 
                
            }    
            
            System.out.println("\nOk. Obrigado");


    }

   
}
