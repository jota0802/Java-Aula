import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner scannerNumber = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        System.out.println("Insira Sua Idade");
        int anos = scannerNumber.nextInt();
        System.out.println("Insira a quantos meses vc fez aniversario");
        int meses = scannerNumber.nextInt();

        System.out.println("Sua idade é: "+anos+" anos e "+meses+" meses");

    }
}