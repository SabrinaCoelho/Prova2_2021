package br.edu.univas.main;

import java.util.Locale;
import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		double[] peso = new double[100];
		double[] altura = new double[100];
		double[] imc = new double[100];
		int cont = 0;
		float perc = 0;
		for(int i = 0; i < 100;i++) {
			System.out.println("Peso: ");
			peso[i] = in.nextDouble();
			System.out.println("Altura: ");
			altura[i] = Math.pow(in.nextDouble(), 2);
			System.out.println("----------- ");
		}
		in.close();
		for(int i = 0; i < 100;i++) {
			imc[i] = peso[i]/altura[i];
		}
		for(int i = 0; i < 100;i++) {
			if(imc[i] >= 18.5 && imc[i] <= 24.9) {
				//System.out.println("imc: "+ imc[i]);
				cont++;
			}
		}
		perc = cont * 100/100.0f;
		System.out.printf("Porcentagem: %.1f %n", perc);
	}
}
