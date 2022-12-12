package ex01;

import java.sql.Date;

public class Operario extends Funcionario {

    private float valor;
    private float qtd;

    Operario(String nome, Date dataDeNascimento, float salario, float valor, float qtd){

        super(nome, dataDeNascimento, salario);
        this.valor = valor;
        this.qtd = qtd;

    }

    Operario(String nome, Date dataDeNascimento, float valor, float qtd){

        super(nome, dataDeNascimento, (Operario.calculaSalarioEst(valor, qtd)));
        this.valor = valor;
        this.qtd = qtd;

    }

    public void calculaSalarioOperario(){

        float salario = this.valor * this.qtd;

        this.setSalario(salario);

    }

    // Metodo Estatico que calcula o salario no construtor caso nao tenha o valor do salario ja definido
    static float calculaSalarioEst(float valor, float qtd){

        float salario = valor * qtd;

        return salario;

    }

    public void setValor(float valor){

        this.valor = valor;
        this.calculaSalarioOperario();
    }

    public void setQtd(float qtd){

        this.qtd = qtd;
        this.calculaSalarioOperario();
    }

    public float getValor(){

        return this.valor;
    }

    public float getQtd(){

        return this.qtd;
    }

    public void print(){

        System.out.println("Funcao: Operario");
        super.print();

    }

    
}
