import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Carro{
    String modelo;
    int ano;

    //declarando as informacoes do carro
    public Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }


    //funcao para printar os valores do carro
    public void exibirInformacoes(){
        System.out.println("");
        System.out.println("Modelo do Carro: "+modelo);
        System.out.println("Ano do Carro: "+ ano);
    }
}

public class carroExemplo{
    public static void main(String[] args){
        
        //criando lista de carros
        List<Carro> carros = new ArrayList<>();
        
        //criando scanners
        Scanner scannerNumber = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        
        System.out.println("Insira quantos carros deseja cadastrar:");
        int carrosCadastrados = scannerNumber.nextInt();

        for(int i = 0; i < carrosCadastrados ; i++){

            //cadastrando o modelo
            System.out.println("Insira o modelo do carro");
            String modelo = scannerString.nextLine();

            //cadastro o ano 
            System.out.println("Insira o ano do carro");
            int ano = scannerNumber.nextInt();

            //criando objeto        
            Carro carro = new Carro(modelo,ano);

            //adicionando o carro a lista
            carros.add(carro);
        }

        
        for (Carro carro : carros){
            carro.exibirInformacoes();
        }


    }
}