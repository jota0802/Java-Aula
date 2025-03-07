import java.util.Scanner;

public class Exercicios{
    public static void main(String[] args){
        
        //declarando scanner
        Scanner scannerNumero = new Scanner(System.in);

        //prints veios
        System.out.println("Digite o primeiro número: ");
        int numero1 = scannerNumero.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = scannerNumero.nextInt();

        System.out.println("Digite o terceiro número: ");
        int numero3 = scannerNumero.nextInt();

        
        int teste; //variavel feita pra armazenar o valor de uma variavel para fazer a troca de valores, assim auxiliando no if else
        boolean controleloop = false; //variavel de controle para o loop while
                
                while (!controleloop) {
                    controleloop = true;
                    //condicional para verificar se o numero1 é maior que o numero2
                    if (numero1 > numero2) {
                        teste = numero1;
                        numero1 = numero2;
                        numero2 = teste;
                        controleloop = false;
                    }
                    //condicional para verificar se o numero2 é maior que o numero3
                    if (numero2 > numero3) {
                        teste = numero2;
                        numero2 = numero3;
                        numero3 = teste;
                        controleloop = false;
                    }
                }
        //print dos numeros em ordenados 
        System.out.println("Números em ordem crescente: " + numero1 + ", " + numero2 + ", " + numero3);
        scannerNumero.close();
    }
}
