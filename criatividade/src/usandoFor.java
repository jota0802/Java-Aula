import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class usandoFor{
    public static void main(String[] args) {
        
        Scanner scannerNumber = new Scanner (System.in);
        Scanner scannerString = new Scanner (System.in);
        

        //ex1

        //dicionario usando map
        Map<String, Double> salarioPorNome = new HashMap<>();

        //adicinando elementos

        System.out.println("Insira o numero de funcionarios a serem adicionados: ");
        double numeroFuncionarios = scannerNumber.nextDouble();

        //loop para adicionar os dados do funcionario no Map
        for ( int i = 1; i < (numeroFuncionarios + 1); i++ ){

            //Nome
            System.out.println("Insira o Nome do Funcionario "+ i+":");
            String NomeFuncionario = scannerString.nextLine();

            //Salario
            System.out.println("Insira o Salario do Funcionario "+i+":");
            double salarioFuncionario = scannerNumber.nextDouble();

            //Adicionando Funcionarios e Salarios ao Map
            salarioPorNome.put(NomeFuncionario, salarioFuncionario);
        }
        for (Map.Entry<String, Double> entrada : salarioPorNome.entrySet()){
            System.out.println("O Funcionario " + entrada.getKey() + " recebe: " +entrada.getValue() + " R$" );
        }

    }   
}
