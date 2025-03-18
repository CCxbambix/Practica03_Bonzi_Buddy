/**
 * La clase Queso representa un aderezo extra
 * Extiende la clase Extra
 */
public class Queso extends Extra{

    /**
     * Constructor de la clase Queso.
     * @param platilloCentro El platillo al que se le agregara queso extra.
     */
    public Queso (Platillo platilloCentro){
        super(platilloCentro);
    }

    /**
     * Obtiene el nombre del platillo con el queso extra agregado.
     * @return Nombre del platillo con la descripcion del queso extra.
     */
    public String getNombre(){
        return platilloCentro.getNombre() + ", queso extra";
    }

    /**
     * Obtiene el costo del platillo con el queso extra agregado.
     * @return Costo total del platillo con el queso incluido.
     */
    public int getCosto(){
        return  115 + platilloCentro.getCosto();
    }
}