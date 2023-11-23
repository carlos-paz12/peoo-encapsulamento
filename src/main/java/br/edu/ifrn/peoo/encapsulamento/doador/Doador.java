package br.edu.ifrn.peoo.encapsulamento.doador;

public class Doador {

    private String nome;
    private String tipoSanguineo;
    private int idade;
    private int peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("NOME: ");
        sb.append(nome);
        sb.append("\nTIPO SANGUÍNEO: ");
        sb.append(tipoSanguineo);
        sb.append("\nIDADE: ");
        sb.append(idade);
        sb.append("\nPESO: ");
        sb.append(peso);
        sb.append("KG");

        return sb.toString();
    }

}