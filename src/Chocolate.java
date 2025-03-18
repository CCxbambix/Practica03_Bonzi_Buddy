/**
 * La clase Chocolate representa un aderezo extra
 * Extiende la clase Extra
 */
public class Chocolate extends Extra{

    /**
     * Constructor de la clase Chocolate.
     * @param platilloCentro El platillo al que se le agregara chocolate extra.
     */
    public Chocolate (Platillo platilloCentro){
        super(platilloCentro);
    }

    /**
     * Obtiene el nombre del platillo con el chocolate extra agregado.
     * @return Nombre del platillo con la descripcion del chocolate extra.
     */
    public String getNombre(){
        return platilloCentro.getNombre() + ", Chocolate extra";
    }

    /**
     * Obtiene el costo del platillo con el chocolate extra agregado.
     * @return Costo total del platillo con el chocolate incluido.
     */
    public int getCosto(){
        return  95 + platilloCentro.getCosto();
    }
}