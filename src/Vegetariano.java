public class Vegetariano extends Extra{

    public Vegetariano (Platillo platilloCentro){
        super(platilloCentro);
    }

    public String getNombre(){
        return platilloCentro.getNombre() + ", Vegetariano";
    }

    public int getCosto(){
        return  400 + platilloCentro.getCosto();
    }
}