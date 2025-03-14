public abstract class Extra extends Platillo{

    protected Platillo platilloCentro;

    public Extra (Platillo platilloCentro){
        this.platilloCentro = platilloCentro;
    }

    public String getNombre(){
        return platilloCentro.getNombre();
    }

    public String getDescripcion(){
        return platilloCentro.getDescripcion();
    }

    public int getCosto(){
        return platilloCentro.getCosto();
    }
}