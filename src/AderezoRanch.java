/**
 * La clase AderezoRanch representa un aderezo extra
 * Extiende la clase Extra
 */
public class AderezoRanch extends Extra{

    /**
     * Constructor de la clase AderezoRanch.
     * @param platilloCentro El platillo al que se le agregara el aderezo ranch.
     */
    public AderezoRanch (Platillo platilloCentro){
        super(platilloCentro);
    }

    /**
     * Obtiene el nombre del platillo con el aderezo ranch agregado.
     * @return Nombre del platillo con la descripcion del aderezo extra.
     */
    public String getNombre(){
        return platilloCentro.getNombre() + ", aderezo ranch extra";
    }

    /**
     * Obtiene el costo del platillo con el aderezo ranch agregado.
     * @return Costo total del platillo con el aderezo incluido.
     */
    public int getCosto(){
        return  80 + platilloCentro.getCosto();
    }
}