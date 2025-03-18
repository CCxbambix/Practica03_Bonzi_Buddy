public class Vegano extends Extra{

    public Vegano (Platillo platilloCentro){
        super(platilloCentro);
    }

    public String getNombre(){
        return platilloCentro.getNombre() + ", Vegano";
    }

    public int getCosto(){
        return  300 + platilloCentro.getCosto();
    }
}