package ex01;

public class Servico implements Classificavel {

    private float preco;

    public Servico(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean ehMenorQue(Classificavel obj){
        Servico compara = (Servico) obj;

        if(this.preco < compara.getPreco()){
            return true;
        }
        else return false;
    }
    
    public void print(){
        System.out.println("Preço: " + this.preco);
    }
}
