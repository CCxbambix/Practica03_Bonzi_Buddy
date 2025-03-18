/**
 * La clase Vegetariano representa una opcion de platillo vegatariano
 * Extiende la clase Extra
 */
public class Vegetariano extends Extra{

    /**
     * Constructor de la clase Vegetariano.
     * @param platilloCentro El platillo sera vegetariano
     */
    public Vegetariano (Platillo platilloCentro){
        super(platilloCentro);
    }

    /**
     * Obtiene el nombre del platillo con la opcion vegetariano aplicada.
     * @return Nombre del platillo con la descripción "Vegetariano" agregada.
     */
    public String getNombre(){
        return platilloCentro.getNombre() + ", Vegetariano";
    }

    /**
     * Obtiene el costo del platillo con la opción vegetariano aplicada.
     * @return Costo total del platillo con la opción vegetariano incluida.
     */
    public int getCosto(){
        return  400 + platilloCentro.getCosto();
    }
}