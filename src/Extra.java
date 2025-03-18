/**
 * Clase Abstracta Extra que representa un complemento a los platillos
 * Implementa el patron decorador
 */
public abstract class Extra extends Platillo{

    /**
     * Se refiere al platillo base al que se le agregara el extra.
     */
    protected Platillo platilloCentro;

    /**
     * Constructor que inicializa el extra de un platillo.
     * @param platilloCentro El platillo al que se le añadirá el extra.
     */
    public Extra (Platillo platilloCentro){
        this.platilloCentro = platilloCentro;
    }

    /**
     * Obtiene el nombre del platillo.
     * @return El nombre del platillo.
     */
    public String getNombre(){
        return platilloCentro.getNombre();
    }

    /**
     * Obtiene la descripcion del platillo.
     * @return La descripcion del platillo.
     */
    public String getDescripcion(){
        return platilloCentro .getDescripcion();
    }

    /**
     * Obtiene el costo total del platillo con el extra.
     * @return El costo del platillo.
     */
    public int getCosto(){
        return platilloCentro.getCosto();
    }   
}