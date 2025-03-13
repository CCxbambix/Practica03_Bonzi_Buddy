public class SalsaSzechuan extends Extra{

    public SalsaSzechuan (Platillo platilloCentro){
        super(platilloCentro);
    }

    public String getDescripcion(){
        return platilloCentro.getDescripcion() + ",Salsa Szechuan";
    }

    public int getCosto(){
        return  80 + platilloCentro.getCosto();
    }
}