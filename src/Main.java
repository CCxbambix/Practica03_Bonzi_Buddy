
import java.io.BufferedWriter;
import java.io.FileWriter;  
import java.util.Scanner;
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
        entrada = añadirExtra(entrada,menu,3);
        entrada = añadirExtra(entrada, menu, 1);

        platoFuerte = menu.getPlatoFuerte();
        platoFuerte = añadirExtra(platoFuerte,menu,3);
        platoFuerte = añadirExtra(platoFuerte, menu, 1);

        postre = menu.getPostre();
        postre = añadirExtra(postre,menu,3);
        postre = añadirExtra(postre, menu, 2);

        System.out.println("\nPedido realizado:");
        System.out.println("Entrada\t" + entrada.getNombre() + "\t" + entrada.getCosto());
        System.out.println("Plato Fuerte\t" + platoFuerte.getNombre() + "\t" + platoFuerte.getCosto());
        System.out.println("Postre\t" + postre.getNombre() + "\t" + postre.getCosto());
        System.out.println("Total\t" + (entrada.getCosto() + platoFuerte.getCosto() + postre.getCosto()));  

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

    public static Platillo añadirExtra(Platillo platillo, Menu menu, int tipoExtra){
        String mensaje;
        String eleccion;
        Scanner sc = new Scanner(System.in);
        mensaje = (tipoExtra == 3)? "Desea añadir una restriccion aliminticia y/n?" : "Desea añadir un extra y/n";
        System.out.println(mensaje);
        eleccion = sc.nextLine();
        if (!eleccion.toLowerCase().contains("y")) return platillo;

        do{
            switch (tipoExtra) {
                case 1:
                    platillo = menu.getExtraSalado(platillo);
                    break;
                case 2:
                    platillo =  menu.getExtraPostre(platillo);
                    break;
                case 3:
                    platillo = menu.getExtraModalidad(platillo);
                    break;
                default:
                    platillo = new Vacio(platillo);
                    break;
            }
            mensaje = (tipoExtra == 3)? "¿Deseas añadir otra restricción alimenticia? y/n" : "¿Deseas añadir otro extra? y/n";
            System.out.println(mensaje);
            eleccion = sc.nextLine();
            if (!eleccion.toLowerCase().contains("y")) break;
        } while (true);

        return platillo;
    }
}
