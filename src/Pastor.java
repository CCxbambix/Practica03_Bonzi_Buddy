public class Pastor extends Platillo{

    private String nombre = "Pastor";

    private String descripcion = "plato tradicional mexicano hecho con carne de cerdo adobada y asada verticalmente en un asador llamado trompo";

    private int costo= 400;
    
    private String tipoPlatillo = "Platillo Fuerte";

    public Pastor(String nombre, String deString, int costo, String tipoPlatillo){
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