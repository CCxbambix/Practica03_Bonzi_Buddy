import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Clase principal que inicia la heladerisa y el restaurante.
 */
public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();  
        MenuHeladoAdapter menuHelado = new MenuHeladoAdapter(); // Adaptador para menu de helados

        // Variables para cada platillo de la comida
        Platillo entrada;
        Platillo platoFuerte;
        Platillo postreNormal;  // Postre del menu principal
        Platillo postreHelado;  // Postre de la heladería
        BufferedWriter bw;

        // 1) Bienvenida y muestra del menu principal
        System.out.println("Bienvenido a El Puyol\nPuedes seleccionar platillos para una comida corrida");
        menu.showMenu();

        // 2) Seleccion de la entrada
        entrada = menu.getEntrada();
        entrada = añadirExtra(entrada, menu, 3); // Restricciones alimenticias
        entrada = añadirExtra(entrada, menu, 1); // Extras salados

        // 3) Seleccion del plato fuerte
        platoFuerte = menu.getPlatoFuerte();
        platoFuerte = añadirExtra(platoFuerte, menu, 3); // Restricciones alimenticias
        platoFuerte = añadirExtra(platoFuerte, menu, 1); // Extras salados

        // 4) Seleccion de postre (menú principal)
        postreNormal = menu.getPostre();
        postreNormal = añadirExtra(postreNormal, menu, 3); // Restricciones alimenticias
        postreNormal = añadirExtra(postreNormal, menu, 2); // Extras de postre

        // 5) Seleccion de postre adicional (menu de helados)
        System.out.println("\nTambien puedes elegir un postre de nuestra heladería:");
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
            bw.write("Postre (menu normal): " + postreNormal.getNombre() + "\n");
            bw.write("Postre (heladeria): " + postreHelado.getNombre() + "\n");
            bw.write("Total: $" + total + "\n");
            bw.close();
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    /**
     * Metodo auxiliar para aniadir extras o restricciones a un platillo.
     * @param platillo El platillo base.
     * @param menu Referencia al menu para obtener los decoradores.
     * @param tipoExtra 1=extra salado, 2=extra postre, 3=restriccion alimenticia.
     * @return El platillo decorado.
     */
    public static Platillo añadirExtra(Platillo platillo, Menu menu, int tipoExtra) {
        String mensaje;
        String eleccion;
        Scanner sc = new Scanner(System.in);

        // Mensaje distinto si es restriccion alimenticia o extra
        mensaje = (tipoExtra == 3)
                ? "Desea aniadir una restriccion alimenticia y/n?"
                : "Desea aniadir un extra y/n";

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
                    ? "¿Deseas aniadir otra restricción alimenticia? y/n"
                    : "¿Deseas aniadir otro extra? y/n";

            System.out.println(mensaje);
            eleccion = sc.nextLine();
            if (!eleccion.toLowerCase().contains("y")) break;
        } while (true);

        return platillo;
    }
}
