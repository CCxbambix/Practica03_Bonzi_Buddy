public class Vegano extends Extra{

    public Vegano (Platillo platilloCentro){
        super(platilloCentro);
    }

    public String getDescripcion(){
        return platilloCentro.getDescripcion() + ",Vegano";
    }

    public int getCosto(){
        return  300 + platilloCentro.getCosto();
    }
}