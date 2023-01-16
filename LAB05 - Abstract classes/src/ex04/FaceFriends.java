package ex04;

import java.util.Scanner;

public class FaceFriends {

    public static void main(String[] args){

        Contato contatos[] = new Contato[6];
        Scanner entrada = new Scanner(System.in);   

        int opcao = 0, qtd = 0, tipo, ind; 

        while (opcao != 8) {

            System.out.println("Escolha qual operacao executar:" 
                               + "\n1 - Inserir Contato"
                               + "\n2 - Imprimir todos os contatos"
                               + "\n3 - Imprimir somente familiares"
                               + "\n4 - Imprimir somente amigos"
                               + "\n5 - Imprimir somente colegas de trabalho"
                               + "\n6 - Imprimir somente melhores amigos"
                               + "\n7 - Imprimir dados de um contato"
                               + "\n8 - Sair");
            

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1: 
                        
                        System.out.println("Qual o tipo de contato? 1: Amigo, 2: Familia, 3: Trabalho");
                        tipo = entrada.nextInt();
    
                        if (tipo == 1) {
                            contatos[qtd] = new Amigos();
                            contatos[qtd].criaContato();
                            qtd++;
                        }
    
                        else if (tipo == 2) {
                            contatos[qtd] = new Familia();
                            contatos[qtd].criaContato();
                            qtd++;
                        }
    
                        else if (tipo == 3) {
                            contatos[qtd] = new Trabalho();
                            contatos[qtd].criaContato();
                            qtd++;
                        }
                        
                        else{
                            System.out.println("Tipo nao disponivel");
                        }

                    
                    break;
            
                case 2:

                        for (int j = 0; j < qtd; j++) {
                            contatos[j].imprimirContato();
                        }
    
                    break;

                case 3: 

                        for (int j = 0; j < qtd; j++) {
                            if(contatos[j] instanceof Familia){
                                contatos[j].imprimirContato();
                            }
                        }

                    break;

                case 4: 

                        for (int j = 0; j < qtd; j++) {
                            if(contatos[j] instanceof Amigos){
                                contatos[j].imprimirContato();
                            }
                        }

                    break;

                case 5: 

                        for (int j = 0; j < qtd; j++) {
                            if(contatos[j] instanceof Trabalho){
                                contatos[j].imprimirContato();
                            }
                        }

                    break;

                case 6:

                        for (int j = 0; j < qtd; j++) {
                            if(contatos[j] instanceof Amigos){
                                if (((Amigos) contatos[j]).getGrau() == 1) {
                                    contatos[j].imprimirContato();
                                }
                            }
                        }

                    break;

                case 7: 

                        System.out.println("Digite qual o indice do contato a ser imprimido: ");
                        ind = entrada.nextInt();

                        if (ind >= 0 || ind <= 6) {
                            if(contatos[ind] == null){
                                System.out.println("Posicao nao preenchida ");
                            }
                            else{
                            contatos[ind].imprimirContato();
                            }
                        }
                        else{
                            System.out.println("Essa posicao nao existe");
                        }
                    
                    break;
                
                case 8:

                        
                    break;

                default:
                    System.out.println("Essa operacao nao existe");
                    break;
            }
        }   

    }
    
}
