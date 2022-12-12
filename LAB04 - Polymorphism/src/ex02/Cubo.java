package ex02;

public class Cubo extends FormaTridimensional {

    private double lado;

    Cubo(double area, double volume, double lado){

        super();
        this.area = area;
        this.volume = volume;
        this.lado = lado;
    }

    Cubo(double lado){

        super();
        this.lado = lado;
    }

    @Override
    public double obterArea(){

        double areaCubo;

        areaCubo = 6 * (this.lado*this.lado);

        this.area = areaCubo;

        return areaCubo;

    }

    @Override
    public double obterVolume(){

        double volCubo;

        volCubo = (this.lado*this.lado*this.lado);

        this.volume = volCubo;

        return volCubo;

    }

    public void print(){
        System.out.println("Cubo");
    }

    public double getArea(){

        return this.area;
    }

    public double getVolume(){

        return this.volume;
    }
    
}
