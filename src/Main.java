import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Clase principal que inicia la heladería y el restaurante.
 */
public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();  
        MenuHeladoAdapter menuHelado = new MenuHeladoAdapter(); // Adaptador para menú de helados

        // Variables para cada platillo de la comida
        Platillo entrada;
        Platillo platoFuerte;
        Platillo postreNormal;  // Postre del menú principal
        Platillo postreHelado;  // Postre de la heladería
        BufferedWriter bw;

        // 1) Bienvenida y muestra del menú principal
        System.out.println("Bienvenido a El Puyol\nPuedes seleccionar platillos para una comida corrida");
        menu.showMenu();

        // 2) Selección de la entrada
        entrada = menu.getEntrada();
        entrada = añadirExtra(entrada, menu, 3); // Restricciones alimenticias
        entrada = añadirExtra(entrada, menu, 1); // Extras salados

        // 3) Selección del plato fuerte
        platoFuerte = menu.getPlatoFuerte();
        platoFuerte = añadirExtra(platoFuerte, menu, 3); // Restricciones alimenticias
        platoFuerte = añadirExtra(platoFuerte, menu, 1); // Extras salados

        // 4) Selección de postre (menú principal)
        postreNormal = menu.getPostre();
        postreNormal = añadirExtra(postreNormal, menu, 3); // Restricciones alimenticias
        postreNormal = añadirExtra(postreNormal, menu, 2); // Extras de postre

        // 5) Selección de postre adicional (menú de helados)
        System.out.println("\nTambién puedes elegir un postre de nuestra heladería:");
        menuHelado.showMenu();  
        postreHelado = menuHelado.getPostre();  

        // 6) Mostrar pedido final
        System.out.println("\nPedido realizado:");
        System.out.println("Entrada: " + entrada.getNombre() + "\t$" + entrada.getCosto());
        System.out.println("Plato Fuerte: " + platoFuerte.getNombre() + "\t$" + platoFuerte.getCosto());
        System.out.println("Postre (menú normal): " + postreNormal.getNombre() + "\t$" + postreNormal.getCosto());
        System.out.println("Postre (heladería): " + postreHelado.getNombre() + "\t$" + postreHelado.getCosto());
        
        double total = entrada.getCosto() 
                     + platoFuerte.getCosto() 
                     + postreNormal.getCosto() 
                     + postreHelado.getCosto();
        System.out.println("Total: $" + total);

        // 7) Guardar en el historial
        try {
            bw = new BufferedWriter(new FileWriter("HistorialDePedidos.txt"));
            bw.write("Platillo solicitado\n");
            bw.write("Entrada: " + entrada.getNombre() + "\n");
            bw.write("Plato fuerte: " + platoFuerte.getNombre() + "\n");
            bw.write("Postre (menú normal): " + postreNormal.getNombre() + "\n");
            bw.write("Postre (heladería): " + postreHelado.getNombre() + "\n");
            bw.write("Total: $" + total + "\n");
            bw.close();
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    /**
     * Método auxiliar para añadir extras o restricciones a un platillo.
     * @param platillo El platillo base.
     * @param menu Referencia al menú para obtener los decoradores.
     * @param tipoExtra 1=extra salado, 2=extra postre, 3=restricción alimenticia.
     * @return El platillo decorado.
     */
    public static Platillo añadirExtra(Platillo platillo, Menu menu, int tipoExtra) {
        String mensaje;
        String eleccion;
        Scanner sc = new Scanner(System.in);

        // Mensaje distinto si es restricción alimenticia o extra
        mensaje = (tipoExtra == 3)
                ? "Desea añadir una restricción alimenticia y/n?"
                : "Desea añadir un extra y/n";

        System.out.println(mensaje);
        eleccion = sc.nextLine();
        if (!eleccion.toLowerCase().contains("y")) return platillo;

        do {
            switch (tipoExtra) {
                case 1:
                    platillo = menu.getExtraSalado(platillo);
                    break;
                case 2:
                    platillo = menu.getExtraPostre(platillo);
                    break;
                case 3:
                    platillo = menu.getExtraModalidad(platillo);
                    break;
                default:
                    platillo = new Vacio(platillo);
                    break;
            }
            mensaje = (tipoExtra == 3)
                    ? "¿Deseas añadir otra restricción alimenticia? y/n"
                    : "¿Deseas añadir otro extra? y/n";

            System.out.println(mensaje);
            eleccion = sc.nextLine();
            if (!eleccion.toLowerCase().contains("y")) break;
        } while (true);

        return platillo;
    }
}
