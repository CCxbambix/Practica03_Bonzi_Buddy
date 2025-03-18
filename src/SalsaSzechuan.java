/**
 * La clase SalsaSzechuan representa un aderezo extra
 * Extiende la clase Extra
 */
public class SalsaSzechuan extends Extra{

    /**
     * Constructor de la clase SalsaSzechuan.
     * @param platilloCentro El platillo al que se le agregara la salsa szechuan extra.
     */
    public SalsaSzechuan (Platillo platilloCentro){
        super(platilloCentro);
    }

    /**
     * Obtiene el nombre del platillo con la salsa szechuan extra agregada.
     * @return Nombre del platillo con la descripcion de la salsa extra.
     */
    public String getNombre(){
        return platilloCentro.getNombre() + ", Salsa Szechuan";
    }

    /**
     * Obtiene el costo del platillo con la salsa szechuan extra agregada.
     * @return Costo total del platillo con la salsa incluida.
     */
    public int getCosto(){
        return  80 + platilloCentro.getCosto();
    }
}