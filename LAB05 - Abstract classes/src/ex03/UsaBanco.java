package ex03;

import ex02.ContaCorrente;

public class UsaBanco {
    public static void main(String[] args){

        ContaCorrente cont;

        cont = ContaCorrente.criaConta(1000, 1, 1010, 0);

        cont.mostraTipo();

        cont.debitaValor(100, 1010);

        System.out.println(cont.getSaldo());


    }
    
}
