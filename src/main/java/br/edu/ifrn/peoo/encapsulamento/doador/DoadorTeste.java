package br.edu.ifrn.peoo.encapsulamento.doador;

import java.util.Scanner;

public class DoadorTeste {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Doador objDoador1 = new Doador();
        Doador objDoador2 = new Doador();

        System.out.print("NOME DOADOR: ");
        objDoador1.setNome(read.nextLine());
        System.out.print("TIPO SANGUÍNEO ");
        objDoador1.setTipoSanguineo(read.nextLine());
        System.out.print("IDADE: ");
        objDoador1.setIdade(read.nextInt());
        System.out.print("PESO (KG): ");
        objDoador1.setPeso(read.nextInt());

        objDoador2.setNome("Daniel");
        objDoador2.setTipoSanguineo("AB");
        objDoador2.setIdade(37);
        objDoador2.setPeso(70);

        System.out.printf("\n------ DOADOR 1 ------");
        System.out.printf("\nNOME: %s", objDoador1.getNome());
        System.out.printf("\nTIPO SANGUÍNEO: %S", objDoador1.getTipoSanguineo());
        System.out.printf("\nIDADE: %d", objDoador1.getIdade());
        System.out.printf("\nPESO: %dKG\n", objDoador1.getPeso());
        System.out.printf("\n------ DOADOR 2 ------\n");
        System.out.printf(objDoador2.toString());

        read.close();
    }

}
