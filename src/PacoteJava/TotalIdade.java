package PacoteJava;
//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
// Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)


import java.util.Scanner;

public class TotalIdade {
    public static void main(String[] args) {
        int idade = 0, contador21 = 0, contador50 = 0;

        Scanner entrada = new Scanner(System.in);

        while (idade != -99) {
        System.out.println("\nDigite sua idade:");
        idade = entrada.nextInt();


            if (idade < 21) {
                contador21++;
            }
            if (idade > 50) {
                contador50++;
            }
            System.out.println("\nDigite -99 para encerrar: ");
        }

        System.out.println("\nO total de pessoas com menos de 21 anos é de: " + contador21);
        System.out.println("\nO total de pessoas com mais de 50 anos é de: " + contador50);
    }

}
