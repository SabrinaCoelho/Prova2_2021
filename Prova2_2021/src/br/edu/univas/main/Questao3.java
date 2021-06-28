package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] nota = new double[50];
		double percDep, percRec, percDir;
		int contDep = 0, contRec = 0, contDir = 0;
		for(int i = 0; i < 50;i++) {
			System.out.println("Digite a nota:");
			nota[i] = in.nextDouble();
			if(nota[i] < 30) {
				contDep++;
			}
			else if(nota[i] >= 30 && nota[i] < 60) {
				contRec++;
			}
			else {
				contDir++;
			}
		}
		in.close();
		percDep = contDep * 100/50.0f;
		percRec = contRec * 100/50.0f;
		percDir = contDir * 100/50.0f;
		System.out.println("Dependência: "+ contDep +" aluno(s) -> "+ percDep + "%");
		System.out.println("Recuperação: "+ contRec+" aluno(s) -> "+ percRec + "%");
		System.out.println("Passou direto: " + contDir + " aluno(s) -> "+ percDir + "%");
		
	}
}
