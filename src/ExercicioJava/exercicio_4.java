package ExercicioJava;

//Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
// Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
// e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
// Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
//o número de pessoas calmas;
//o número de mulheres nervosas;
//o número de homens agressivos;
//o número de outros calmos;
//o número de pessoas nervosas com mais de 40 anos;
//o número de pessoas calmas com menos de 18 anos.

import java.util.Scanner;

public class exercicio_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int idade, sexo, opcao = 0, incremento = 0, calmas =0;
         int mulheresNervosas= 0, calmaMenos = 0,  homensAgressivos = 0;
         int outrosCalmos = 0, nervosasMais = 0;


        while (incremento < 2) {
            System.out.println("Informe sua idade: ");
            idade = entrada.nextInt();

            System.out.println("Opção sexual: \n1 - Masculino, \n2 - Feminino, \n3 - Outros");
            sexo = entrada.nextInt();

            System.out.println("Opção: \n1 - Calma, \n2 - Nervosa, \n3 - Agressiva");
            sexo = entrada.nextInt();


            if (opcao ==1) {
                calmas++;
            }

            if (sexo == 2 && opcao == 2) {
                mulheresNervosas++;
            }

            if (sexo == 1 && opcao == 3){
                homensAgressivos++;
            }
            if (sexo == 3 && opcao == 1){
                outrosCalmos++;
            }

            if (idade < 18 && opcao == 1){
                calmaMenos++;
            }
            incremento++;
        }

        System.out.println("Pessoas calmas: " + calmas);
        System.out.println("Mulheres nervosas: " + mulheresNervosas);
        System.out.println("Homens agressivos: " + homensAgressivos);
        System.out.println("Outros calmos: " + outrosCalmos);
        System.out.println("Pessoas acima de 40 nervosas: " + nervosasMais);
        System.out.println("Pessoas abaixo de 18 calmas: " + calmaMenos);
    }
}
