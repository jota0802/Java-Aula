import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


        public class usandoFor1{
            public static void main(String[] args){

                //Criando Scanners

                Scanner scannerNumber = new Scanner(System.in);
                Scanner scannerString = new Scanner(System.in);

                //exemplo 1 : soma de lista

                //criando Lista
                List<Double> listaNumeros = new ArrayList<>();
                //criando Soma
                double soma = 0;

                //pedindo a quantidade de numeros para se somar
                System.out.println("Insira quantos numeros a adicionar na lista")
                double numeroContagem = scannerNumber.nextDouble();

                //criando condicional da quantidade
                for(int i = 0; i<numeroContagem; i++){
                    //print
                    System.out.println("Insira o "+(i+1)+"º numero");
                    //criando variavel do numero com o scanner
                    double numeroAdicionado = scannerNumber.nextDouble();
                    //adicionando numeros a lista
                    listaNumeros.add(numeroAdicionado);
                }
                for (double numero : listaNumeros){
                    soma+=numero;
                }

                System.out.println("A soma dos numeros é: "+ soma)
            }
        }