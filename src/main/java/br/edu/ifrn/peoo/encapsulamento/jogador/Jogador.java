package br.edu.ifrn.peoo.encapsulamento.jogador;

public class Jogador {

    private String nome;
    private String posicao;
    private String matricula;
    private double altura;
    private int peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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
        sb.append("\nPOSIÇÃO: ");
        sb.append(posicao);
        sb.append("\nMATRÍCULA: ");
        sb.append(matricula);
        sb.append("\nALTURA: ");
        sb.append(altura);
        sb.append("m\nPESO: ");
        sb.append(peso);
        sb.append("KG");

        return sb.toString();
    }

}