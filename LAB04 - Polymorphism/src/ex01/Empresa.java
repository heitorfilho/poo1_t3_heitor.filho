package ex01;

import java.sql.Date;

public class Empresa {

    public static void main(String[] args){

        Funcionario funcionarios[] = new Funcionario[4];

        funcionarios[0] = new Chefe("Carlos", new Date(2000,1,1), 10000);
        funcionarios[1] = new Vendedor("Joao", new Date(2000,01,1), 1000, 50, 10);
        funcionarios[2] = new Operario("Jose", new Date(2000,01,1), 100, 50);
        funcionarios[3] = new Horista("Jonh", new Date(2000,01,1), 100, 40);

        FolhaPagamento.calculaPagamento(funcionarios);

    }
    
}
