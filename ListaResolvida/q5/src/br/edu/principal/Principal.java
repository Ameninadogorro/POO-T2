package br.edu.principal;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite tr�s n�meros em ordem crescente (Um de cada vez!):");
		int n1 = sc.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		int n2 = sc.nextInt();
		System.out.print("Digite o terceiro n�mero:");
		int n3 = sc.nextInt();
		System.out.printf("Os n�meros digitados foram: %s, %s e %s %n", n1, n2, n3);
		System.out.print("Digite um n�mero que fuja da ordem (Um de cada vez!):");
		int n4 = sc.nextInt();
		
		if(n4 > n3) {
			System.out.printf("A ORDEM DECRESCENTE �: %s -> %s -> %s -> %s", n4, n3, n2, n1);
		}else if((n4 > n2) && (n4 < n3)) {
			System.out.printf("A ORDEM DECRESCENTE �: %s -> %s -> %s -> %s", n3, n4, n2, n1);
		}else if((n4 > n1) && (n4 < n2)) {
			System.out.printf("A ORDEM DECRESCENTE �: %s -> %s -> %s -> %s", n3, n2, n4, n1);
		}else if(n4 < n1) {
			System.out.printf("A ORDEM DECRESCENTE �: %s -> %s -> %s -> %s", n3, n2, n1, n4);
		}
		
		
		
	}
}
