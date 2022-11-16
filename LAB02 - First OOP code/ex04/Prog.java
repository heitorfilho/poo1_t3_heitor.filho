package ex04;

public class Prog {

    public static void main(String[] args){

        Selecao selecao1 = new Selecao("Brasil", "Tite", "Brasil");

        Figurinha jogador = new Figurinha ("Joao", "01/01/2001", 1.5f, 60f, "Atacante", "Brasil"); 

        selecao1.setJogador(jogador, 0);

        selecao1.print();

    }
    
}
