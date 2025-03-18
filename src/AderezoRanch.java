public class AderezoRanch extends Extra{

    public AderezoRanch (Platillo platilloCentro){
        super(platilloCentro);
    }

    public String getNombre(){
        return platilloCentro.getNombre() + ", aderezo ranch extra";
    }

    public int getCosto(){
        return  80 + platilloCentro.getCosto();
    }
}