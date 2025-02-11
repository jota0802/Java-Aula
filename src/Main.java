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


        //declarando variaveis

        //declarando Nome
        System.out.println("Insira seu Nome");
        String nome = sc.nextLine();

        //declarando Idade
        System.out.println("Insira sua idade");
        int idade = sc.nextInt();

        //declarando Endereco
        System.out.println("Insira seu Endereco");
        String endereco = sc.next();

        System.out.println("Olá " + nome + '!');
        System.out.println("endereço: " + endereco);
        System.out.println("idade: " + idade);

        //porque o nextLine nao funciona no ultimo? pq se n tem nenhum comando depois nao funciona, ou porque tem string e int juntos
    }
}
