package com.exemple.grpcspringebank.grpc.stub;

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
    comments = "Source: bank.proto")
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyRequest,
      com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyResponse> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert",
      requestType = com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyRequest.class,
      responseType = com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyRequest,
      com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyResponse> getConvertMethod() {
    io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyRequest, com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyResponse> getConvertMethod;
    if ((getConvertMethod = BankServiceGrpc.getConvertMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertMethod = BankServiceGrpc.getConvertMethod) == null) {
          BankServiceGrpc.getConvertMethod = getConvertMethod = 
              io.grpc.MethodDescriptor.<com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyRequest, com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convert"))
                  .build();
          }
        }
     }
     return getConvertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountRequest,
      com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountResponse> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAccount",
      requestType = com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountRequest.class,
      responseType = com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountRequest,
      com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountResponse> getGetAccountMethod() {
    io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountRequest, com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountResponse> getGetAccountMethod;
    if ((getGetAccountMethod = BankServiceGrpc.getGetAccountMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetAccountMethod = BankServiceGrpc.getGetAccountMethod) == null) {
          BankServiceGrpc.getGetAccountMethod = getGetAccountMethod = 
              io.grpc.MethodDescriptor.<com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountRequest, com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getAccount"))
                  .build();
          }
        }
     }
     return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountRequest,
      com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountResponse> getGetListAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListAccount",
      requestType = com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountRequest.class,
      responseType = com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountRequest,
      com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountResponse> getGetListAccountMethod() {
    io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountRequest, com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountResponse> getGetListAccountMethod;
    if ((getGetListAccountMethod = BankServiceGrpc.getGetListAccountMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetListAccountMethod = BankServiceGrpc.getGetListAccountMethod) == null) {
          BankServiceGrpc.getGetListAccountMethod = getGetListAccountMethod = 
              io.grpc.MethodDescriptor.<com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountRequest, com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getListAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getListAccount"))
                  .build();
          }
        }
     }
     return getGetListAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.GetStreamOfAccountTransactionRequest,
      com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction> getGetStreamOfAccountTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStreamOfAccountTransactions",
      requestType = com.exemple.grpcspringebank.grpc.stub.Bank.GetStreamOfAccountTransactionRequest.class,
      responseType = com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.GetStreamOfAccountTransactionRequest,
      com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction> getGetStreamOfAccountTransactionsMethod() {
    io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.GetStreamOfAccountTransactionRequest, com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction> getGetStreamOfAccountTransactionsMethod;
    if ((getGetStreamOfAccountTransactionsMethod = BankServiceGrpc.getGetStreamOfAccountTransactionsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetStreamOfAccountTransactionsMethod = BankServiceGrpc.getGetStreamOfAccountTransactionsMethod) == null) {
          BankServiceGrpc.getGetStreamOfAccountTransactionsMethod = getGetStreamOfAccountTransactionsMethod = 
              io.grpc.MethodDescriptor.<com.exemple.grpcspringebank.grpc.stub.Bank.GetStreamOfAccountTransactionRequest, com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getStreamOfAccountTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.grpcspringebank.grpc.stub.Bank.GetStreamOfAccountTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getStreamOfAccountTransactions"))
                  .build();
          }
        }
     }
     return getGetStreamOfAccountTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction,
      com.exemple.grpcspringebank.grpc.stub.Bank.PerformStreamOfTransactionsResponse> getSubmitStreamOfTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "submitStreamOfTransactions",
      requestType = com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction.class,
      responseType = com.exemple.grpcspringebank.grpc.stub.Bank.PerformStreamOfTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction,
      com.exemple.grpcspringebank.grpc.stub.Bank.PerformStreamOfTransactionsResponse> getSubmitStreamOfTransactionsMethod() {
    io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction, com.exemple.grpcspringebank.grpc.stub.Bank.PerformStreamOfTransactionsResponse> getSubmitStreamOfTransactionsMethod;
    if ((getSubmitStreamOfTransactionsMethod = BankServiceGrpc.getSubmitStreamOfTransactionsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getSubmitStreamOfTransactionsMethod = BankServiceGrpc.getSubmitStreamOfTransactionsMethod) == null) {
          BankServiceGrpc.getSubmitStreamOfTransactionsMethod = getSubmitStreamOfTransactionsMethod = 
              io.grpc.MethodDescriptor.<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction, com.exemple.grpcspringebank.grpc.stub.Bank.PerformStreamOfTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "submitStreamOfTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.grpcspringebank.grpc.stub.Bank.PerformStreamOfTransactionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("submitStreamOfTransactions"))
                  .build();
          }
        }
     }
     return getSubmitStreamOfTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction,
      com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction> getExecuteStreamOfTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "executeStreamOfTransaction",
      requestType = com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction.class,
      responseType = com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction,
      com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction> getExecuteStreamOfTransactionMethod() {
    io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction, com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction> getExecuteStreamOfTransactionMethod;
    if ((getExecuteStreamOfTransactionMethod = BankServiceGrpc.getExecuteStreamOfTransactionMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getExecuteStreamOfTransactionMethod = BankServiceGrpc.getExecuteStreamOfTransactionMethod) == null) {
          BankServiceGrpc.getExecuteStreamOfTransactionMethod = getExecuteStreamOfTransactionMethod = 
              io.grpc.MethodDescriptor.<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction, com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "executeStreamOfTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("executeStreamOfTransaction"))
                  .build();
          }
        }
     }
     return getExecuteStreamOfTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction,
      com.exemple.grpcspringebank.grpc.stub.Bank.EmptyResponse> getSubmitTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "submitTransaction",
      requestType = com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction.class,
      responseType = com.exemple.grpcspringebank.grpc.stub.Bank.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction,
      com.exemple.grpcspringebank.grpc.stub.Bank.EmptyResponse> getSubmitTransactionMethod() {
    io.grpc.MethodDescriptor<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction, com.exemple.grpcspringebank.grpc.stub.Bank.EmptyResponse> getSubmitTransactionMethod;
    if ((getSubmitTransactionMethod = BankServiceGrpc.getSubmitTransactionMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getSubmitTransactionMethod = BankServiceGrpc.getSubmitTransactionMethod) == null) {
          BankServiceGrpc.getSubmitTransactionMethod = getSubmitTransactionMethod = 
              io.grpc.MethodDescriptor.<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction, com.exemple.grpcspringebank.grpc.stub.Bank.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "submitTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.grpcspringebank.grpc.stub.Bank.EmptyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("submitTransaction"))
                  .build();
          }
        }
     }
     return getSubmitTransactionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    return new BankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary Model
     * </pre>
     */
    public void convert(com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    /**
     */
    public void getAccount(com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountRequest request,
        io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     */
    public void getListAccount(com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountRequest request,
        io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * server streaming model
     * </pre>
     */
    public void getStreamOfAccountTransactions(com.exemple.grpcspringebank.grpc.stub.Bank.GetStreamOfAccountTransactionRequest request,
        io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStreamOfAccountTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction> submitStreamOfTransactions(
        io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.PerformStreamOfTransactionsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSubmitStreamOfTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * bidirectional stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction> executeStreamOfTransaction(
        io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction> responseObserver) {
      return asyncUnimplementedStreamingCall(getExecuteStreamOfTransactionMethod(), responseObserver);
    }

    /**
     */
    public void submitTransaction(com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction request,
        io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitTransactionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyRequest,
                com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT)))
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountRequest,
                com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountResponse>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getGetListAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountRequest,
                com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountResponse>(
                  this, METHODID_GET_LIST_ACCOUNT)))
          .addMethod(
            getGetStreamOfAccountTransactionsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.exemple.grpcspringebank.grpc.stub.Bank.GetStreamOfAccountTransactionRequest,
                com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction>(
                  this, METHODID_GET_STREAM_OF_ACCOUNT_TRANSACTIONS)))
          .addMethod(
            getSubmitStreamOfTransactionsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction,
                com.exemple.grpcspringebank.grpc.stub.Bank.PerformStreamOfTransactionsResponse>(
                  this, METHODID_SUBMIT_STREAM_OF_TRANSACTIONS)))
          .addMethod(
            getExecuteStreamOfTransactionMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction,
                com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction>(
                  this, METHODID_EXECUTE_STREAM_OF_TRANSACTION)))
          .addMethod(
            getSubmitTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction,
                com.exemple.grpcspringebank.grpc.stub.Bank.EmptyResponse>(
                  this, METHODID_SUBMIT_TRANSACTION)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractStub<BankServiceStub> {
    private BankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary Model
     * </pre>
     */
    public void convert(com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccount(com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountRequest request,
        io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListAccount(com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountRequest request,
        io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * server streaming model
     * </pre>
     */
    public void getStreamOfAccountTransactions(com.exemple.grpcspringebank.grpc.stub.Bank.GetStreamOfAccountTransactionRequest request,
        io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStreamOfAccountTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction> submitStreamOfTransactions(
        io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.PerformStreamOfTransactionsResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSubmitStreamOfTransactionsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * bidirectional stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction> executeStreamOfTransaction(
        io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getExecuteStreamOfTransactionMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void submitTransaction(com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction request,
        io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitTransactionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary Model
     * </pre>
     */
    public com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyResponse convert(com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountResponse getAccount(com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountResponse getListAccount(com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * server streaming model
     * </pre>
     */
    public java.util.Iterator<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction> getStreamOfAccountTransactions(
        com.exemple.grpcspringebank.grpc.stub.Bank.GetStreamOfAccountTransactionRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStreamOfAccountTransactionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.exemple.grpcspringebank.grpc.stub.Bank.EmptyResponse submitTransaction(com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction request) {
      return blockingUnaryCall(
          getChannel(), getSubmitTransactionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractStub<BankServiceFutureStub> {
    private BankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary Model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyResponse> convert(
        com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountResponse> getAccount(
        com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountResponse> getListAccount(
        com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.exemple.grpcspringebank.grpc.stub.Bank.EmptyResponse> submitTransaction(
        com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitTransactionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;
  private static final int METHODID_GET_ACCOUNT = 1;
  private static final int METHODID_GET_LIST_ACCOUNT = 2;
  private static final int METHODID_GET_STREAM_OF_ACCOUNT_TRANSACTIONS = 3;
  private static final int METHODID_SUBMIT_TRANSACTION = 4;
  private static final int METHODID_SUBMIT_STREAM_OF_TRANSACTIONS = 5;
  private static final int METHODID_EXECUTE_STREAM_OF_TRANSACTION = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.ConvertCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.GetAccountResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_ACCOUNT:
          serviceImpl.getListAccount((com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.GetListAccountResponse>) responseObserver);
          break;
        case METHODID_GET_STREAM_OF_ACCOUNT_TRANSACTIONS:
          serviceImpl.getStreamOfAccountTransactions((com.exemple.grpcspringebank.grpc.stub.Bank.GetStreamOfAccountTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction>) responseObserver);
          break;
        case METHODID_SUBMIT_TRANSACTION:
          serviceImpl.submitTransaction((com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction) request,
              (io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.EmptyResponse>) responseObserver);
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
        case METHODID_SUBMIT_STREAM_OF_TRANSACTIONS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.submitStreamOfTransactions(
              (io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.PerformStreamOfTransactionsResponse>) responseObserver);
        case METHODID_EXECUTE_STREAM_OF_TRANSACTION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.executeStreamOfTransaction(
              (io.grpc.stub.StreamObserver<com.exemple.grpcspringebank.grpc.stub.Bank.AccountTransaction>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.exemple.grpcspringebank.grpc.stub.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetListAccountMethod())
              .addMethod(getGetStreamOfAccountTransactionsMethod())
              .addMethod(getSubmitStreamOfTransactionsMethod())
              .addMethod(getExecuteStreamOfTransactionMethod())
              .addMethod(getSubmitTransactionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
