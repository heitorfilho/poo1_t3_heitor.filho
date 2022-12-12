package ex01;

import java.sql.Date;

public class Vendedor extends Funcionario {

    private float valorFixo;
    private float comissao;
    private float vendas;

    Vendedor(String nome, Date dataDeNascimento, float salario, float valorFixo, float comissao, float vendas){

        super(nome, dataDeNascimento, salario);
        this.valorFixo = valorFixo;
        this.comissao = comissao;
        this.vendas = vendas;

    }

    Vendedor(String nome, Date dataDeNascimento, float valorFixo, float comissao, float vendas){

        super(nome, dataDeNascimento, (Vendedor.calculaSalarioEst(valorFixo, comissao, vendas)));
        this.valorFixo = valorFixo;
        this.comissao = comissao;
        this.vendas = vendas;

    }


    public void calculaSalarioVendedor(){

        float salario = this.valorFixo + (this.comissao*this.vendas);

        this.setSalario(salario);

    }


    // Metodo Estatico que calcula o salario no construtor caso nao tenha o valor do salario ja definido
    static float calculaSalarioEst(float valorFixo, float comissao, float vendas){

        float salario = valorFixo + (comissao*vendas);

        return salario;

    }

    public void setValorFixo(float valorFixo){

        this.valorFixo = valorFixo;
        this.calculaSalarioVendedor();
    }

    public void setComissao(float comissao){

        this.comissao = comissao;
        this.calculaSalarioVendedor();
    }

    public void setVendas(float vendas){

        this.vendas = vendas;
        this.calculaSalarioVendedor();

    }

    public float getValorFixo(){

        return this.valorFixo;
    }

    public float getComissao(){

        return this.comissao;
    }

    public float getVendas(){

        return this.vendas;
    }

    public void print(){

        System.out.println("Funcao: Vendedor");
        super.print();

    }
    
}
