package co.edu.utp.misiontic2022.c2;

public class Soldado extends Juguete {
    protected static final String RANGOBASE = "teniente";
    protected String rango = "";
    
    public Soldado(){
        super.precio = super.PRECIO;
        super.generoEdad = super.GENEROEDAD;
        super.tamano = super.TAMANO;
        this.rango = this.RANGOBASE;
    }

    public Soldado(Double precio, Integer tamano){
        super.precio = precio;
        super.tipoTamano(tamano);
        super.generoEdad = super.GENEROEDAD;
        this.rango = this.RANGOBASE;

    }

    public Soldado(Double precio, Integer tamano, String generoEdad, String rango){
        super.precio = precio;
        super.tipoGeneroEdad(generoEdad);
        super.tipoTamano(tamano);
        tipoRango(rango);
    }

    public void tipoRango(String rango){
        String rangos[] = {"teniente", "capitan", "coronel"};
        boolean encontrado = false;

        for(int i=0; i<rangos.length; i++){
            if(rangos[i].equals(rango)){
                encontrado = true;
            }
        }
        if(encontrado){
            this.rango = rango;
        }else{
            this.rango = this.RANGOBASE;
        }
    }
    public double saldoFinal(){
        
        double adicion = 0;
        switch(this.rango){
            case "teniente":
            adicion += 50;
                break;
            case "capitan":
            adicion += 60;
                break;
            case "coronel":
            adicion += 70;
                break;
            //default:
            //adicion +=50;
        }
        return adicion+super.saldoFinal();
    }
}
