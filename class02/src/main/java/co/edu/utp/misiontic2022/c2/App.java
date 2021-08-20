package co.edu.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Circulo ponque = new Circulo(3d);
        System.out.println(ponque.getAreaCirculo()); 
    }
}

class Circulo{
private Double radio = 0.0;
private Double areaCirculo;

    Circulo(Double radio){
        this.radio = radio;
        areaCirculo = Math.PI * Math.pow(radio, 2);
    }
    public void setRadio(double radio){
        this.radio = radio;
    }  

    public Double getAreaCirculo(){
        return areaCirculo;
    }

    public Double getRadio(){
        return radio;
    }


} 
