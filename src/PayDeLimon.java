public class PayDeLimon extends Platillo{

    private String nombre = "Pay de limon";

    private String descripcion = nombre;

    private int costo= 125;
    
    private String tipoPlatillo = "Postre";

    public PayDeLimon(String nombre, String deString, int costo, String tipoPlatillo){
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