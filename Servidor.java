import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {
    public static void main(String[] args) {
        try {
            SubastaImpl subasta = new SubastaImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("Subasta", subasta);
            System.out.println("Servidor de subastas listo en el puerto 1099...");
        } catch (Exception e) {
            System.err.println("Error en el servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

