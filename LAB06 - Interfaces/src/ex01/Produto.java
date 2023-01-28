package ex01;

public class Produto implements Classificavel{

    private int codigo;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean ehMenorQue(Classificavel obj){
        Produto compara = (Produto) obj;

        if(this.codigo < compara.getCodigo()){
            return true;
        }
        else return false;
    }

    public void print(){
        System.out.println("Código: " + this.codigo);
    }
}
