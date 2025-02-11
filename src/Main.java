import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //criando variaveis
        int numero1;
        int numero2;
        int soma;

        //declarando Scanner
        Scanner sc = new Scanner(System.in);

        //declarando numero 1
        System.out.println("Insira o primeiro numero:");
        numero1 = sc.nextInt();

        //declarando numero 2
        System.out.println("Insira o segundo numero:");
        numero2 = sc.nextInt();

        //soma
        soma = numero1 + numero2;
        System.out.println("o valor da soma é: " + soma);

    }
}
