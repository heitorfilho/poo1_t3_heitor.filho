package ex01;

import java.sql.Date;

public class Chefe extends Funcionario {

    Chefe(String nome, Date dataDeNascimento, float salario){

        super(nome, dataDeNascimento, salario);

    }

    public float calculaSalario(){

        return this.getSalario();

    }

    public void print(){

        System.out.println("Funcao: Chefe");
        super.print();

    }
    
}
