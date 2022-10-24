import java.util.Date;

public class Selecao {

    private String nomeSelecao;
    private String tecnico;
    private String pais;
    private Figurinha[] jogador = new Figurinha[11];


    public Figurinha getJogador(int i) {
        return jogador[i];
    }

    public void setJogador(Figurinha jogador, int i){
        this.jogador[i] = jogador;
    }


}
