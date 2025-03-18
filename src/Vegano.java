/**
 * La clase Vegano representa una opcion de platillo vegano
 * Extiende la clase Extra
 */
public class Vegano extends Extra{

    /**
     * Constructor de la clase Vegano.
     * @param platilloCentro El platillo sera vegano
     */
    public Vegano (Platillo platilloCentro){
        super(platilloCentro);
    }

    /**
     * Obtiene el nombre del platillo con la opcion vegano aplicada.
     * @return Nombre del platillo con la descripción "Vegano" agregada.
     */
    public String getNombre(){
        return platilloCentro.getNombre() + ", Vegano";
    }

    /**
     * Obtiene el costo del platillo con la opción vegano aplicada.
     * @return Costo total del platillo con la opción vegano incluida.
     */
    public int getCosto(){
        return  300 + platilloCentro.getCosto();
    }
}