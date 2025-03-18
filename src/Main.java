
import java.io.BufferedWriter;
import java.io.FileWriter;  
/**
 * Clase principal que inicia la heladería Rotsy.
 */
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Platillo entrada;
        Platillo platoFuerte;
        Platillo postre;

        BufferedWriter bw;
        // MenuHelados menu = new MenuHelados();
        // menu.mostrar
        System.out.println("Bienvenido a El Puyol\n Puedes seleccionar platillos para una comida corrida");
        menu.showMenu();

        entrada = menu.getEntrada();
        platoFuerte = menu.getPlatoFuerte();
        postre = menu.getPostre();

        try {
            bw = new BufferedWriter(new FileWriter("HistorialDePedidos.txt"));
            bw.write("Platillo solicitado\n");
            bw.write("Entrada\n");
            bw.write(entrada.getNombre() + "\n");
            bw.write("Plato fuerte\n");
            bw.write(platoFuerte.getNombre() + "\n");
            bw.write("Postre\n");
            bw.write(postre.getNombre() + "\n");
            bw.close();        
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
