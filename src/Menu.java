
import java.lang.reflect.Array;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Esta clase representa el menu de nuestro restaurante donde
 * clasificamos los platillos en entradas, plato fuerte y postre
 * Permite mostrar el menu y seleccionar platillos
 */
public class Menu {
    
    private ArrayList<Platillo> entradas;
    private ArrayList<Platillo> platosFuertes;
    private ArrayList<Platillo> postres;
    
    /**
     * Constructor de la clase menu
     */
    public Menu(){
        entradas = new ArrayList<Platillo>();
        entradas.add(new PanDeAjo());
        entradas.add(new TotoposGuacamole());
        entradas.add(new Ensalada());

        platosFuertes = new ArrayList<Platillo>();
        platosFuertes.add(new Pastor());
        platosFuertes.add(new Ramen());
        platosFuertes.add(new Milanesa());

        postres = new ArrayList<Platillo>();
        postres.add(new Tapioca());
        postres.add(new PayDeLimon());
        postres.add(new PastelDeChocolate());
    }

    /**
     * Muestra el menu completo 
     */
    public void showMenu(){
        System.out.println("BIENVENIDO A EL PUYOL, TE MOSTRAMOS EL MENU PARA QUE CHEQUES AGUSTO");
        System.out.println("\nENTRADAS\n");
        showSection(entradas);
        System.out.println("\nPLATOS FUERTES\n");
        showSection(platosFuertes);
        System.out.println("\nPOSTRES\n");
        showSection(postres);
    }  

    /**
     * Muestra una seccion del menu
     * @param platillos lista de platillos
     */
    private void showSection(ArrayList<Platillo> platillos){
        for (Platillo platillo : platillos ){
            System.out.println("\t" + platillo.getNombre() + "\t\t" + platillo.getCosto());
            System.out.println("\t" + platillo.getDescripcion());
        }
    }

    /**
     * Solicita al usuario que seleccione una entrada
     * @return El platillo seleccionado
     */
    public Platillo getEntrada(){
        System.out.println("\nPor favor, selecciona una entrada\n");
        return getPlatillo(entradas);

    }

    /**
     * Solicita al usuario que seleccione un plato fuerte
     * @return El platillo seleccionado
     */
    public Platillo getPlatoFuerte(){
        System.out.println("\nPor favor, selecciona un plato fuerte\n");
        return getPlatillo(platosFuertes);

    }

    /**
     * Solicita al usuario que seleccione un postre
     * @return El platillo seleccionado
     */
    public Platillo getPostre(){
        System.out.println("\nPor favor, selecciona un postre\n");
        return getPlatillo(postres);

    }

    /**
     * Muestra las opciones disponibles de una lista de platillos y permite seleccionar una
     * @param platillos Lista de platillos a elegir 
     * @return El platillo seleccionado 
     */
    private Platillo getPlatillo(List<Platillo> platillos){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        for (Platillo plato : platillos) {
            System.out.println(i +". " + plato.getNombre());
            i++;
        }
        int eleccion = 0;
        String opcion = sc.nextLine();

        try {
            eleccion = Integer.parseInt(opcion);            
        } catch (Exception e) {
            System.out.println("\nElije una opción válida");
            return getPlatillo(platillos);
        }
        Platillo plato = platillos.get(eleccion-1);
        return plato;
    }

    public Extra getExtraSalado(Platillo platillo){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nElije un extra de tu preferencia");
        System.out.println("1) Aceite Olivo\n2) Aderezo Ranch\n3) Nueces");
        System.out.println("4) Empanizado Flaming Hot\n5) Queso\n6) Salsa Mango Habanero");
        System.out.println("7) Salsa Szechuan\n8) Nadota");

        String opcion = sc.nextLine();
        int eleccion = 0;

        try {
            eleccion = Integer.parseInt(opcion);
        } catch (Exception e) {
            System.out.println("\nElije una opción válida");
            return getExtraSalado(platillo);
        }

        switch (eleccion) {
            case 1:
                return new AceiteOlivo(platillo);
            case 2:
                return new AderezoRanch(platillo);
            case 3:
                return new Nueces(platillo);
            case 4:
                return new EmpanizadoFlaminHot(platillo);
            case 5:
                return new Queso(platillo);
            case 6:
                return new SalsaMangoHabanero(platillo);
            case 7: 
                return new SalsaSzechuan(platillo);
            case 8:
                return new Vacio(platillo);
            default:
                System.out.println("\nElije una opción válida");
                return getExtraSalado(platillo);
        }
    }

    public Extra getExtraPostre (Platillo platillo){
        Scanner sc = new Scanner (System.in);
        System.out.println("\nElije el extra de tu preferencia");
        System.out.println("1) Chocolate\n2) Meremelada\n3) Nueces\n4) nadota");

        String opcion = sc.nextLine();
        int eleccion = 0;

        try {
            eleccion = Integer.parseInt(opcion);
        } catch (Exception e) {
            System.out.println("\nElije una opción válida");
            return getExtraPostre(platillo);
        }

        switch (eleccion) {
            case 1:
                return new Chocolate(platillo);
            case 2:
                return new Mermelada(platillo);
            case 3:
                return new Nueces(platillo);
            case 4:
                return new Vacio(platillo);
            default:
                System.out.println("\nElije una opción válida");
                return getExtraPostre(platillo);
        }
    }

    public Extra getExtraModalidad(Platillo platillo){
        Scanner sc = new Scanner (System.in);
        ArrayList<Extra> modos;
        System.out.println("\nPor favor selecciona si requieres un tipo de comida especial");
        System.out.println("1) Vegetariano\n2) Vegano\n3) Sin gluten\n4) Nadota");

        String opcion = sc.nextLine();
        int eleccion = 0;

        try {
            eleccion = Integer.parseInt(opcion);
        } catch (Exception e) {
            System.out.println("\nElije una opción válida");
            return getExtraModalidad(platillo);
        }

        switch (eleccion) {
            case 1:
                return new Vegetariano(platillo);
            case 2:
                return new Vegano(platillo);
            case 3:
                return new SinGluten(platillo);
            case 4:
                return new Vacio(platillo);
            default:
                System.out.println("\nElije una opción válida");
                return getExtraModalidad(platillo);
        }
    }
}
