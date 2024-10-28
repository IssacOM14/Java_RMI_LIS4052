package subasta;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import subasta.SubastaOuterClass.*;

public class Cliente {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
            .usePlaintext()
            .build();

        SubastaGrpc.SubastaBlockingStub stub = SubastaGrpc.newBlockingStub(channel);

        Producto producto = Producto.newBuilder()
            .setVendedor("Juan")
            .setNombre("Laptop")
            .setPrecioInicial(500.0f)
            .setPrecioActual(500.0f)
            .build();

        ProductoResponse response = stub.agregarProducto(ProductoRequest.newBuilder().setProducto(producto).build());
        System.out.println(response.getMensaje());

        CatalogoResponse catalogo = stub.obtenerCatalogo(com.google.protobuf.Empty.getDefaultInstance());
        catalogo.getProductosList().forEach(p -> 
            System.out.println(p.getNombre() + " - Precio: " + p.getPrecioActual())
        );

        Oferta oferta = Oferta.newBuilder()
            .setComprador("Pedro")
            .setProducto("Laptop")
            .setMonto(600.0f)
            .build();

        OfertaResponse ofertaResponse = stub.hacerOferta(OfertaRequest.newBuilder().setOferta(oferta).build());
        System.out.println(ofertaResponse.getMensaje());

        channel.shutdown();
    }
}

