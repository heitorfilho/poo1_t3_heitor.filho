import java.util.Date;

public class Figurinha {

        String nomeJogador;
        Date dataNascimento;
        Float altura;
        Float peso;
        String posicao;
        String pais;

        public Figurinha(String nomeJogador, Date dataNascimento, Float altura, Float peso, String posicao, String pais){
            this.nomeJogador = nomeJogador;
            this.dataNascimento = dataNascimento;
            this.altura = altura;
            this.peso = peso;
            this.posicao = posicao;
            this.pais = pais;
        }

        public void print(){
            
            System.out.println("Nome do Jogador: " + this.nomeJogador);
            System.out.println("Data de Nascimento :" + this.dataNascimento);
            System.out.println("Altura :" + this.altura);
            System.out.println("Peso :" + this.peso);
            System.out.println("Posicao :" + this.posicao);
            System.out.println("Pais :" + this.pais);
            
        }

}
