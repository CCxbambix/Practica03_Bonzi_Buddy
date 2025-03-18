public class Chocolate extends Extra{

    public Chocolate (Platillo platilloCentro){
        super(platilloCentro);
    }

    public String getNombre(){
        return platilloCentro.getNombre() + ", Chocolate extra";
    }

    public int getCosto(){
        return  95 + platilloCentro.getCosto();
    }
}