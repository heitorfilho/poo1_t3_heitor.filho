package ex04;

public class Figurinha {

    private String nomeJogador;
    private String dataDeNascimento;
    private Float altura;
    private Float peso;
    private String posicao;
    private String pais;

    public Figurinha(String nomeJogador, String dataDeNascimento, Float altura, Float peso, String posicao, String pais){

        this.nomeJogador = nomeJogador;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public Figurinha(Figurinha jogador){

        this.nomeJogador = jogador.getNomeJogador();
        this.dataDeNascimento = jogador.getDataNascimento();
        this.altura = jogador.getAltura();
        this.peso = jogador.getPeso();
        this.posicao = jogador.getPosicao();
        this.pais = jogador.getPais();

    }

    public void print(){

        System.out.println(this.nomeJogador);
        System.out.println(this.dataDeNascimento);
        System.out.println(this.altura);
        System.out.println(this.peso);
        System.out.println(this.posicao);
        System.out.println(this.pais);

    }

    public String getNomeJogador() {
        return nomeJogador;
    }
    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }
    public String getDataNascimento() {
        return dataDeNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataDeNascimento = dataNascimento;
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
