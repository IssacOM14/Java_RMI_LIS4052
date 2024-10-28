package subasta;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: subasta.proto")
public final class SubastaGrpc {

  private SubastaGrpc() {}

  public static final String SERVICE_NAME = "subasta.Subasta";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<subasta.SubastaOuterClass.ProductoRequest,
      subasta.SubastaOuterClass.ProductoResponse> getAgregarProductoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgregarProducto",
      requestType = subasta.SubastaOuterClass.ProductoRequest.class,
      responseType = subasta.SubastaOuterClass.ProductoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<subasta.SubastaOuterClass.ProductoRequest,
      subasta.SubastaOuterClass.ProductoResponse> getAgregarProductoMethod() {
    io.grpc.MethodDescriptor<subasta.SubastaOuterClass.ProductoRequest, subasta.SubastaOuterClass.ProductoResponse> getAgregarProductoMethod;
    if ((getAgregarProductoMethod = SubastaGrpc.getAgregarProductoMethod) == null) {
      synchronized (SubastaGrpc.class) {
        if ((getAgregarProductoMethod = SubastaGrpc.getAgregarProductoMethod) == null) {
          SubastaGrpc.getAgregarProductoMethod = getAgregarProductoMethod = 
              io.grpc.MethodDescriptor.<subasta.SubastaOuterClass.ProductoRequest, subasta.SubastaOuterClass.ProductoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "subasta.Subasta", "AgregarProducto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  subasta.SubastaOuterClass.ProductoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  subasta.SubastaOuterClass.ProductoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SubastaMethodDescriptorSupplier("AgregarProducto"))
                  .build();
          }
        }
     }
     return getAgregarProductoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<subasta.SubastaOuterClass.OfertaRequest,
      subasta.SubastaOuterClass.OfertaResponse> getHacerOfertaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HacerOferta",
      requestType = subasta.SubastaOuterClass.OfertaRequest.class,
      responseType = subasta.SubastaOuterClass.OfertaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<subasta.SubastaOuterClass.OfertaRequest,
      subasta.SubastaOuterClass.OfertaResponse> getHacerOfertaMethod() {
    io.grpc.MethodDescriptor<subasta.SubastaOuterClass.OfertaRequest, subasta.SubastaOuterClass.OfertaResponse> getHacerOfertaMethod;
    if ((getHacerOfertaMethod = SubastaGrpc.getHacerOfertaMethod) == null) {
      synchronized (SubastaGrpc.class) {
        if ((getHacerOfertaMethod = SubastaGrpc.getHacerOfertaMethod) == null) {
          SubastaGrpc.getHacerOfertaMethod = getHacerOfertaMethod = 
              io.grpc.MethodDescriptor.<subasta.SubastaOuterClass.OfertaRequest, subasta.SubastaOuterClass.OfertaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "subasta.Subasta", "HacerOferta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  subasta.SubastaOuterClass.OfertaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  subasta.SubastaOuterClass.OfertaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SubastaMethodDescriptorSupplier("HacerOferta"))
                  .build();
          }
        }
     }
     return getHacerOfertaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      subasta.SubastaOuterClass.CatalogoResponse> getObtenerCatalogoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ObtenerCatalogo",
      requestType = com.google.protobuf.Empty.class,
      responseType = subasta.SubastaOuterClass.CatalogoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      subasta.SubastaOuterClass.CatalogoResponse> getObtenerCatalogoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, subasta.SubastaOuterClass.CatalogoResponse> getObtenerCatalogoMethod;
    if ((getObtenerCatalogoMethod = SubastaGrpc.getObtenerCatalogoMethod) == null) {
      synchronized (SubastaGrpc.class) {
        if ((getObtenerCatalogoMethod = SubastaGrpc.getObtenerCatalogoMethod) == null) {
          SubastaGrpc.getObtenerCatalogoMethod = getObtenerCatalogoMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, subasta.SubastaOuterClass.CatalogoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "subasta.Subasta", "ObtenerCatalogo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  subasta.SubastaOuterClass.CatalogoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SubastaMethodDescriptorSupplier("ObtenerCatalogo"))
                  .build();
          }
        }
     }
     return getObtenerCatalogoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubastaStub newStub(io.grpc.Channel channel) {
    return new SubastaStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubastaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SubastaBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SubastaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SubastaFutureStub(channel);
  }

  /**
   */
  public static abstract class SubastaImplBase implements io.grpc.BindableService {

    /**
     */
    public void agregarProducto(subasta.SubastaOuterClass.ProductoRequest request,
        io.grpc.stub.StreamObserver<subasta.SubastaOuterClass.ProductoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAgregarProductoMethod(), responseObserver);
    }

    /**
     */
    public void hacerOferta(subasta.SubastaOuterClass.OfertaRequest request,
        io.grpc.stub.StreamObserver<subasta.SubastaOuterClass.OfertaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHacerOfertaMethod(), responseObserver);
    }

    /**
     */
    public void obtenerCatalogo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<subasta.SubastaOuterClass.CatalogoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getObtenerCatalogoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAgregarProductoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                subasta.SubastaOuterClass.ProductoRequest,
                subasta.SubastaOuterClass.ProductoResponse>(
                  this, METHODID_AGREGAR_PRODUCTO)))
          .addMethod(
            getHacerOfertaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                subasta.SubastaOuterClass.OfertaRequest,
                subasta.SubastaOuterClass.OfertaResponse>(
                  this, METHODID_HACER_OFERTA)))
          .addMethod(
            getObtenerCatalogoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                subasta.SubastaOuterClass.CatalogoResponse>(
                  this, METHODID_OBTENER_CATALOGO)))
          .build();
    }
  }

  /**
   */
  public static final class SubastaStub extends io.grpc.stub.AbstractStub<SubastaStub> {
    private SubastaStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubastaStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubastaStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubastaStub(channel, callOptions);
    }

    /**
     */
    public void agregarProducto(subasta.SubastaOuterClass.ProductoRequest request,
        io.grpc.stub.StreamObserver<subasta.SubastaOuterClass.ProductoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAgregarProductoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hacerOferta(subasta.SubastaOuterClass.OfertaRequest request,
        io.grpc.stub.StreamObserver<subasta.SubastaOuterClass.OfertaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHacerOfertaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void obtenerCatalogo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<subasta.SubastaOuterClass.CatalogoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getObtenerCatalogoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SubastaBlockingStub extends io.grpc.stub.AbstractStub<SubastaBlockingStub> {
    private SubastaBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubastaBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubastaBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubastaBlockingStub(channel, callOptions);
    }

    /**
     */
    public subasta.SubastaOuterClass.ProductoResponse agregarProducto(subasta.SubastaOuterClass.ProductoRequest request) {
      return blockingUnaryCall(
          getChannel(), getAgregarProductoMethod(), getCallOptions(), request);
    }

    /**
     */
    public subasta.SubastaOuterClass.OfertaResponse hacerOferta(subasta.SubastaOuterClass.OfertaRequest request) {
      return blockingUnaryCall(
          getChannel(), getHacerOfertaMethod(), getCallOptions(), request);
    }

    /**
     */
    public subasta.SubastaOuterClass.CatalogoResponse obtenerCatalogo(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getObtenerCatalogoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SubastaFutureStub extends io.grpc.stub.AbstractStub<SubastaFutureStub> {
    private SubastaFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubastaFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubastaFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubastaFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<subasta.SubastaOuterClass.ProductoResponse> agregarProducto(
        subasta.SubastaOuterClass.ProductoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAgregarProductoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<subasta.SubastaOuterClass.OfertaResponse> hacerOferta(
        subasta.SubastaOuterClass.OfertaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHacerOfertaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<subasta.SubastaOuterClass.CatalogoResponse> obtenerCatalogo(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getObtenerCatalogoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AGREGAR_PRODUCTO = 0;
  private static final int METHODID_HACER_OFERTA = 1;
  private static final int METHODID_OBTENER_CATALOGO = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SubastaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SubastaImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AGREGAR_PRODUCTO:
          serviceImpl.agregarProducto((subasta.SubastaOuterClass.ProductoRequest) request,
              (io.grpc.stub.StreamObserver<subasta.SubastaOuterClass.ProductoResponse>) responseObserver);
          break;
        case METHODID_HACER_OFERTA:
          serviceImpl.hacerOferta((subasta.SubastaOuterClass.OfertaRequest) request,
              (io.grpc.stub.StreamObserver<subasta.SubastaOuterClass.OfertaResponse>) responseObserver);
          break;
        case METHODID_OBTENER_CATALOGO:
          serviceImpl.obtenerCatalogo((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<subasta.SubastaOuterClass.CatalogoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SubastaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SubastaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return subasta.SubastaOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Subasta");
    }
  }

  private static final class SubastaFileDescriptorSupplier
      extends SubastaBaseDescriptorSupplier {
    SubastaFileDescriptorSupplier() {}
  }

  private static final class SubastaMethodDescriptorSupplier
      extends SubastaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SubastaMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SubastaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SubastaFileDescriptorSupplier())
              .addMethod(getAgregarProductoMethod())
              .addMethod(getHacerOfertaMethod())
              .addMethod(getObtenerCatalogoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
