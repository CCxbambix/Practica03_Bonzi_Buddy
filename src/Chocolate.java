public class Chocolate extends Extra{

    public Chocolate (Platillo platilloCentro){
        super(platilloCentro);
    }

    public String getDescripcion(){
        return platilloCentro.getDescripcion() + ",Chocolate";
    }

    public int getCosto(){
        return  95 + platilloCentro.getCosto();
    }
}