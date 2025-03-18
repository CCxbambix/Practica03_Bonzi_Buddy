public class EmpanizadoFlaminHot extends Extra{
    Platillo platillo;

    public EmpanizadoFlaminHot (Platillo platilloCentro){
        super(platilloCentro);
    }

    public String getNombre(){
        return platilloCentro.getNombre() + ",Empanizado Flaming Hot";
    }

    public int getCosto(){
        return  100 + platilloCentro.getCosto();
    }
}