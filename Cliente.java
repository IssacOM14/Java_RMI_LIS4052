import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Vector;

public class Cliente {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Subasta subasta = (Subasta) registry.lookup("Subasta");
            
            SubastaVista vista = new SubastaVista();
            SubastaControlador controlador = new SubastaControlador(vista, subasta);
            
            vista.asignarActionListener(controlador);
            vista.asignarListSelectionListener(controlador);
        } catch (Exception e) {
            System.err.println("Error en el cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

