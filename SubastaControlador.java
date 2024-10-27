import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SubastaControlador implements ActionListener, ListSelectionListener {
    private SubastaVista vista;
    private Subasta modelo;

    public SubastaControlador(SubastaVista vista, Subasta modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        try {
            if (evento.getActionCommand().equals("Salir")) {
                System.exit(1);
            } else if (evento.getActionCommand().equals("Conectar")) {
                String usuario = vista.getUsuario();
                modelo.registraUsuario(usuario);
            } else if (evento.getActionCommand().equals("Poner a la venta")) {
                String usuario = vista.getUsuario();
                String producto = vista.getProducto();
                float precioInicial = vista.getPrecioInicial();
                modelo.agregaProductoALaVenta(usuario, producto, precioInicial);
            } else if (evento.getActionCommand().equals("Obtener lista")) {
                Vector<InformacionProducto> lista = modelo.obtieneCatalogo();
                vista.reinicializaListaProductos();
                for (InformacionProducto producto : lista) {
                    vista.agregaProducto(producto.getNombreProducto());
                }
            } else if (evento.getActionCommand().equals("Ofrecer")) {
                String producto = vista.getProductoSeleccionado();
                float monto = vista.getMontoOfrecido();
                String usuario = vista.getUsuario();
                modelo.agregaOferta(usuario, producto, monto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            String producto = vista.getProductoSeleccionado();
            if (producto != null) {
                vista.desplegarPrecio(producto);
            }
        }
    }
}

