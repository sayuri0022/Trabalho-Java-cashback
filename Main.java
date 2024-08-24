/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor  = new Scanner(System.in);

        //  Dados do cliente
        System.out.print("Digite o nome do cliente: ");
        String nome = leitor.nextLine();

        System.out.print("Digite a idade do cliente: ");
        int idade = leitor.nextInt();

        System.out.print("Digite o valor da compra: ");
        double valorCompra = leitor.nextDouble();

        // Calculando o cashback
        String cashback;
        if (idade >= 21) {
            if (valorCompra > 1000) {
                cashback = "Cashback de 7%";
            } else {
                cashback = "Cashback de 5%";
            }
        } else {
            if (valorCompra > 1000) {
                cashback = "Cashback de 10%";
            } else {
                cashback = "Cashback de 7%";
            }
        }

        // Exibir  as informações
        System.out.println("Cliente: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Valor do Cashback: " + cashback);
    }
}

