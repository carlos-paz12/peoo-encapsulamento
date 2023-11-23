package br.edu.ifrn.peoo.encapsulamento.jogador;

import java.util.Scanner;

public class JogadorTeste {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Jogador objJogador1 = new Jogador();
        Jogador objJogador2 = new Jogador();

        System.out.print("NOME: ");
        objJogador1.setNome(read.nextLine());
        System.out.print("POSIÇÃO: ");
        objJogador1.setPosicao(read.nextLine());
        System.out.print("MATRÍCULA: ");
        objJogador1.setMatricula(read.nextLine());
        System.out.print("ALTURA (M): ");
        objJogador1.setAltura(read.nextDouble());
        System.out.print("PESO (KG): ");
        objJogador1.setPeso(read.nextInt());

        objJogador2.setNome("Daniel");
        objJogador2.setPosicao("Ponta esquerda");
        objJogador2.setMatricula("22221456");
        objJogador2.setAltura(1.68);
        objJogador2.setPeso(70);

        System.out.printf("\n------ JOGADOR 1 ------");
        System.out.printf("\nNOME: %s", objJogador1.getNome());
        System.out.printf("\nPOSIÇÃO: %s", objJogador1.getPosicao());
        System.out.printf("\nMATRÍCULA: %s", objJogador1.getMatricula());
        System.out.printf("\nALTURA: %.2fm", objJogador1.getAltura());
        System.out.printf("\nPESO: %dKG\n", objJogador1.getPeso());
        System.out.printf("\n------ JOGADOR 2 ------\n");
        System.out.printf(objJogador2.toString());

        read.close();
    }

}
