package ex01;

public class FolhaPagamento {

    static float calculaPagamento(Funcionario f[]){

        float pagamento = 0;

        for (int i = 0; i < f.length; i++) {

            pagamento = pagamento + f[i].getSalario();
            f[i].print();
            
        }

        System.out.println("Pagamento total: " + pagamento);

        return pagamento;      

    }
    
}
