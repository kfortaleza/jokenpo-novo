package br.com.fiap;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {
	
	void jogar () {
		
		byte escolhaJogador = 0;
		byte escolhaComputador = 0;
		String resposta = "S";

		Random random = new Random();
		Scanner leitor = new Scanner(System.in);

		while (resposta.equalsIgnoreCase("S")) {

			System.out.println("****************************");
			System.out.println("      J O K E N P O");
			System.out.println("****************************");
			System.out.println("");
			System.out.println("1 - Pedra");
			System.out.println("2 - Papel");
			System.out.println("3 - Tesoura");
			System.out.println("****************************");
			System.out.println("");

			System.out.println("Qual a sua opção:");
			escolhaJogador = leitor.nextByte();

			// Determinar a escolha do computador
			escolhaComputador = (byte) (random.nextInt(3) + 1);

			if (escolhaJogador == 1 && escolhaComputador == 1) {
				System.out.println("\nVocê escolheu Pedra");
				System.out.println("\nComputador escolheu Pedra");
				System.out.println("\nEmpate.");

			} else if (escolhaJogador == 2 && escolhaComputador == 1) {
				System.out.println("\nVocê escolheu Papel");
				System.out.println("\nComputador escolheu Pedra");
				System.out.println("\nVocê ganhou esta.");

			} else if (escolhaJogador == 3 && escolhaComputador == 1) {
				System.out.println("\nVocê escolheu Tesoura");
				System.out.println("\nComputador escolheu Pedra");
				System.out.println("\nO Computador ganhou esta.");

			} else if (escolhaJogador == 1 && escolhaComputador == 2) {
				System.out.println("\nVocê escolheu Pedra");
				System.out.println("\nComputador escolheu Papel");
				System.out.println("\nO Computador ganhou esta.");

			} else if (escolhaJogador == 2 && escolhaComputador == 2) {
				System.out.println("\nVocê escolheu Papel");
				System.out.println("\nComputador escolheu Papel");
				System.out.println("\nEmpate.");

			} else if (escolhaJogador == 3 && escolhaComputador == 2) {
				System.out.println("\nVocê escolheu Tesoura");
				System.out.println("\nComputador escolheu Papel");
				System.out.println("\nVocê ganhou esta.");

			} else if (escolhaJogador == 1 && escolhaComputador == 3) {
				System.out.println("\nVocê escolheu Pedra");
				System.out.println("\nComputador escolheu Tesoura");
				System.out.println("\nVocê ganhou esta.");

			} else if (escolhaJogador == 2 && escolhaComputador == 3) {
				System.out.println("\nVocê escolheu Papel");
				System.out.println("\nComputador escolheu Tesoura");
				System.out.println("\nO Computador ganhou esta.");

			} else if (escolhaJogador == 3 && escolhaComputador == 3) {
				System.out.println("\nVocê escolheu Tesoura");
				System.out.println("\nComputador escolheu Tesoura");
				System.out.println("\nEmpate.");

			} else if (escolhaJogador < 1 || escolhaJogador > 3) {
				System.out.println("\nOpção inválida!");
			}

			System.out.println("");
			System.out.println("Jogar novamente (S/N)?");
			resposta = leitor.next();

		}
		
	}

}
