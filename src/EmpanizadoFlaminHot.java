public class EmpanizadoFlaminHot extends Extra{
    Platillo platillo;

    public EmpanizadoFlaminHot (Platillo platilloCentro){
        super(platilloCentro);
    }

    public String getDescripcion(){
        return platilloCentro.getDescripcion() + ",Empanizado Flaming Hot";
    }

    public int getCosto(){
        return  100 + platilloCentro.getCosto();
    }
}