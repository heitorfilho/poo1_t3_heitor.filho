import java.util.Date;

public class Figurinha {

    private String nomeJogador;
    private Date dataNascimento;
    private Float altura;
    private Float peso;
    private String posicao;
    private String pais;

    public Figurinha(String nomeJogador, Date dataNascimento, Float altura, Float peso, String posicao, String pais){
        this.nomeJogador = nomeJogador;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public void print(){

        System.out.println("Nome do Jogador: " + this.nomeJogador);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        System.out.println("Posicao: " + this.posicao);
        System.out.println("Pais: " + this.pais + "\n");

    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Float getAltura() {
        return altura;
    }

    public Float getPeso() {
        return peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getPais() {
        return pais;
    }
}