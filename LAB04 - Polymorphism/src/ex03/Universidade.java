package ex03;

public class Universidade {

    private String nomeUniversdade;
    private String dataDeFundacao;

    private Estudante estudantes[] = new Estudante [100];

    public Universidade(String nomeUniversidade, String dataDeFundacao){
        this.nomeUniversdade = nomeUniversidade;
        this.dataDeFundacao = dataDeFundacao;
    }

    public void mostraEstudantes(){

        int estGrad = 0;
        int estMest = 0;
        int estDout = 0;

        for (int i = 0; i < estudantes.length; i++) {
            
            if (estudantes[i] instanceof EstudanteGraduacao) {
                estGrad++;
                //estudantes[i].print();
            }
            else if (estudantes[i] instanceof EstudanteMestrado) {
                estMest++;
                //estudantes[i].print();
            }
            else if (estudantes[i] instanceof EstudanteDoutorado) {
                estDout++;
                //estudantes[i].print();
            }

        }

        System.out.println("Estudantes Graduacao: " + estGrad
                                +"\nEstudantes Mestrado: " + estMest
                                +"\nEstudantes Doutorado: " + estDout);

    }


    public void adicionaEstudante(Estudante est, int pos){
        this.estudantes[pos] = est;
    }


    public void mostraNomes(){

        for (int i = 0; i < estudantes.length; i++) {

            if (estudantes[i] instanceof EstudanteDoutorado) {
                System.out.println("Nome: " + this.estudantes[i].getNome()
                                     + "\nTitulo da Tese: " + ((EstudanteDoutorado) this.estudantes[i]).getTituloTese()
                                     + "\nLinha de Pesquisa: " + ((EstudantePosGrad) this.estudantes[i]).getLinhadDePesquisa() + "\n");
            }
            else{
                System.out.println("Nome: " + this.estudantes[i].getNome() + "\n");
            }
            
        }

    }

    public void copiaEstudantesPos(Estudante est[], int n){

        int pos = 0;

        for (int i = 0; i < this.estudantes.length && i<n; i++) {
            
            if (this.estudantes[i] instanceof EstudantePosGrad) {
             
                est[pos] = this.estudantes[i];
                pos++;
                this.estudantes[i].print();
            }
            else{
                this.estudantes[i].print();
            }

        }

    }

    public String getNomeUniversidade(){
        return this.nomeUniversdade;
    }

    public String getDataFund(){
        return this.dataDeFundacao;
    }

    public void setNomeUniversidade(String nomeUniversidade){
        this.nomeUniversdade = nomeUniversidade;
    }

    public void setDataFund(String dataFund){
        this.dataDeFundacao = dataFund;
    }
    

}
