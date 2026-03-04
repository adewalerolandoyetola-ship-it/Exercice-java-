import java.util.Scanner;

public class AffichageAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Entrez votre nom : ");
        String prenom = scanner.nextLine();
		
        System.out.print("Entrez votre prénom : ");
        String prenom = scanner.nextLine();
        
        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();
        
        System.out.println("Je m'applle" + nom + prenom + " j'ai " + age + " ans.");
        
        scanner.close();
    }
}