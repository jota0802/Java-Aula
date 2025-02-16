import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class usandoFor{
    public static void main(String[] args) {
        
        Scanner scannerNumber = new Scanner (System.in);
        Scanner scannerString = new Scanner (System.in);
        
        List<Double> listaSomaSalarios = new ArrayList<>();

        double somaSalarios = 0.0;
        
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
            listaSomaSalarios.add(salarioFuncionario);

            //Adicionando Funcionarios e Salarios ao Map
            salarioPorNome.put(NomeFuncionario, salarioFuncionario);
        }
        for (Map.Entry<String, Double> entrada : salarioPorNome.entrySet()){
            System.out.println("O Funcionario " + entrada.getKey() + " recebe: " +entrada.getValue() + " R$" );
        }
        for (double numeroLista : listaSomaSalarios){
            somaSalarios += numeroLista;
        }
        System.out.println("A soma dos salarios dos funcionarios é de: "+somaSalarios);

    }   
}