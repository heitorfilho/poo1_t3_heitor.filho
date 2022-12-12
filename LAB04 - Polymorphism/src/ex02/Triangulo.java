package ex02;

public class Triangulo extends FormaBidimensional {
    
    private double b;
    private double h;

    Triangulo(double area, double b, double h){

        super();
        this.area = area;
        this.b = b;
        this.h = h;

    }

    Triangulo(double b, double h){

        super();
        this.b = b;
        this.h = h;
    }

    @Override
    public double obterArea(){

        double areaTri;

        areaTri = this.b*this.h;

        this.area = areaTri;

        return areaTri;
    }

    public void print(){
        System.out.println("Triangulo");
    }

    public double getArea(){

        return this.area;
    }

    public void setArea(double area){

        this.area = area;
    }

}
