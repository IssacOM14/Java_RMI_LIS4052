package subasta;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class Servidor {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(9090)
            .addService(new SubastaGrpcImpl())
            .build()
            .start();

        System.out.println("Servidor gRPC iniciado en el puerto 9090...");
        server.awaitTermination();
    }
}

