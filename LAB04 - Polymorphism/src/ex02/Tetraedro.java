package ex02;

public class Tetraedro extends FormaTridimensional {

    private double h;
    private double aresta;

    Tetraedro(double area, double volume, double h, double aresta){

        super();
        this.area = area;
        this.volume = volume;
        this.h = h;
        this.aresta = aresta;
    }

    Tetraedro(double h, double aresta){

        super();
        this.h = h;
        this.aresta = aresta;
    }
    
    @Override
    public double obterArea(){

        double areaTetra;

        areaTetra = (this.aresta*this.aresta) * Math.sqrt(3);

        this.area = areaTetra;

        return areaTetra;

    }

    @Override
    public double obterVolume(){

        double volTetra;

        volTetra = (this.obterArea() * h)/3;

        this.volume = volTetra;

        return volTetra;

    }

    public void print(){
        System.out.println("Tetraedro");
    }

    public double getArea(){

        return this.area;
    }
    
    public double getVolume(){

        return this.volume;
    }
    
}
