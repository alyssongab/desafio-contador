import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);
            }

            catch(InputMismatchException | ParametrosInvalidosException exception) {
                System.out.println(exception.getMessage());

            }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser maior que o segundo!");
        }

        else if (parametroUm == parametroDois) {
            System.out.println("Parâmetros precisam ser diferentes");
        }

        else {

            int contagem = parametroDois - parametroUm;

            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número " + (i+1));
            }
        }

    }
}