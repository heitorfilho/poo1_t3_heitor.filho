import java.util.Date;

public class Prog {

    public static void main(String[] args) {

        Figurinha jogador[] = new Figurinha[3];

        jogador[0] = new Figurinha("Joao", new Date(2001, 01, 01), 1.5f, 60f, "Atacante", "Brasil");

        jogador[1] = new Figurinha("Carlos", new Date(2002, 01, 02), 1.7f, 65f, "Atacante", "Brasil");

        jogador[2] = new Figurinha("Jose", new Date(1998, 01, 23), 1.8f, 70f, "Goleiro", "Brasil");

        for (int i = 0; i< jogador.length; i++ ){

            jogador[i].print();
        }

    }
}