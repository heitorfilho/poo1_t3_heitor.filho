package ex01;

import java.sql.Date;

public class Funcionario {

    private String nome;
    private Date dataDeNascimento;
    private float salario;

    Funcionario(String nome, Date dataDeNascimento, float salario){

        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.salario = salario;

    }

    public void print(){

        System.out.println("Nome: " + this.nome + "\n" + "Salario: " + this.salario + "\n");

    }

    public String getNome(){

        return this.nome;
    }

    public Date getDataDeNascimento(){

        return this.dataDeNascimento;
    }

    public float getSalario(){

        return this.salario;
    }

    public void setSalario(float salario){

        this.salario = salario;
    }
    
}
