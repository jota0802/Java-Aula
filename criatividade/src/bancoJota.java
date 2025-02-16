import java.util.Scanner;


class ContaBancaria{
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    //criando funcao depositar
    public void depositar(double valor){
        if(valor>0){
            saldo+=valor;
            System.out.println("O deposito de: " +valor+ " Reais foi realizado com sucesso! o seu saldo atual e de: "+saldo+" Reais");
        }
        else if(valor <=0){
            System.out.println("Valor inserido invalido");
        }
        
        else{
            System.out.println("Erro ao realizar deposito");
        }
    }
    //criando funcao sacar
    public void sacar(double valor){
        if(valor > 0 && saldo>=valor){
            saldo-=valor;
            System.out.println("O saque de: "+valor+" Reais foi realizado com sucesso!");
        }
        else if(valor <=0){
            System.out.println("Valor inseiro invalido");
        }
        else{
            System.out.println("Saldo insuficiente, seu saldo atual e de: "+saldo+" Reais");
        }
    }
    public void exibirSaldo(){
        System.out.println("O saldo disponivel e de: "+saldo+" Reais");
    }
}

public class bancoJota{
    public static void main(String[] args){

        //criando scanner 
        Scanner scannerNumber = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);


        //criando titular da conta
        System.out.println("Insira o nome do Titular da Conta:");
        String titular = scannerString.nextLine();


        //criando saldo inicial
        System.out.println("Insira o saldo inicial a ser adicionado");
        double saldo = scannerNumber.nextDouble();  

        ContaBancaria conta = new ContaBancaria(titular, saldo);

        //fazendo menuzinho
        int menuzinho;
        do { 
            System.out.println("\nMenu:");
            System.out.println("0 - Depositar");
            System.out.println("1 - Sacar");
            System.out.println("2 - Ver Saldo");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            menuzinho = scannerNumber.nextInt();
            
        switch (menuzinho) {
            //depositanto na conta
            case 0:
                System.out.println("Qual valor deseja depositar?");
                double deposito = scannerNumber.nextDouble();
                conta.depositar(deposito);
                break;
            //sacando na conta
            case 1:
                System.out.println("Qual valor deseja sacar?");
                double saque = scannerNumber.nextDouble();
                conta.sacar(saque);
                break;
            //saldo da conta
            case 2:
                conta.exibirSaldo();
                
                break;
            //saindo da conta
            case 3:
                System.out.println("Encerrando o programa");
        } 
        }while(menuzinho != 3);
    }
}