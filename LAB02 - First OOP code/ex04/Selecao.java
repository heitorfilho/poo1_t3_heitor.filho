package ex04;

public class Selecao {

    String nomeSelecao;
    String tecnico;
    String pais;

    Figurinha jogador[] = new Figurinha[11];

    public Selecao(String nomeSelecao, String tecnico, String pais){

        this.nomeSelecao = nomeSelecao;
        this.tecnico = tecnico;
        this.pais = pais;

    }
    
    public void setJogador(Figurinha jogador, int i){

        this.jogador[i] = new Figurinha(jogador);

    }

    public Figurinha getJogador(int i){

        return this.jogador[i];
    }

    public void print() {
        System.out.println("Nome da seleção: " + this.nomeSelecao);
        System.out.println("Técnico: " + this.tecnico);
        System.out.println("País: " + this.pais);
        System.out.println("Jogadores: " + this.jogador);
        for (int i = 0; i < jogador.length; i++) {
            jogador[i].print();
        }
    }

}


