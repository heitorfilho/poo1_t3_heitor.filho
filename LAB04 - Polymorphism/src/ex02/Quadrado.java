package ex02;

public class Quadrado extends FormaBidimensional{

    private double lado;

    Quadrado(double area, double lado){

        super();
        this.area = area;
        this.lado = lado;
    }

    Quadrado(double lado){

        super();
        this.lado = lado;
    }

    @Override
    public double obterArea(){

        double areaQuad;

        areaQuad = this.lado * this.lado;

        this.area = areaQuad;

        return areaQuad;

    }

    public void print(){
        System.out.println("Quadrado");
    }

    public double getArea(){

        return this.area;
    }

    public double getLado(){

        return this.lado;
    }

    public void setArea(double area){

        this.area = area;
    }
    
    public void setLado(double lado){

        this.lado = lado;
    }
}
