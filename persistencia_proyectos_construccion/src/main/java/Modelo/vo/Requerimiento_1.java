package Modelo.vo;

public class Requerimiento_1 {

public String Ciudad;
public String Acabados;
public String Clasificacion;
public String Banco_Vinculado;
public String Constructora;

public Requerimiento_1(){

}

public Requerimiento_1(String ciudad, String acabados, String clasificacion, String banco_Vinculado,
        String constructora) {
        Ciudad = ciudad;
        Acabados = acabados;
        Clasificacion = clasificacion;
        Banco_Vinculado = banco_Vinculado;
        Constructora = constructora;
    }

    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
    public String getAcabados() {
        return Acabados;
    }
    public void setAcabados(String acabados) {
        Acabados = acabados;
    }
    public String getClasificacion() {
        return Clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        Clasificacion = clasificacion;
    }
    public String getBanco_Vinculado() {
        return Banco_Vinculado;
    }
    public void setBanco_Vinculado(String banco_Vinculado) {
        Banco_Vinculado = banco_Vinculado;
    }
    public String getConstructora() {
        return Constructora;
    }
    public void setConstructora(String constructora) {
        Constructora = constructora;
    }
 
}
