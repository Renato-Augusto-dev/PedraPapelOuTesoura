import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        int escolha, cpu;

        System.out.println("******************************************");
        System.out.println("J O K E P O ");
        System.out.printf("Escolha entre: \n(1)papel, \n(2)tesoura, \n(3)pedra: \n");
        System.out.println("******************************************");

        try {
            escolha = leitor.nextInt();
            cpu = gerador.nextInt(3) + 1;

            System.out.println(resultadoDoJogo(escolha, cpu));

        } catch (Exception erro){
            System.out.println("A sua escolha deve ser um NUMERO de 1 a 3 ");
            
        }

    }

    private static String resultadoDoJogo (int escolhaDoJogador, int escolhaDoComputador ) {

        String escolhaString;

        if (escolhaDoJogador == escolhaDoComputador) {
            escolhaString = "Deu empate";
        }
        else if (escolhaDoJogador == 1 && escolhaDoComputador == 2) {
            escolhaString = "Eu escolhi tesoura e você papel você PERDEU";
        }
        else if (escolhaDoJogador == 1 && escolhaDoComputador == 3) {
            escolhaString = "Eu escolhi PEDRA e você PAPEL você GANHOU";
        }
        else if (escolhaDoJogador == 2 && escolhaDoComputador == 3 ) {
            escolhaString = "Eu escolhi PEDRA e você TESOURA você PERDEU";
        }
        else if (escolhaDoJogador == 2 && escolhaDoComputador == 1) {
            escolhaString = "Eu escolhi PAPEL e você TESOURA você GANHOU";
        }
        else if (escolhaDoJogador == 3 && escolhaDoComputador == 1) {
            escolhaString = "Eu escolhi PAPEL e você PEDRA você PERDEU";
        }
        else if (escolhaDoJogador == 3 && escolhaDoComputador == 2) {
            escolhaString = "Eu escolhi TESOURA e você PEDRA você GANHOU";
        }
        else{
            escolhaString = "Você escolheu um numero maior, tente novamente";
        }

        return escolhaString;
    }
}
