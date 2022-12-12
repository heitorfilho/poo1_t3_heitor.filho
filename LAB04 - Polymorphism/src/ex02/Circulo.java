package ex02;

public class Circulo extends FormaBidimensional {

    private double raio;

    Circulo(double area, double raio){

        super();
        this.area = area;
        this.raio = raio;
    }

    Circulo(double raio){

        super();
        this.raio = raio;

    }

    @Override
    public double obterArea(){

        double areaCirc;

        areaCirc = Math.PI * (this.raio*this.raio);

        this.area = areaCirc;

        return areaCirc;

    }

    /*
    static double calculaArea(double raio){

        double areaCirc;

        areaCirc = Math.PI * (raio*raio);

        return areaCirc;

    }
    */

    public void print(){
        System.out.println("Circulo");
    }

    public double getArea(){

        return this.area;

    }

    public double getRaio(){

        return this.raio;

    }

    public void setArea(double area){

        this.area = area;

    }

    public void setRaio(double raio){

        this.raio = raio;

    }

    
}
