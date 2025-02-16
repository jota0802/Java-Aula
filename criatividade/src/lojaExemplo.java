import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Loja{

    String nome;
    double preco;

    //declarando valores
    public Loja(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    //funcao printar informacoes dos produtos
    public void exibirInfoProduto(){
        System.out.println("O produto: "+nome+"custa: "+preco+ " Reais");
    }
}

    public class lojaExemplo{
        public static void main(String[] args){

            //criando scanners
            Scanner scannerNumber = new Scanner(System.in);
            Scanner scannerString = new Scanner(System.in);

            //criando lista
            List<Loja> produtos = new ArrayList<>();

            System.out.println("Insira quantos produtos deseja adicionar a loja");
            int contadorProdutos = scannerNumber.nextInt();

            for (int i = 0; i < contadorProdutos; i++){

                // o nome do produto
                System.out.println("Insira o Nome do Produto");
                String nome = scannerString.nextLine();

                // o preco do produto
                System.out.println("Insira o Preco do produto");
                double preco = scannerNumber.nextDouble();

                Loja produto = new Loja(nome, preco);

                produtos.add(produto);
            }

            for (Loja produto : produtos){
                produto.exibirInfoProduto();
            }


        
        }
    }
