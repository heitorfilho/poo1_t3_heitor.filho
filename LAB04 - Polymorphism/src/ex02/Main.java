package ex02;

public class Main {

    public static void main(String[] args){

        Forma formas[] = new Forma[6];

        formas[0] = new Circulo(1, 2);
        formas[1] = new Quadrado(2, 5);
        formas[2] = new Triangulo(3, 5, 2);
        formas[3] = new Esfera(4, 4, 4);
        formas[4] = new Cubo(5, 5, 5);
        formas[5] = new Tetraedro(6, 6, 6, 6);

        for (int i = 0; i < formas.length; i++) {

            if (formas[i] instanceof FormaBidimensional) {

                System.out.println("Area: " + formas[i].getArea());
                formas[i].print();
                
            }
            else if (formas[i] instanceof FormaTridimensional) {

                System.out.println("Volume: " + (((FormaTridimensional) formas[i]).getVolume()));
                formas[i].print();
                
            }
            
        }
        
    }
    
}
