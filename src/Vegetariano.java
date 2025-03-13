public class Vegetariano extends Extra{

    public Vegetariano (Platillo platilloCentro){
        super(platilloCentro);
    }

    public String getDescripcion(){
        return platilloCentro.getDescripcion() + ",Vegetariano";
    }

    public int getCosto(){
        return  400 + platilloCentro.getCosto();
    }
}