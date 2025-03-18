public class SalsaMangoHabanero extends Extra{

    public SalsaMangoHabanero (Platillo platilloCentro){
        super(platilloCentro);
    }

    public String getNombre(){
        return platilloCentro.getNombre() + ", Salsa mango-habanero exra";
    }

    public int getCosto(){
        return  80 + platilloCentro.getCosto();
    }
}