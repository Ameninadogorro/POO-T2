package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		float angulo, voltas, resto = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("angulo");
		angulo = sc.nextInt();
		
		if((angulo < 360) || (angulo > -360)){
			voltas = angulo / 360;
			resto = (angulo % 360);
		}else {
			voltas = 0;
		}
		if((angulo == 0) || (angulo == 90) || (angulo == 180) || 
		(angulo == 270) || (angulo == 360) || (angulo == -90) || (angulo == -180) || 
		(angulo == -270) || (angulo == -360)) {
			System.out.println("Est� em cima de algum dos eixos!");
		}
		if((angulo > 0) && (angulo < 90) || (angulo < -270) && (angulo > -360)) {
			System.out.println("Est� no 1� quadrante!");
		}
		if((angulo > 90) && (angulo < 180) || (angulo < -180) && (angulo > -270)) {
			System.out.println("Est� no 2� quadrante!");
		}
		if((angulo > 180) && (angulo < 270) || (angulo < -90) && (angulo > -180)) {
			System.out.println("Est� no 3� quadrante!");
		}
		if((angulo > 270) && (angulo < 360) || (angulo < 0) && (angulo > 90)) {
			System.out.println("Est� no 4� quadrante!");
		}
		System.out.printf("Voltas: " + voltas + resto + " no sentido ");
		if(angulo > 0) {
			System.out.print("horario");
		}else {
			System.out.print("anti-horario");
		}
		
	}

}
