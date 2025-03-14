public class PanDeAjo extends Platillo{

    private String nombre = "Pan de ajo";

    private String descripcion = nombre;

    private int costo= 100;
    
    private String tipoPlatillo = "Entrada";

    public PanDeAjo(String nombre, String deString, int costo, String tipoPlatillo){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.tipoPlatillo = tipoPlatillo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public int getCosto(){
        return costo;
    }

    public void setCosto(int costo){
        this.costo = costo;
    }

    public String getTipoPlatillo(){
        return tipoPlatillo;
    } 

    public void setTipoPlatillo(String tipoPlatillo){
        this.tipoPlatillo = tipoPlatillo;
    }
}