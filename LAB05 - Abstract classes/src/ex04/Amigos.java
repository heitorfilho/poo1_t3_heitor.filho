package ex04;

import java.util.Scanner;

public class Amigos extends Contato {

    private int grau; // 1 = melhor amigo; 2 = amigo; 3 = conhecido

    public Amigos(String apelido, String nome, String email, String aniversario, int grau){
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    public Amigos(){
        super();
    }


    Scanner sc = new Scanner(System.in);

    public void imprimirContato(){
        super.imprimirBasico();
        System.out.println("Grau de Amizade: " + this.grau + "\n");
    }

    public int getGrau(){
        return this.grau;
    }

    public void criaContato(){

        this.leInfo();
        System.out.println("Informe o grau de amizade, 1: melhor amigo, 2: amigo, 3: conhecido");

        this.grau = sc.nextInt();
    }
    
    
}
