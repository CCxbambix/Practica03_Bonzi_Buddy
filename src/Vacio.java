/**
 * La clase Vacio es un extra que no agrega nada, solo permite trabajar un platillo como Extra;
 * Extiende la clase Extra
 */
public class Vacio extends Extra{

    /**
     * Constructor de la clase Vacio.
     * @param platilloCentro El platillo al que no se le agrega nada.
     */
    public Vacio (Platillo platilloCentro){
        super(platilloCentro);
    }

    /**
     * Obtiene el nombre del platillo sin agregados.
     * @return Nombre del platillo.
     */
    public String getNombre(){
        return platilloCentro.getNombre() + "";
    }

    /**
     * Obtiene el costo del platillo.
     * @return Costo total del platillo sin añadidos.
     */
    public int getCosto(){
        return  platilloCentro.getCosto();
    }
}