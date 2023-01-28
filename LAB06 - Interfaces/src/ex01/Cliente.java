package ex01;

public class Cliente implements Classificavel{

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean ehMenorQue(Classificavel obj){
        Cliente compara = (Cliente) obj;

        int indice = this.nome.compareTo(compara.getNome());

        if (indice == 0){
            return false;
        }
        else if (indice < 0){
            return true;
        }
        else{ 
            return false; 
        }
    }

    public void print(){
        System.out.println("Nome: " + this.nome);
    }
    
}
