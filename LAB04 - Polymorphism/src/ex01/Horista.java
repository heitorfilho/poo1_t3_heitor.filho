package ex01;

import java.sql.Date;

public class Horista extends Funcionario{

    private float valorHora;
    private float horasTrabalhadas;

    Horista(String nome, Date dataDeNascimento, float salario, float valorHora, float horasTrabalhadas){

        super(nome, dataDeNascimento, salario);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    Horista(String nome, Date dataDeNascimento, float valorHora, float horasTrabalhadas){

        super(nome, dataDeNascimento, (Horista.calculaSalarioEst(valorHora, horasTrabalhadas)));
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void calculaSalarioHorista(){

        float salario = this.valorHora* this.horasTrabalhadas;
        this.setSalario(salario);

    }

    // Metodo Estatico que calcula o salario no construtor caso nao tenha o valor do salario ja definido
    static float calculaSalarioEst(float valorHora, float horasTrabalhadas){

        float salario = valorHora * horasTrabalhadas;

        return salario;

    }

    public void setValorHora(float valorHora){

        this.valorHora = valorHora;
        this.calculaSalarioHorista();
    }

    public void setHorasTrabalhadas(float horasTrabalhadas){

        this.horasTrabalhadas = horasTrabalhadas;
        this.calculaSalarioHorista();
    }

    public float getValorHora(){

        return this.valorHora;
    }

    public float getHorasTrabalhadas(){

        return this.horasTrabalhadas;
    }

    public void print(){

        System.out.println("Funcao: Horista");
        super.print();

    }

}

