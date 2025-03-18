public class Mermelada extends Extra{

    public Mermelada (Platillo platilloCentro){
        super(platilloCentro);
    }

    public String getNombre(){
        return platilloCentro.getNombre() + ", Mermelada extra";
    }

    public int getCosto(){
        return  55 + platilloCentro.getCosto();
    }
}