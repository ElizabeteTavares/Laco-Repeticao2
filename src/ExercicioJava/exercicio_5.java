package ExercicioJava;

//Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final,
// mostre a soma dos números digitados.(DO...WHILE)

import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {
        int numero = 0, somaTotal = 0;
        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("\nDigite um numero, para sair digite 0: ");
            numero = ler.nextInt();

            somaTotal += numero;
        } while (numero != 0);
        System.out.println("A soma dos numeros digitados é: " + somaTotal);
    }
}
