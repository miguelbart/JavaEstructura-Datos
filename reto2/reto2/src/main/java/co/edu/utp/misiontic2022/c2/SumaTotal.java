package co.edu.utp.misiontic2022.c2;

public class SumaTotal {
    protected Double totalJuguete;
    protected Double totalSoldado;
    protected Double totalBarbie;
    protected Juguete[] listaJuguetes;

    public SumaTotal(Juguete listaJuguetes[]){
        this.totalJuguete = 0.0;
        this.totalSoldado = 0.0;
        this.totalBarbie = 0.0;
        this.listaJuguetes = listaJuguetes;
    }

    public void mostrarTotales(){
        for(int i=0; i<listaJuguetes.length; i++){
            if(listaJuguetes[i] instanceof Juguete){
                totalJuguete+=listaJuguetes[i].saldoFinal();
            }
            if(listaJuguetes[i] instanceof Soldado){
                totalSoldado+=listaJuguetes[i].saldoFinal();
            }
            if(listaJuguetes[i] instanceof Barbie){
              totalBarbie+=listaJuguetes[i].saldoFinal();
            }
        }
            System.out.println("La suma del precio de los juguetes  es de "+totalJuguete);
            System.out.println("La suma del precio de los Soldados es de "+totalSoldado);
            System.out.println("La suma del precio de las Barbies es de "+totalBarbie);
    }
}
    

