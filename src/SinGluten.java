/**
 * La clase SinGluten representa una opcion de platillo sin gluten
 * Extiende la clase Extra
 */
public class SinGluten extends Extra{

    /**
     * Constructor de la clase SinGluten.
     * @param platilloCentro El platillo sera sin gluten
     */
    public SinGluten (Platillo platilloCentro){
        super(platilloCentro);
    }

    /**
     * Obtiene el nombre del platillo con la opcion sin gluten aplicada.
     * @return Nombre del platillo con la descripción "Sin Gluten" agregada.
     */
    public String getNombre(){
        return platilloCentro.getNombre() + ", Sin Gluten ";
    }

    /**
     * Obtiene el costo del platillo con la opción sin gluten aplicada.
     * @return Costo total del platillo con la opción sin gluten incluida.
     */
    public int getCosto(){
        return 500 + platilloCentro.getCosto();
    }
}