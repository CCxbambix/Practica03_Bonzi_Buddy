public class Queso extends Extra{

    public Queso (Platillo platilloCentro){
        super(platilloCentro);
    }

    public String getNombre(){
        return platilloCentro.getNombre() + ", queso extra";
    }

    public int getCosto(){
        return  115 + platilloCentro.getCosto();
    }
}