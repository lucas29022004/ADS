package associacao;

import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {

        char resp;

        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        Endereco ende = new Endereco();

        Pessoa p = new Pessoa();

        System.out.println("Digite seu nome");
        p.setNome(scStr.nextLine());

        System.out.println("Digite sua idade");
        p.setIdade(sc.nextInt());


        System.out.println("Digite seu sexo");
        p.setSexo(sc.next().charAt(0));



        System.out.println("Digite seu Endereço");
        ende.setLogradouro(scStr.nextLine());
        
      

        System.out.println("Digite o numero");
        ende.setNumero(sc.nextInt());


        System.out.println("Tem complemento? (s/n)");
        resp=sc.next().charAt(0);

        
        if(resp=='s'){
            System.out.println("Digite qual o complemento");
            ende.setComplemento(scStr.nextLine());

            System.out.println("Digite qual o cep");
            ende.setCep(scStr.nextLine());

            p.setEnd(ende);

            System.out.println("");
            System.out.println("");
            System.out.println(p.Imprimir());

        }
        else{
             ende.setComplemento("Não tem");

             System.out.println("Digite qual o cep");
             ende.setCep(scStr.nextLine());

             p.setEnd(ende);
             
             System.out.println("");
             System.out.println("");
             System.out.println(p.Imprimir());

            
        }
        

    }
}
