/**
 * La clase EmpanizadoFlaminHot representa un aderezo extra
 * Extiende la clase Extra
 */
public class EmpanizadoFlaminHot extends Extra{
    Platillo platillo;


    /**
     * Constructor de la clase EmpanizadoFlaminHot.
     * @param platilloCentro El platillo al que se le agregara el empanizado Flamin Hot.
     */
    public EmpanizadoFlaminHot (Platillo platilloCentro){
        super(platilloCentro);
    }

    /**
     * Obtiene el nombre del platillo con el empanizado Flamin Hot agregado.
     * @return Nombre del platillo con la descripcion del empanizado extra.
     */
    public String getNombre(){
        return platilloCentro.getNombre() + ",Empanizado Flaming Hot";
    }

    /**
     * Obtiene el costo del platillo con el empanizado Flamin Hot agregado.
     * @return Costo total del platillo con el empanizado incluido.
     */
    public int getCosto(){
        return  100 + platilloCentro.getCosto();
    }
}