package ex02;

public class ContaComum extends ContaCorrente{

    public ContaComum(float saldo, int numConta, int senha){

        super(saldo, numConta, senha);
    }

    public void mostraTipo(){
        System.out.println("Conta Comum");
    }
    
}
