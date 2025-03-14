
    /**
     * Clase que representa a las comidas implementando la interfaz Platillo 
     * y sus metodos de la interfaz 
     */
    public abstract class Platillo { 

    /**
     * Atributos de la clase 
     */

    /**
     * Representa a el nombre del platillo
     */
    private String nombre;

    /**
     * Representa a la descripcion del platillo
     */
    private String descripcion;

    /**
     * Representa el precio del platillo
     */
    private int costo;

    /**
     * Represent asi el platillo es entrada, platillo fuerte o postre
     */

    private String tipoPlatillo;

    /**
     * Metodos de la clase 
     */

    /**
     * Metodo que regresa el nombre del platillo
     * @return String con valor a como se llama la comida 
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Retorna la descripcion de la comida
     */
    public String getDescripcion(){
        return descripcion;
    }

    /**
     * Represa el costo del platillo
     * @return int con valor al costo del platillo 
     */
    public int getCosto(){
        return costo;
    }
    
    /**
     * regresa el tipo de platillo que es (entrada, platillo fuerte o postre
     * @return String con valor a tipo de platillo que es 
     */
    public String getTipoPlatillo(){
        return tipoPlatillo;
    }


}