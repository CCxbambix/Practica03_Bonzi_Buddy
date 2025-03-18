public class SinGluten extends Extra{

    public SinGluten (Platillo platilloCentro){
        super(platilloCentro);
    }

    public String getNombre(){
        return platilloCentro.getNombre() + ", Sin Gluten ";
    }

    public int getCosto(){
        return 500 + platilloCentro.getCosto();
    }
}