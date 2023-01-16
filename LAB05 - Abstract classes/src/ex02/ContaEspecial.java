package ex02;

public class ContaEspecial extends ContaCorrente {

    private float limite;

    public ContaEspecial(float saldo, int numConta, int senha, float limite){
        super(saldo, numConta, senha);
        this.limite = limite;
    }

    public void mostraTipo(){
        System.out.println("Conta Especial");
    }

    public float getLimite(int senha){
        
        if (this.isSenha(senha)) {
            return this.limite;
        }
        else
            throw new IllegalArgumentException("Senha Incorreta");
    }

    /* 

    public ContaCorrente transformaEmContaComum(){

        if (this.limite == 0) {
            ContaCorrente conta = new ContaComum(this.getSaldo(), this.getNumConta(), this.getSenha());
            return conta;
        }

        return this;
        

    }

    public ContaCorrente criaContaEspecial(float saldo, int numConta, int senha, float limite){

        ContaCorrente Cont;

        if (limite == 0 || limite < 0) {
            Cont = new ContaComum(saldo, numConta, senha);
        }
        else{
            Cont = new ContaEspecial(saldo, numConta, senha, limite);
        }

        return Cont;

    }
    */
}
