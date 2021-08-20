package co.edu.utp.misiontic2022.c2;

public class App 
{
    public static void main( String[] args ){
        //Juguete[] item=new Juguete[3];
        //item[0] = new Juguete(150.0, 6, "niñobebe");
        //item[1] = new Soldado(5000.0, 5, "niño", "coronel");
        //item[2] = new Barbie(2000.0, 2, "niña", "piloto");
        //SumaTotal analisis1 = new SumaTotal(item);
        //analisis1.mostrarTotales();

        //System.out.println(juguete.saldoFinal());
        //System.out.println(soldado.saldoFinal());
        //System.out.println(barbie.saldoFinal());

        Juguete intem[]=new Juguete[5];
	    intem[0]=new Juguete(150.0,6,"niñobebe");
	    intem[1]=new Soldado(5000.0, 5,"niño", "coronel");
	    intem[2]=new Barbie(500.0,10,"infante","mama");
	    intem[3]=new Juguete(400.0,3,"niña");
	    intem[4]=new Soldado(100.0,4,"niñabebe","coronel");
	    SumaTotal analisis1 = new SumaTotal(intem);
	    analisis1.mostrarTotales();

    }
}
