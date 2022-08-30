package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class Jokempo {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Random Sorteio = new Random();
		
		int escolhaJogador;
		int escolhaComputador = Sorteio.nextInt(3)+1;
		
		System.out.println("*** J O K E N P Ô ***");
		System.out.println();
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("-------------------------");
		System.out.print("Faça sua escolha (1-3)");
		
		escolhaJogador = leitor.nextInt();
		escolhaComputador = Sorteio.nextInt(3)+1;
		
		if (escolhaJogador < 0 || escolhaJogador > 3) {
			System.out.println("Jogador escolheu opção incorreta, jogo cancelado!!");
		}
		
		if (escolhaJogador ==1) {
			System.out.println("Você escolheu Pedra!");
		}
		if (escolhaJogador ==2) {
			System.out.println("Você escolheu Papel!");
		}
		if (escolhaJogador ==3) {
			System.out.println("Você escolheu Tesoura!");
		}

		if (escolhaComputador ==1) {
			System.out.println("O computador escolheu Pedra!");
		}
		if (escolhaComputador ==2) {
			System.out.println("O computador escolheu Papel!");
		}
		if (escolhaComputador ==3) {
			System.out.println("O computador escolheu Tesoura!");
		}
		
		if (escolhaJogador ==1) {
			if (escolhaComputador ==1) {
				System.out.println("O jogo empatou!!");
			}
		if (escolhaComputador ==2) {
			System.out.println("O computador ganhou!");
		}
		if (escolhaComputador ==3) {
			System.out.println("Você ganhou!!");
		}
		}
		if (escolhaJogador ==2) {
			if (escolhaComputador ==1) {
				System.out.println("Você venceu!!");
			}
		if (escolhaComputador ==2)
			System.out.println("O jogo empatou!!");
		}
		if (escolhaComputador ==3) {
			System.out.println("O computador venceu!");
		}
	
	    if (escolhaJogador ==3) {
	    	if (escolhaComputador ==1) {
	    		System.out.println("O computador venceu!");
	    	}
	    if (escolhaComputador ==2) {
	    	System.out.println("Você venceu!!");
	    }
	    if (escolhaComputador ==3) {
	    	System.out.println("O jogo empatou!!");
	    }
	    }
	}

}
