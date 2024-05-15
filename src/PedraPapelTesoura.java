import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        System.out.printf("Escolha entre (1)papel, (2)tesoura ou (3)pedra: ");
        int escolha = leitor.nextInt();
        int cpu = gerador.nextInt(3) + 1;

        if (escolha == cpu) {
            System.out.println("Deu empate");
        }else if (escolha == 1 && cpu == 2) {
            System.out.println("Eu escolhi tesoura e você papel você PERDEU");
        }else if (escolha == 1 && cpu == 3) {
            System.out.println("Eu escolhi PEDRA e você PAPEL você GANHOU");
        }else if (escolha == 2 && cpu == 3 ) {
            System.out.println("Eu escolhi PEDRA e você TESOURA você PERDEU");
        }else if (escolha == 2 && cpu == 1) {
            System.out.println("Eu escolhi PAPEL e você TESOURA você GANHOU");
        }else if (escolha == 3 && cpu == 1) {
            System.out.println("Eu escolhi PAPEL e você PEDRA você PERDEU");
        }else if (escolha == 3 && cpu == 2) {
            System.out.println("Eu escolhi TESOURA e você PEDRA você GANHOU");
        }



    }
}
