package co.edu.utp.misiontic2022.c2;

public class Barbie extends Juguete{
    protected static final String OFICIOBASE = "mamá";
    protected String oficio = "";

    public Barbie(){
        super.precio = super.PRECIO;
        super.generoEdad = super.GENEROEDAD;
        super.tamano = super.TAMANO;
        this.oficio = this.OFICIOBASE;
    }

    public Barbie(Double precio, String generoEdad){
        super.precio = precio;
        super.generoEdad = generoEdad;
        super.tamano = super.TAMANO;
        this.oficio = this.OFICIOBASE;
        
    }

    public Barbie(Double precio, Integer tamano, String generoEdad, String oficio){
        super.precio = precio;
        super.tipoGeneroEdad(generoEdad);
        super.tipoTamano(tamano);
        tipoOficio(oficio);   
    }

    public void tipoOficio(String oficio){
        String rangos[] = {"piloto", "doctora", "mamá"};
        boolean encontrado = false;

        for(int i=0; i<rangos.length; i++){
            if(rangos[i].equals(oficio)){
                encontrado = true;
            }
        }
        if(encontrado){
            this.oficio = oficio;
        }else{
            this.oficio = this.OFICIOBASE;
        }
    }

    public double saldoFinal(){
        
        double adicion = 0;
        switch(this.oficio){
            case "piloto":
            adicion += 50;
                break;
            case "doctora":
            adicion += 30;
                break;
            case "mamá":
            adicion += 120;
                break;
           // default:
            //adicion +=50;
        }
        return adicion+super.saldoFinal();
    }
}
