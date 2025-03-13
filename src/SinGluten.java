public class SinGluten extends Extra{

    public SinGluten (Platillo platilloCentro){
        super(platilloCentro);
    }

    public String getDescripcion(){
        return platilloCentro.getDescripcion() + ", Sin Gluten ";
    }

    public int getCosto(){
        return 500 + platilloCentro.getCosto();
    }
}