package ex04;

import java.util.Scanner;

public abstract class Contato {

    private String apelido;
    private String nome;
    private String email;
    private String aniversario;

    public Contato(String apelido, String nome, String email, String aniversario){

        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public Contato(){}

    Scanner sc = new Scanner(System.in);

    protected void imprimirBasico(){

        System.out.println("\nApelido: " + this.apelido
                            + "\nNome: " + this.nome
                            + "\nEmail: " + this.email
                            + "\nAniversario: " + this.aniversario);
    }

    public abstract void imprimirContato();

    public String getApelido(){
        return this.apelido;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public String getAniversario(){
        return this.aniversario;
    }

    protected Contato leInfo(){ //protected para apenas as classes herdeiras acessarem esse metodo

        String apelido, nome, email, aniversario;

        System.out.println("Digite o apelido: ");
        apelido = sc.nextLine();

        System.out.println("Digite o nome: ");
        nome = sc.nextLine();

        System.out.println("Digite o email: ");
        email = sc.nextLine();

        System.out.println("Digite a data de nascimento: ");
        aniversario = sc.nextLine();

        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;

        return this;
    }

    public abstract void criaContato();
    
}
