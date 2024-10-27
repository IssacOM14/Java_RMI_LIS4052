import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.Vector;

public class SubastaImpl extends UnicastRemoteObject implements Subasta {
    private Hashtable<String, String> usuarios;
    private Hashtable<String, InformacionProducto> productos;
    private Hashtable<String, InformacionOferta> ofertas;

    protected SubastaImpl() throws RemoteException {
        super();
        usuarios = new Hashtable<>();
        productos = new Hashtable<>();
        ofertas = new Hashtable<>();
    }

    @Override
    public boolean registraUsuario(String nombre) throws RemoteException {
        if (!usuarios.containsKey(nombre)) {
            System.out.println("Agregando un nuevo usuario: " + nombre);
            usuarios.put(nombre, nombre);
            return true;
        }
        return false;
    }

    @Override
    public boolean agregaProductoALaVenta(String vendedor, String producto, float precioInicial) throws RemoteException {
        if (!productos.containsKey(producto)) {
            System.out.println("Agregando un nuevo producto: " + producto);
            productos.put(producto, new InformacionProducto(vendedor, producto, precioInicial));
            return true;
        }
        return false;
    }

    @Override
    public boolean agregaOferta(String comprador, String producto, float monto) throws RemoteException {
        if (productos.containsKey(producto)) {
            InformacionProducto infoProd = productos.get(producto);
            if (infoProd.actualizaPrecio(monto)) {
                ofertas.put(producto + comprador, new InformacionOferta(comprador, producto, monto));
                return true;
            }
        }
        return false;
    }

    @Override
    public Vector<InformacionProducto> obtieneCatalogo() throws RemoteException {
        return new Vector<>(productos.values());
    }
}

