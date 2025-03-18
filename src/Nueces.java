/**
 * La clase Nueces representa un aderezo extra
 * Extiende la clase Extra
 */
public class Nueces extends Extra{

    /**
     * Constructor de la clase Nueces.
     * @param platilloCentro El platillo al que se le agregaran nueces extra.
     */
    public Nueces (Platillo platilloCentro){
        super(platilloCentro);
    }

    /**
     * Obtiene el nombre del platillo con las nueces extra agregadas.
     * @return Nombre del platillo con la descripcion de las nueces extra.
     */
    public String getNombre(){
        return platilloCentro.getNombre() + ", Nueces extra";
    }

    /**
     * Obtiene el costo del platillo con las nueces extra agregadas.
     * @return Costo total del platillo con las nueces incluidas.
     */
    public int getCosto(){
        return  115 + platilloCentro.getCosto();
    }
}