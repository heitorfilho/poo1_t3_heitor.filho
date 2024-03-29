package ex02;

import java.time.LocalDate;

public class Figurinha {
    protected String nomeJogador;
    protected LocalDate dataNascimento;
    protected float altura;
    protected float peso;
    protected String posicao;
    protected String pais;

    public Figurinha(String nomeJogador, LocalDate dataNascimento, float altura, float peso, String posicao, String pais) {
        this.nomeJogador = nomeJogador;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public Figurinha(Figurinha jogador){

        this.nomeJogador = jogador.getNomeJogador();
        this.dataNascimento = jogador.getDataNascimento();
        this.altura = jogador.getAltura();
        this.peso = jogador.getPeso();
        this.posicao = jogador.getPosicao();
        this.pais = jogador.getPais();

    }

    public Figurinha(String pais){

        this.pais = pais;

    }

    public void MostrarFigurinha() {
        System.out.println("Nome do jogador: " + this.nomeJogador);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        System.out.println("Posição: " + this.posicao);
        System.out.println("País: " + this.pais);
    }
    public String getNomeJogador() {
        return nomeJogador;
    }
    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

}