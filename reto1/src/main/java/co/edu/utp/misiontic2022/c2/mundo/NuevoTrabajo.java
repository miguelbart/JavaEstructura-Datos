package co.edu.utp.misiontic2022.c2.mundo;

import java.nio.channels.ClosedSelectorException;

/**
 * implementar el reto1
 * Class to claculate the interest for a loan in a proyect
 */
public class NuevoTrabajo 
{

    /*public static void main( String[] args )
    {
        NuevoTrabajo reto1 = new NuevoTrabajo(36, 3500000, 1.18);
        reto1.calcularISimple();
        reto1.calcularICompuesto();
        reto1.compararInversion();
    }*/
    
        Integer pTiempo = 0;
        Double pCapital = 0.0;
        Double pInteres = 0.0;
        
        public static void main( String[] args )
        {
            NuevoTrabajo reto1 = new NuevoTrabajo(36, 3500000.0, 0.18);
            Double a = reto1.interesSimple();
            Double b = reto1.interesCompuesto();
            double c = reto1.calcularDiferenciaIntereses(a, b);
            reto1.compararInversion(a, b, c);
        }
        
        public NuevoTrabajo(){
            
        }
    
        public NuevoTrabajo(Integer pTiempo, Double pCapital, Double pInteres){
            this.pTiempo = pTiempo;
            this.pCapital = pCapital;
            this.pInteres = pInteres;
    
        }
        public Double interesSimple(){
            Double a = pCapital * (pInteres / 100) * pTiempo;  
            return a;
            }
    
        public Double interesCompuesto(){
            Double b = pCapital * (Math.pow((1+ pInteres / 100), pTiempo) - 1); 
            return b;
            }
    
        public Double calcularDiferenciaIntereses(Double a, Double b){
             Double c = b - a;
             return c;
            }
    
        public void compararInversion(Double a, Double b, Double c){
            if((a != 0) && (b!=0)){
            System.out.println("El interés simple es: " + a +", el interés compuesto es: " + b + ", La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: " + c );
            }else{
                System.out.println("Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.");
            }
                
         }
    }
   /* private Integer pTiempo = 0;
    private Double pCapital = 0.0;
    private Double pInteres = 0.0;

    public NuevoTrabajo(){
        System.out.println("Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.");
    }

    public NuevoTrabajo(int pTiempo, double pCapital, double pInteres){
        this.pTiempo = pTiempo;
        this.pCapital = pCapital;
        this.pInteres = pInteres;

    }
     public Double calcularISimple(){
        Double inSimple = pCapital * (pInteres / 100) * pTiempo;  
        return inSimple;
        }

     public Double calcularICompuesto(){
        Double inCompuesto = pCapital * (Math.pow((1+ pInteres / 100), pTiempo) - 1); 
        return inCompuesto;
        }

     public Double calcularDiferenciaIntereses(Double inSimple, Double inCompuesto){
         Double diferencia = calcularICompuesto() - calcularISimple();
         return diferencia;
        }

     public void compararInversion(){
        System.out.println("El interés simple es: " + calcularISimple() +", el interés compuesto es: "+ calcularICompuesto() 
        + ", La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa" 
        + " de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: "
        + calcularDiferenciaIntereses(calcularISimple(),calcularICompuesto())+".");
        }*/

