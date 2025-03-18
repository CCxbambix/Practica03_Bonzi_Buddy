/**
 * La clase SalsaMangohabanero representa un aderezo extra
 * Extiende la clase Extra
 */
public class SalsaMangoHabanero extends Extra{

    /**
     * Constructor de la clase SalsaMangoHabanero.
     * @param platilloCentro El platillo al que se le agregara la salsa mango-habanero extra.
     */
    public SalsaMangoHabanero (Platillo platilloCentro){
        super(platilloCentro);
    }

    /**
     * Obtiene el nombre del platillo con la salsa mango-habanero extra agregada.
     * @return Nombre del platillo con la descripcion de la salsa extra.
     */
    public String getNombre(){
        return platilloCentro.getNombre() + ", Salsa mango-habanero exra";
    }

    /**
     * Obtiene el costo del platillo con la salsa mango-habanero extra agregada.
     * @return Costo total del platillo con la salsa incluida.
     */
    public int getCosto(){
        return  80 + platilloCentro.getCosto();
    }
}