package co.edu.utp.misiontic2022.c2;


public class Juguete {

    protected static final String GENEROEDAD = "niño";
    protected static final Integer TAMANO = 1;
    protected static final Double PRECIO = 100.0;

    protected String generoEdad;
    protected Integer tamano;
    protected Double precio;

    public Juguete(){
        this.precio = PRECIO;
        this.tamano = TAMANO;
        this.generoEdad = GENEROEDAD;
    }

    public Juguete(Double precio, Integer tamano){
        this.precio = precio;
        tipoTamano(tamano);
        this.generoEdad = GENEROEDAD;
    }

    public Juguete(Double precio, Integer tamano, String generoEdad){
        this.precio = precio;
        tipoTamano(tamano);
        tipoGeneroEdad(generoEdad);
    }

    public void tipoGeneroEdad(String generoEdad){
        String generosEdad[] = {"niñobebe", "niñabebe", "niña", "niño"}; 
        boolean encontrado = false;
        for(int i=0; i<generosEdad.length;i++){
            if(generosEdad[i].equals(generoEdad)){
                encontrado = true;
            }
        }

        if(encontrado){
            this.generoEdad=generoEdad;
        }else{
            this.generoEdad=GENEROEDAD;
        }
    }

    public void tipoTamano(Integer tamano){
        if(tamano >= 1 && tamano <= 6){
            this.tamano = tamano;
        }else{
            this.tamano = TAMANO;
        }
    }

    public double saldoFinal(){
        double adicion = 0;

        switch(this.generoEdad){
            case "niñobebe":
            adicion += 100;
                break;
            case "niñabebe":
            adicion += 80;
                break;
            case "niña":
            adicion += 70;
                break;
            case "niño":
            adicion += 50;
                break;
        }

        if(tamano==1){
            adicion+=200;
        }else if(tamano==2){
            adicion+=300;
        }else if(tamano==3){
            adicion+=400;
        }else if(tamano==4){
            adicion+=500;
        }else if(tamano==5){
            adicion+=600;
        }else if(tamano==6){
            adicion+=700;
        }
        return adicion + precio;
    }
}
/*    public static String getGENEROEDAD() {
        return GENEROEDAD;
    }

    public static Integer getTAMANO() {
        return TAMANO;
    }

    public static Double getPRECIO() {
        return PRECIO;
    }

    public String getGeneroEdad() {
        return generoEdad;
    }

    public void setGeneroEdad(String generoEdad) {
        this.generoEdad = generoEdad;
    }

    public Integer getTamano() {
        return tamano;
    }

    public void setTamano(Integer tamano) {
        this.tamano = tamano;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }*/
    
