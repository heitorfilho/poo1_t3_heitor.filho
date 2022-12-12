package ex03;

public class Main {

    public static void main(String[] args) {


        Estudante estudantes[] = new Estudante [5];

        estudantes[0] = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        estudantes[1] = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        
        estudantes[2] = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
        "Vacinas de RNA", "academico","Anticorpos");

        estudantes[3] = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");
        
        estudantes[4] = new Estudante("Carlos","Rua 1o de Abril");


        
        Universidade ufu = new Universidade("Ufu", "01/01/2000");

        ufu.adicionaEstudante(estudantes[0], 0);
        ufu.adicionaEstudante(estudantes[1], 1);
        ufu.adicionaEstudante(estudantes[2], 2);
        ufu.adicionaEstudante(estudantes[3], 3);
        ufu.adicionaEstudante(estudantes[4], 4);

        ufu.mostraNomes();

        Estudante estpos[] = new EstudantePosGrad[5];

        ufu.copiaEstudantesPos(estpos, 5);

        estpos[0].print();
        


    }
}