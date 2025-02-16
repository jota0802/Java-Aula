import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class usandoFor2{
    public static void main(String[] args){

        //criando Scanners

        Scanner scannerNumber = new Scanner(System.in);

        //exercicio 2 : filtro lista

        // lista base
        List<Double> listaNumeros = new ArrayList<>();

        // lista dos numeros pares

        List<Double> listaNumerosPares = new ArrayList<>();

        System.out.println("Insira quantos numeros voce deseja filtrar:");
        double numeroContagem = scannerNumber.nextDouble();

        for (int i = 0 ; i < numeroContagem ; i++){

            System.out.println("Insira os numeros que voce deseja filtrar:");
            double numeroAdicionado = scannerNumber.nextDouble();
            listaNumeros.add(numeroAdicionado);

        }

        for(double numero : listaNumeros){
            if (numero % 2 == 0){
                listaNumerosPares.add(numero);
            }
        }
        System.out.println("Os numeros filtrados sao: "+listaNumerosPares);

    }
}