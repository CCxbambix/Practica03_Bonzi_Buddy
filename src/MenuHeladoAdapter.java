/**
 * Adaptador para integrar MenuHelados
 */
public class MenuHeladoAdapter extends Menu {
    private MenuHelados menuHelados;
    
    public MenuHeladoAdapter() {
        this.menuHelados = new MenuHelados();
    }
    
    /**
     * Muestra el menú de helados utilizando la estructura del Menu
     */
    @Override
    public void showMenu() {
        System.out.println("\n--- MENÚ DE HELADOS ---");
        menuHelados.mostrarMenu();
    }
}
