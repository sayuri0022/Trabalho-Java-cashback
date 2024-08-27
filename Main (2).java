/**************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

***************************/
import java.util.Random;
import java.util.Scanner;

public class Main{

    private static final int MAX_TENTATIVAS = 10; // Número máximo de tentativas

    public static void main(String[] args) {
        
        System.out.println("🅂🄴🄲🅁🄴🅃 🄽");
	    
        
        
        
        Scanner scanner = new Scanner(System.in);

        // Captura o nome completo do usuário
        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        boolean jogarNovamente;
        do {
            // Gera o número da sorte aleatório
            int numeroSorte = gerarNumeroSorte();

            // Inicia o jogo
            jogarNovamente = jogar(nome, numeroSorte, scanner);

            // Pergunta se o usuário deseja jogar novamente
            if (jogarNovamente) {
                System.out.print("Deseja jogar novamente? (s/n): ");
                jogarNovamente = scanner.nextLine().trim().equalsIgnoreCase("s");
            }

        } while (jogarNovamente);

        System.out.println("Obrigado por jogar! Até a próxima.");
        scanner.close();
    }

    // Função para gerar o número da sorte aleatório
    private static int gerarNumeroSorte() {
        Random random = new Random();
        return random.nextInt(100) + 1; // Gera um número entre 1 e 100
    }

    // Função para jogar o jogo
    private static boolean jogar(String nome, int numeroSorte, Scanner scanner) {
        int tentativas = 0;
        boolean acertou = false;

        while (tentativas < MAX_TENTATIVAS) {
            System.out.print("Digite seu palpite (entre 1 e 100): ");
            int palpite = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            if (palpite < 1 || palpite > 100) {
                System.out.println("O palpite deve estar entre 1 e 100. Tente novamente.");
                continue;
            }

            tentativas++;

            if (palpite == numeroSorte) {
                acertou = true;
                break;
            } else if (palpite < numeroSorte) {
                System.out.println("O número da sorte é maior. Tente novamente.");
            } else {
                System.out.println("O número da sorte é menor. Tente novamente.");
            }
        }

        if (acertou) {
            System.out.println("Parabéns, " + nome + "! Você acertou o número da sorte em " + tentativas + " tentativa(s).");
        } else {
            System.out.println("Que pena, " + nome + ". Você não acertou o número da sorte. O número era " + numeroSorte + ".");
        }

        return acertou;
    }
}