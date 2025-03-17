
import java.util.ArrayList;

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
        
        System.out.println("\nENTRADAS ");
        showSection(entradas);
        System.out.println("\nPLATOS FUERTES");
        showSection(platosFuertes);
        System.out.println("\nPOSTRES");
        showSection(postres);
    }

    private void showSection(ArrayList<Platillo> platillos){
        for (Platillo platillo : entradas ){
            System.out.println("\n\t" + platillo.getNombre() + "\t\t" + platillo.getCosto());
            System.out.println("\t" + platillo.getDescripcion());
        }
    }
}
