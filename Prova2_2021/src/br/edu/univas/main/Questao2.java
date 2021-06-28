package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tipoConta = 0;
		double receita = 0, despesa = 0, saldo;
		for(int i = 0; ; i++) {
			tipoConta = in.nextInt();
			if(tipoConta == 0) {
				break;
			}
			else if(tipoConta == 1) {//receita
				receita += in.nextDouble();
			}
			else if(tipoConta == 2) {//despesa
				despesa += in.nextDouble();
			}
		}
		in.close();
		saldo = receita - despesa;
		if(saldo > 0) {
			System.out.println("Saldo positivo: "+ saldo);
		}
		else if(saldo < 0) {
			System.out.println("Saldo negativo: "+ saldo);
		}
		
	}
}
