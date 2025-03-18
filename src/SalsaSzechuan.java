public class SalsaSzechuan extends Extra{

    public SalsaSzechuan (Platillo platilloCentro){
        super(platilloCentro);
    }

    public String getNombre(){
        return platilloCentro.getNombre() + ", Salsa Szechuan";
    }

    public int getCosto(){
        return  80 + platilloCentro.getCosto();
    }
}