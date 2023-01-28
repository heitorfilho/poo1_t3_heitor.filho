package ex01;

public class Main {

    public static void main(String[] args){

        Produto p[] = new Produto[3];
        p[0] = new Produto(2);
        p[1] = new Produto(1);
        p[2] = new Produto(3);

        Cliente c[] = new Cliente[3];
        c[0] = new Cliente("Maria");
        c[1] = new Cliente("Joao");
        c[2] = new Cliente("Jose");

        Servico s[] = new Servico[3];
        s[0] = new Servico(2);
        s[1] = new Servico(1);
        s[2] = new Servico(3);

        Classificador c1 = new Classificador();

        c1.ordena(p);
        c1.ordena(c);
        c1.ordena(s);

        for (Produto pr : p) {
            pr.print();
        }

        for (Cliente cl : c) {
            cl.print();
        }

        for (Servico se : s) {
            se.print();
        }
            
    } 
}
