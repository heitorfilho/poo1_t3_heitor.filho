import java.util.Date;

public class Prog {

    public static void main(String[] args){

        Figurinha f1 = new Figurinha ("Joao", new Date(2001,01,01), 1.5f, 60f, "Atacante", "Brasil");

        Figurinha f2 = new Figurinha ("Carlos", new Date(2002,01,02), 1.7f, 65f, "Atacante", "Brasil");

        Figurinha f3 = new Figurinha ("Jose", new Date(1998,01,23), 1.8f, 70f, "Goleiro", "Brasil");

        f1.print();
        f2.print();
        f3.print();

    }

}
