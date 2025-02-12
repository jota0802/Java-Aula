import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //criando variaveis
        int numero1;
        int numero2;
        int soma;

        //declarando Scanner
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerNumber = new Scanner(System.in);

        //declarando numero 1
        System.out.println("Insira o primeiro numero:");
        numero1 = scannerNumber.nextInt();

        //declarando numero 2
        System.out.println("Insira o segundo numero:");
        numero2 = scannerNumber.nextInt();

        //soma
        soma = numero1 + numero2;
        System.out.println("o valor da soma é: " + soma);


        //declarando variaveis

        //declarando Nome
        System.out.println("Insira seu Nome");
        String nome = scannerString.nextLine();

        //declarando Idade
        System.out.println("Insira sua idade");
        int idade = scannerNumber.nextInt();

        //declarando Endereco
        System.out.println("Insira seu Endereco");
        String endereco = scannerString.nextLine();

        System.out.println("Olá " + nome + '!');
        System.out.println("endereço: " + endereco);
        System.out.println("idade: " + idade);

        //porque o nextLine nao funciona no ultimo? pq se n tem nenhum comando depois nao funciona, ou porque tem string e int juntos, dai por isso criamos dois scanners diferentes
    }
}
