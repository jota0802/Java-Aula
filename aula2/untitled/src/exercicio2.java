import java.util.Scanner;

        public class exercicio2{
            public static void main(String[] args){

                Scanner scannerNumber = new Scanner(System.in);
                Scanner scannerString = new Scanner(System.in);

                System.out.println("Insira o nome do primeiro funcionario:");
                String funcionario1 = scannerString.nextLine();

                System.out.println("Insira o salario do primeiro funcionario:");
                int salario1 = scannerNumber.nextInt();

                System.out.println("Insira o nome do segundo funcionario:");
                String funcionario2 = scannerString.nextLine();

                System.out.println("Insira o salario do segundo funcionario:");
                int salario2 = scannerNumber.nextInt();

                System.out.println("Insira o nome do terceiro funcionario:");
                String funcionario3 = scannerString.nextLine();

                System.out.println("Insira o salario do terceiro funcionario:");
                int salario3 = scannerNumber.nextInt();

                int somaSalarios = (salario1 + salario2 + salario3);
                int mediaSalario = (somaSalarios/3) ;

                System.out.println("A media dos salários de:"+funcionario1+", "+funcionario2+"e "+funcionario3+" foi de: "+mediaSalario);

                System.out.println("Obrigado por usar o programa!");
            }

        }