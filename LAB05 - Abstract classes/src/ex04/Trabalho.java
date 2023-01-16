package ex04;

import java.util.Scanner;

public class Trabalho extends Contato {

    private String tipo;

    public Trabalho(String apelido, String nome, String email, String aniversario, String tipo){
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    public Trabalho(){
        super();
    }

    Scanner sc = new Scanner(System.in);

    public void imprimirContato(){
        super.imprimirBasico();
        System.out.println("Tipo de Contato no trabalho: " + this.tipo + "\n");
    }

    public String getTipo(){
        return this.tipo;
    }

    public void criaContato(){
        this.leInfo();
        System.out.println("Informe o tipo");

        this.tipo = sc.nextLine();
    }
    
}
