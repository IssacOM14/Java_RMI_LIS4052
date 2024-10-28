package subasta;
import subasta.SubastaGrpc;
import subasta.SubastaOuterClass.*;
import io.grpc.stub.StreamObserver;
import java.util.Hashtable;
import java.util.Vector;

public class SubastaGrpcImpl extends SubastaGrpc.SubastaImplBase {
    private Hashtable<String, Producto> productos = new Hashtable<>();

    @Override
    public void agregarProducto(ProductoRequest request, StreamObserver<ProductoResponse> responseObserver) {
        Producto producto = request.getProducto();
        ProductoResponse response;
        if (productos.containsKey(producto.getNombre())) {
            response = ProductoResponse.newBuilder()
                .setRegistrado(false)
                .setMensaje("El producto ya está registrado.")
                .build();
        } else {
            productos.put(producto.getNombre(), producto);
            response = ProductoResponse.newBuilder()
                .setRegistrado(true)
                .setMensaje("Producto registrado exitosamente.")
                .build();
        }

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void hacerOferta(OfertaRequest request, StreamObserver<OfertaResponse> responseObserver) {
        Oferta oferta = request.getOferta();
        Producto producto = productos.get(oferta.getProducto());

        if (producto != null && oferta.getMonto() > producto.getPrecioActual()) {
            producto = producto.toBuilder().setPrecioActual(oferta.getMonto()).build();
            productos.put(producto.getNombre(), producto);

            responseObserver.onNext(OfertaResponse.newBuilder()
                .setAceptada(true)
                .setMensaje("Oferta aceptada.")
                .build());
        } else {
            responseObserver.onNext(OfertaResponse.newBuilder()
                .setAceptada(false)
                .setMensaje("Oferta rechazada.")
                .build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public void obtenerCatalogo(com.google.protobuf.Empty request, StreamObserver<CatalogoResponse> responseObserver) {
        CatalogoResponse.Builder catalogo = CatalogoResponse.newBuilder();
        productos.values().forEach(catalogo::addProductos);
        responseObserver.onNext(catalogo.build());
        responseObserver.onCompleted();
    }
}

