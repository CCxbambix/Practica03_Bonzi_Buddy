public class Nueces extends Extra{

    public Nueces (Platillo platilloCentro){
        super(platilloCentro);
    }

    public String getNombre(){
        return platilloCentro.getNombre() + ", Nueces extra";
    }

    public int getCosto(){
        return  115 + platilloCentro.getCosto();
    }
}