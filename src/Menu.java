
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    
    private ArrayList<Platillo> entradas;
    private ArrayList<Platillo> platosFuertes;
    private ArrayList<Platillo> postres;

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

    public void showMenu(){
        System.out.println("BIENVENIDO A EL PUYOL, TE MOSTRAMOS EL MENU PARA QUE CHEQUES AGUSTO");
        System.out.println("\nENTRADAS\n");
        showSection(entradas);
        System.out.println("\nPLATOS FUERTES\n");
        showSection(platosFuertes);
        System.out.println("\nPOSTRES\n");
        showSection(postres);
    }

    private void showSection(ArrayList<Platillo> platillos){
        for (Platillo platillo : platillos ){
            System.out.println("\t" + platillo.getNombre() + "\t\t" + platillo.getCosto());
            System.out.println("\t" + platillo.getDescripcion());
        }
    }

    public Platillo getEntrada(){
        System.out.println("Por favor, selecciona una entrada\n");
        return getPlatillo(entradas);

    }

    public Platillo getPlatoFuerte(){
        System.out.println("Por favor, selecciona un plato fuerte\n");
        return getPlatillo(platosFuertes);

    }

    public Platillo getPostre(){
        System.out.println("Por favor, selecciona un postre\n");
        return getPlatillo(postres);

    }


    private Platillo getPlatillo(List<Platillo> platillos){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        for (Platillo plato : platillos) {
            System.out.println(i +". " + plato.getNombre());
            i++;
        }
        String opcion = sc.nextLine();
        int eleccion = Integer.parseInt(opcion);
        Platillo plato = platillos.get(eleccion-1);
        return plato;
    }
    
}
