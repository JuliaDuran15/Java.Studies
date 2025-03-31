package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetoes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		int n, ndeMenores = 0, qttPares = 0;
//	    double alturatotal=0, alturamedia, percentualMenores;
		/**
		System.out.println("Quantos numeros voce vai digitar?");
		n = sc.nextInt();

	
		  int[] vetor = new int[n]; int[] vetorB = new int[n]; int[] vetorRES = new int[n];
		  int qttpares=0,somapares=0;
		  System.out.println("Vetor A: ");
		  
		  for(int i=0;i<n;i++) {
			  System.out.println("Digite numero: "); 
			  vetor[i] =sc.nextInt(); 
			  if(vetor[i]%2==0) {
				  somapares+=vetor[i];
				  qttpares++; }
			  }
	
		  double mediaPares=0;

		  if(qttpares>0) {
			  mediaPares=(double)somapares/qttpares;
			  System.out.printf("MEDIA DOS PARES = %.1f",mediaPares); 
		  }else {
			  System.out.println("NENHUM NUMERO PAR "); 

		  }
		  
		  /**System.out.println("Vetor B: ");
		  
		  for(int i=0;i<n;i++) { System.out.println("Digite numero: "); vetorB[i] =
		  sc.nextInt(); } System.out.println("Vetor RES: ");
		  
		  for(int i=0;i<n;i++) { vetorRES[i] = vetor[i]+vetorB[i];
		  System.out.printf("%d\n",vetorRES[i]); }
		  
		  System.out.println("Num pares: ");
		  
		  for(int i=0;i<n;i++) { if(vetor[i]%2==0) { System.out.printf("%d ",vetor[i]);
		  qttPares++; } }
		  
		  System.out.printf("\nQtt pares: %d",qttPares);
		  
		 
		double[] vetorr = new double[n];

		double soma = 0, media;

		for (int i = 0; i < n; i++) {
			System.out.println("Digite numero: ");
			vetorr[i] = sc.nextDouble();
			soma += vetorr[i];

		}
		double maior_valor = vetorr[0];
		int posicao = 0;
		media = soma / n;

		System.out.printf("MEDIA DO VETOR = %.2f", media);
		System.out.printf("\nELEMENTOS ABAIXO DA MEDIA: ");

		for (int i = 0; i < n; i++) {
			if (vetorr[i] > maior_valor) {
				maior_valor = vetorr[i];
				posicao = i;
			}
			if (vetorr[i] < media) {
				System.out.printf("%.1f\n", vetorr[i]);
			}
		}

		System.out.printf("MAIOR VALOR = %.1f\n", maior_valor);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao + 1);

		  String[] nome = new String[n]; int[] idade = new int[n]; double[] altura =
		  new double[n];
		  
		  for(int i=0;i<n;i++) { System.out.printf("Dados da %da pessoa:\n", i + 1);
		  System.out.println("Digite nome: "); nome[i] = sc.next();
		  System.out.print("Idade: "); idade[i] = sc.nextInt();
		  System.out.print("Altura: "); altura[i] = sc.nextDouble(); }
		  
		  for (int i=0; i<n; i++) { if (idade[i] < 16) { ndeMenores++; } alturatotal =
		  alturatotal + altura[i]; } alturamedia=alturatotal/n;
		  percentualMenores=((double)ndeMenores / n) * 100.0;
		  
		  
		  System.out.printf("\nAltura media = %.2f\n", alturamedia);
		  System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",
		  percentualMenores);
		  
		  for(int i=0; i<n; i++) { if (idade[i] < 16) { System.out.printf("%s\n",
		  nome[i]); } }
	**/
		
		int n, qtdhomens, qtdmulheres;
	    double menoraltura, maioraltura, alturafemMedia, alturafemtotal;

	    System.out.print("Quantas pessoas serao digitadas? ");
	    n = sc.nextInt();

	    double[] alturas = new double[n];
	    char[] generos = new char[n];

	    for (int i=0; i<n; i++) {
	    	System.out.printf("Altura da %da pessoa: ", i + 1);
	        alturas[i] = sc.nextDouble();
	        System.out.printf("Genero da %da pessoa: ", i + 1);
	        generos[i] = sc.next().charAt(0);
	    }

	    menoraltura = alturas[0];
	    maioraltura = alturas[0];

	    for (int i=1; i<n; i++) {
	        if (alturas[i] > maioraltura) {
	            maioraltura = alturas[i];
	        }
	        if (alturas[i] < menoraltura) {
	            menoraltura = alturas[i];
	        }
	    }

		qtdhomens = 0;
		qtdmulheres = 0;
		alturafemtotal = 0;
		
		for (int i = 0; i < n; i++) {
		    if (Character.toUpperCase(generos[i]) == 'M') { // Correção aqui
		        qtdhomens++;
		    } else {
		        qtdmulheres++;
		        alturafemtotal += alturas[i];
		    }
		}



	    alturafemMedia = alturafemtotal / qtdmulheres;

	    System.out.printf("Menor altura = %.2f\n", menoraltura);
	    System.out.printf("Maior altura = %.2f\n", maioraltura);
	    System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMedia);
	    System.out.printf("Numero de homens = %d\n", qtdhomens);

		sc.close();
	}
}
