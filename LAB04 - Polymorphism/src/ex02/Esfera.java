package ex02;

public class Esfera extends FormaTridimensional {
    
    private double raio;

    Esfera(double area, double volume, double raio){

        super();
        this.area = area;
        this.volume = volume;
        this.raio = raio;

    }

    Esfera(double raio){

        super();
        this.raio = raio;
    }

    @Override
    public double obterArea(){

        double areaEsf;

        areaEsf = 4 * Math.PI * (this.raio*this.raio);

        this.area = areaEsf;

        return areaEsf;

    }

    @Override
    public double obterVolume(){

        double volEsf;

        volEsf = ((4 * Math.PI)/3) * (this.raio*this.raio);

        this.volume = volEsf;

        return volEsf;

    }

    public void print(){
        System.out.println("Esfera");
    }

    public double getArea(){

        return this.area;
    }

    public double getVolume(){

        return this.volume;
    }

}
