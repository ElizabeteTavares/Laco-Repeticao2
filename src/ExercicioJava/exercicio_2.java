package ExercicioJava;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

public class exercicio_2 {
    public static void main(String[] args) {
        int numero, contPar = 0, contImpar =0;

        for (numero = 0; numero < 10; numero++){

            if (numero % 2 == 0){
                contPar++;
            } else {
                contImpar++;
            }
        }
        System.out.println("\nQuantidade numeros pares: " + contPar);
        System.out.println("\nQuantidade numeros impares: " + contImpar);
    }
}
