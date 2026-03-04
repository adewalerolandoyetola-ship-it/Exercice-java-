import java.util.Scanner;

public class Exercicea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int nombre = scanner.nextInt();
        long factoriel = 1;

        for (int i = 1; i <= nombre; i++) {
            factoriel *= i;
        }

        System.out.println("Le factoriel de " + nombre + " est : " + factoriel);
    }
}