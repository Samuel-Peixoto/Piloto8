import java.io.Console;
import java.util.Scanner;

import Modelo.Pessoa;
import Modelo.Piloto;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Informe quantos pilotos quer cadrastar : ");
        Scanner ler = new Scanner(System.in);
        int tamanho = ler.nextInt();
        Piloto[] pilotos = new Piloto[tamanho];

        for (int i = 0; i < tamanho; i++) {
            Piloto piloto = new Piloto();
            ler.nextLine();

            System.out.println("Informe o nome do piloto : ");
            piloto.setNome(ler.nextLine());

            System.out.println("Informe o cpf do piloto : ");
            piloto.setCpf(ler.nextLine());
            // digite o cpf e aperte enter 2 vezes para continuar

            pilotos[i] = piloto;

        }
        for (int i = 0; i < pilotos.length; i++) {
            System.out.println();
            System.out.println("O nome do piloto cadastrado é : " + pilotos[i].getNome());
            System.out.println("O cpf do piloto cadastrado é : " + pilotos[i].getCpf());
            System.out.println();
            System.out.println("-------------------------------------------------------");
            System.out.println();
            System.out.println();
        }
        System.out.println("Informe o cpf do pilotos que procura : ");
        
        String nextLine = ler.nextLine();
        for (int i = 0; i < tamanho; i++) {

           

            String cpf = pilotos[i].getCpf();
            if (cpf.equals(nextLine)) {
                
                System.out.println("O nome do piloto listado pelo cpf é : " + pilotos[i].getNome());
            

            }

        }
        System.out.println("Em quanto você quer aumentar o vetor");
        int aumento = ler.nextInt();
        Piloto[] novospilotos = new Piloto[tamanho + aumento];
        
    
    } 
}
