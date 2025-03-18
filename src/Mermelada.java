/**
 * La clase Mermelada representa un aderezo extra
 * Extiende la clase Extra
 */
public class Mermelada extends Extra{

    /**
     * Constructor de la clase Mermelada.
     * @param platilloCentro El platillo al que se le agregara mermelada extra.
     */
    public Mermelada (Platillo platilloCentro){
        super(platilloCentro);
    }

    /**
     * Obtiene el nombre del platillo con la mermelada extra agregada.
     * @return Nombre del platillo con la descripcion de la mermelada extra.
     */
    public String getNombre(){
        return platilloCentro.getNombre() + ", Mermelada extra";
    }

    /**
     * Obtiene el costo del platillo con la mermelada extra agregada.
     * @return Costo total del platillo con la mermelada incluida.
     */
    public int getCosto(){
        return  55 + platilloCentro.getCosto();
    }
}