/**
 * La clase AceiteOlivo representa un aderezo extra
 * Extiende la clase Extra
 */
public class AceiteOlivo extends Extra{

    /**
     * Constructor de la clase AceiteOlivo.
     * @param platilloCentro El platillo al que se le agregara AceiteOlivo extra.
     */
    public AceiteOlivo (Platillo platilloCentro){
        super(platilloCentro);
    }

    /**
     * Obtiene el nombre del platillo con el AceiteOlivo extra agregado.
     * @return Nombre del platillo con la descripcion del AceiteOlivo extra.
     */
    public String getNombre(){
        return platilloCentro.getNombre() + ", Aceite de olivo extra";
    }

    /**
     * Obtiene el costo del platillo con el AceiteOlivo extra agregado.
     * @return Costo total del platillo con el AceiteOlivo incluido.
     */
    public int getCosto(){
        return  95 + platilloCentro.getCosto();
    }
}
