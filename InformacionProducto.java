import java.io.Serializable;

public class InformacionProducto implements Serializable {

	private static final long serialVersionUID = 1L;  // Recomendado para clases serializables
	
    String vendedor;
    String producto;
    float precioInicial;
    float precioActual;

    public InformacionProducto( String v, String p, float pi ) {
        vendedor = v;
        producto = p;
        precioInicial = pi;
        precioActual = pi;
    }

    public boolean actualizaPrecio( float monto ) {
        if( monto > precioActual ) {
            precioActual = monto;
            return true;
        } else
            return false;
    }

    public String getNombreProducto() {
        return producto;
    }

    public float getPrecioActual() {
        return precioActual;
    }
}
