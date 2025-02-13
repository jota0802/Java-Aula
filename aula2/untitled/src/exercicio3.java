import java.util.Scanner;

public class exercicio3{
    public static void main(String[] args){
        Scanner scannerNumber = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        //ex2

        int mediaAritimetica = (9+8+7)/3;
        int media = (4+5+6)/2;
        int somaMedias = media + mediaAritimetica;
        int mediaMedias = (media + mediaAritimetica)/2;

        System.out.println(media);
        System.out.println(mediaAritimetica);
        System.out.println(somaMedias);
        System.out.println(mediaMedias);
        
        //ex3

        System.out.println("insira um saldo");
        double saldo = scannerNumber.nextDouble();
        
        double reajuste = (saldo * 1.1) ;

        System.out.println("O resjuste com 1% é de: "+ reajuste);

        //ex4

        System.out.println("insira um numero: ");
        double numero = scannerNumber.nextDouble();
        double numeroAnt = (numero - 1);
        System.out.println("O numero antecessor ao informado é: "+ numeroAnt);

        //ex5

        System.out.println("Insira seu salario: ");
        double salario = scannerNumber.nextDouble();
        double salariosMinimos = (salario/1518);

        System.out.println("A quantidade de Salarios minimos do usuario é:"+salariosMinimos);


        //ex6 

        //raio
        System.out.println("Insira o Raio da lata: ");
        double raio = scannerNumber.nextDouble();
        //Altura
        System.out.println("Insira a Altura da Lata: ");
        double altura = scannerNumber.nextDouble();
        
        double formulaVolume = 3.1415*altura*(raio*raio);

        System.out.println("O volume da lata fornecida e aproximadamente: "+formulaVolume);


    }
}