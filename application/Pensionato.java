package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quarto;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		Quarto[] vect = new Quarto[10];
		
        System.out.print("Quantos estudantes vão alugar quartos? ");
        int n = sc.nextInt();
        
        if (n < 1 || n > 10) {
            System.out.println("O número de estudantes deve estar entre 1 e 10.");
            sc.close();
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nAluguel #" + (i + 1));
            sc.nextLine(); // Limpar o buffer do scanner
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto (0-9): ");
            int quarto = sc.nextInt();

            if (vect[quarto] == null) {
            	vect[quarto] = new Quarto(nome, email);
            } else {
                System.out.println("Erro: Quarto já ocupado. Escolha outro.");
                i--; // Refazer a entrada desse estudante
            }
        }

        System.out.println("\nRelatório de ocupação:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

		
		sc.close();
	}

}
