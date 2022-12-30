package ExercicioJava;

//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
// Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        int idade = 0, contMenor = 0, contMaior = 0;
        Scanner entrada = new Scanner(System.in);

        while (idade != -99){
        System.out.println("digite uma idade: ");
        idade = entrada.nextInt();

        if (idade < 21) {
            contMenor++;
        }
        if (idade > 50) {
            contMaior++;
          }
        }
        System.out.println("\nQuatidade de pessoas maiores que 50 anos: " + contMaior);
        System.out.println("\nQuantidade de pessoas menores que 21 aos: " + contMenor);

        System.out.println( "\nFim da execução, foi digitado: -99");
    }
}
