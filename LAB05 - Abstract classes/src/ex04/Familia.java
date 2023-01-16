package ex04;

import java.util.Scanner;

public class Familia extends Contato {

    private String parentesco;

    public Familia(String apelido, String nome, String email, String aniversario, String parentesco){
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    public Familia(){
        super();
    }

    Scanner sc = new Scanner(System.in);

    public void imprimirContato(){
        super.imprimirBasico();
        System.out.println("Parentesco: " + this.parentesco + "\n");
    }

    public String getParentesco(){
        return this.parentesco;
    }
    
    public void criaContato(){
        this.leInfo();
        System.out.println("Informe o parentesco");

        this.parentesco = sc.nextLine();

    }
}
