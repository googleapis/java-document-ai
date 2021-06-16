package com.google.cloud.documentai.v1beta3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to call Cloud DocumentAI to process documents according to the
 * processor's definition. Processors are built using state-of-the-art Google
 * AI such as natural language, computer vision, and translation to extract
 * structured information from unstructured or semi-structured documents.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/documentai/v1beta3/document_processor_service.proto")
public final class DocumentProcessorServiceGrpc {

  private DocumentProcessorServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.documentai.v1beta3.DocumentProcessorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.ProcessRequest,
      com.google.cloud.documentai.v1beta3.ProcessResponse> getProcessDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessDocument",
      requestType = com.google.cloud.documentai.v1beta3.ProcessRequest.class,
      responseType = com.google.cloud.documentai.v1beta3.ProcessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.ProcessRequest,
      com.google.cloud.documentai.v1beta3.ProcessResponse> getProcessDocumentMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.ProcessRequest, com.google.cloud.documentai.v1beta3.ProcessResponse> getProcessDocumentMethod;
    if ((getProcessDocumentMethod = DocumentProcessorServiceGrpc.getProcessDocumentMethod) == null) {
      synchronized (DocumentProcessorServiceGrpc.class) {
        if ((getProcessDocumentMethod = DocumentProcessorServiceGrpc.getProcessDocumentMethod) == null) {
          DocumentProcessorServiceGrpc.getProcessDocumentMethod = getProcessDocumentMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.documentai.v1beta3.ProcessRequest, com.google.cloud.documentai.v1beta3.ProcessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProcessDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.documentai.v1beta3.ProcessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.documentai.v1beta3.ProcessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DocumentProcessorServiceMethodDescriptorSupplier("ProcessDocument"))
              .build();
        }
      }
    }
    return getProcessDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.BatchProcessRequest,
      com.google.longrunning.Operation> getBatchProcessDocumentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchProcessDocuments",
      requestType = com.google.cloud.documentai.v1beta3.BatchProcessRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.BatchProcessRequest,
      com.google.longrunning.Operation> getBatchProcessDocumentsMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.BatchProcessRequest, com.google.longrunning.Operation> getBatchProcessDocumentsMethod;
    if ((getBatchProcessDocumentsMethod = DocumentProcessorServiceGrpc.getBatchProcessDocumentsMethod) == null) {
      synchronized (DocumentProcessorServiceGrpc.class) {
        if ((getBatchProcessDocumentsMethod = DocumentProcessorServiceGrpc.getBatchProcessDocumentsMethod) == null) {
          DocumentProcessorServiceGrpc.getBatchProcessDocumentsMethod = getBatchProcessDocumentsMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.documentai.v1beta3.BatchProcessRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchProcessDocuments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.documentai.v1beta3.BatchProcessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DocumentProcessorServiceMethodDescriptorSupplier("BatchProcessDocuments"))
              .build();
        }
      }
    }
    return getBatchProcessDocumentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.FetchProcessorTypesRequest,
      com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse> getFetchProcessorTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchProcessorTypes",
      requestType = com.google.cloud.documentai.v1beta3.FetchProcessorTypesRequest.class,
      responseType = com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.FetchProcessorTypesRequest,
      com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse> getFetchProcessorTypesMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.FetchProcessorTypesRequest, com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse> getFetchProcessorTypesMethod;
    if ((getFetchProcessorTypesMethod = DocumentProcessorServiceGrpc.getFetchProcessorTypesMethod) == null) {
      synchronized (DocumentProcessorServiceGrpc.class) {
        if ((getFetchProcessorTypesMethod = DocumentProcessorServiceGrpc.getFetchProcessorTypesMethod) == null) {
          DocumentProcessorServiceGrpc.getFetchProcessorTypesMethod = getFetchProcessorTypesMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.documentai.v1beta3.FetchProcessorTypesRequest, com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchProcessorTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.documentai.v1beta3.FetchProcessorTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DocumentProcessorServiceMethodDescriptorSupplier("FetchProcessorTypes"))
              .build();
        }
      }
    }
    return getFetchProcessorTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.ListProcessorsRequest,
      com.google.cloud.documentai.v1beta3.ListProcessorsResponse> getListProcessorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProcessors",
      requestType = com.google.cloud.documentai.v1beta3.ListProcessorsRequest.class,
      responseType = com.google.cloud.documentai.v1beta3.ListProcessorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.ListProcessorsRequest,
      com.google.cloud.documentai.v1beta3.ListProcessorsResponse> getListProcessorsMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.ListProcessorsRequest, com.google.cloud.documentai.v1beta3.ListProcessorsResponse> getListProcessorsMethod;
    if ((getListProcessorsMethod = DocumentProcessorServiceGrpc.getListProcessorsMethod) == null) {
      synchronized (DocumentProcessorServiceGrpc.class) {
        if ((getListProcessorsMethod = DocumentProcessorServiceGrpc.getListProcessorsMethod) == null) {
          DocumentProcessorServiceGrpc.getListProcessorsMethod = getListProcessorsMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.documentai.v1beta3.ListProcessorsRequest, com.google.cloud.documentai.v1beta3.ListProcessorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProcessors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.documentai.v1beta3.ListProcessorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.documentai.v1beta3.ListProcessorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DocumentProcessorServiceMethodDescriptorSupplier("ListProcessors"))
              .build();
        }
      }
    }
    return getListProcessorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.CreateProcessorRequest,
      com.google.cloud.documentai.v1beta3.Processor> getCreateProcessorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProcessor",
      requestType = com.google.cloud.documentai.v1beta3.CreateProcessorRequest.class,
      responseType = com.google.cloud.documentai.v1beta3.Processor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.CreateProcessorRequest,
      com.google.cloud.documentai.v1beta3.Processor> getCreateProcessorMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.CreateProcessorRequest, com.google.cloud.documentai.v1beta3.Processor> getCreateProcessorMethod;
    if ((getCreateProcessorMethod = DocumentProcessorServiceGrpc.getCreateProcessorMethod) == null) {
      synchronized (DocumentProcessorServiceGrpc.class) {
        if ((getCreateProcessorMethod = DocumentProcessorServiceGrpc.getCreateProcessorMethod) == null) {
          DocumentProcessorServiceGrpc.getCreateProcessorMethod = getCreateProcessorMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.documentai.v1beta3.CreateProcessorRequest, com.google.cloud.documentai.v1beta3.Processor>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProcessor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.documentai.v1beta3.CreateProcessorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.documentai.v1beta3.Processor.getDefaultInstance()))
              .setSchemaDescriptor(new DocumentProcessorServiceMethodDescriptorSupplier("CreateProcessor"))
              .build();
        }
      }
    }
    return getCreateProcessorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.DeleteProcessorRequest,
      com.google.longrunning.Operation> getDeleteProcessorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProcessor",
      requestType = com.google.cloud.documentai.v1beta3.DeleteProcessorRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.DeleteProcessorRequest,
      com.google.longrunning.Operation> getDeleteProcessorMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.DeleteProcessorRequest, com.google.longrunning.Operation> getDeleteProcessorMethod;
    if ((getDeleteProcessorMethod = DocumentProcessorServiceGrpc.getDeleteProcessorMethod) == null) {
      synchronized (DocumentProcessorServiceGrpc.class) {
        if ((getDeleteProcessorMethod = DocumentProcessorServiceGrpc.getDeleteProcessorMethod) == null) {
          DocumentProcessorServiceGrpc.getDeleteProcessorMethod = getDeleteProcessorMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.documentai.v1beta3.DeleteProcessorRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProcessor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.documentai.v1beta3.DeleteProcessorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DocumentProcessorServiceMethodDescriptorSupplier("DeleteProcessor"))
              .build();
        }
      }
    }
    return getDeleteProcessorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.EnableProcessorRequest,
      com.google.longrunning.Operation> getEnableProcessorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableProcessor",
      requestType = com.google.cloud.documentai.v1beta3.EnableProcessorRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.EnableProcessorRequest,
      com.google.longrunning.Operation> getEnableProcessorMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.EnableProcessorRequest, com.google.longrunning.Operation> getEnableProcessorMethod;
    if ((getEnableProcessorMethod = DocumentProcessorServiceGrpc.getEnableProcessorMethod) == null) {
      synchronized (DocumentProcessorServiceGrpc.class) {
        if ((getEnableProcessorMethod = DocumentProcessorServiceGrpc.getEnableProcessorMethod) == null) {
          DocumentProcessorServiceGrpc.getEnableProcessorMethod = getEnableProcessorMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.documentai.v1beta3.EnableProcessorRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableProcessor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.documentai.v1beta3.EnableProcessorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DocumentProcessorServiceMethodDescriptorSupplier("EnableProcessor"))
              .build();
        }
      }
    }
    return getEnableProcessorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.DisableProcessorRequest,
      com.google.longrunning.Operation> getDisableProcessorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableProcessor",
      requestType = com.google.cloud.documentai.v1beta3.DisableProcessorRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.DisableProcessorRequest,
      com.google.longrunning.Operation> getDisableProcessorMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.DisableProcessorRequest, com.google.longrunning.Operation> getDisableProcessorMethod;
    if ((getDisableProcessorMethod = DocumentProcessorServiceGrpc.getDisableProcessorMethod) == null) {
      synchronized (DocumentProcessorServiceGrpc.class) {
        if ((getDisableProcessorMethod = DocumentProcessorServiceGrpc.getDisableProcessorMethod) == null) {
          DocumentProcessorServiceGrpc.getDisableProcessorMethod = getDisableProcessorMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.documentai.v1beta3.DisableProcessorRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableProcessor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.documentai.v1beta3.DisableProcessorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DocumentProcessorServiceMethodDescriptorSupplier("DisableProcessor"))
              .build();
        }
      }
    }
    return getDisableProcessorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.ReviewDocumentRequest,
      com.google.longrunning.Operation> getReviewDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReviewDocument",
      requestType = com.google.cloud.documentai.v1beta3.ReviewDocumentRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.ReviewDocumentRequest,
      com.google.longrunning.Operation> getReviewDocumentMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.documentai.v1beta3.ReviewDocumentRequest, com.google.longrunning.Operation> getReviewDocumentMethod;
    if ((getReviewDocumentMethod = DocumentProcessorServiceGrpc.getReviewDocumentMethod) == null) {
      synchronized (DocumentProcessorServiceGrpc.class) {
        if ((getReviewDocumentMethod = DocumentProcessorServiceGrpc.getReviewDocumentMethod) == null) {
          DocumentProcessorServiceGrpc.getReviewDocumentMethod = getReviewDocumentMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.documentai.v1beta3.ReviewDocumentRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReviewDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.documentai.v1beta3.ReviewDocumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new DocumentProcessorServiceMethodDescriptorSupplier("ReviewDocument"))
              .build();
        }
      }
    }
    return getReviewDocumentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DocumentProcessorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DocumentProcessorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DocumentProcessorServiceStub>() {
        @java.lang.Override
        public DocumentProcessorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DocumentProcessorServiceStub(channel, callOptions);
        }
      };
    return DocumentProcessorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DocumentProcessorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DocumentProcessorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DocumentProcessorServiceBlockingStub>() {
        @java.lang.Override
        public DocumentProcessorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DocumentProcessorServiceBlockingStub(channel, callOptions);
        }
      };
    return DocumentProcessorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DocumentProcessorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DocumentProcessorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DocumentProcessorServiceFutureStub>() {
        @java.lang.Override
        public DocumentProcessorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DocumentProcessorServiceFutureStub(channel, callOptions);
        }
      };
    return DocumentProcessorServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to call Cloud DocumentAI to process documents according to the
   * processor's definition. Processors are built using state-of-the-art Google
   * AI such as natural language, computer vision, and translation to extract
   * structured information from unstructured or semi-structured documents.
   * </pre>
   */
  public static abstract class DocumentProcessorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Processes a single document.
     * </pre>
     */
    public void processDocument(com.google.cloud.documentai.v1beta3.ProcessRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.documentai.v1beta3.ProcessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProcessDocumentMethod(), responseObserver);
    }

    /**
     * <pre>
     * LRO endpoint to batch process many documents. The output is written
     * to Cloud Storage as JSON in the [Document] format.
     * </pre>
     */
    public void batchProcessDocuments(com.google.cloud.documentai.v1beta3.BatchProcessRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchProcessDocumentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fetches processor types.
     * </pre>
     */
    public void fetchProcessorTypes(com.google.cloud.documentai.v1beta3.FetchProcessorTypesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFetchProcessorTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all processors which belong to this project.
     * </pre>
     */
    public void listProcessors(com.google.cloud.documentai.v1beta3.ListProcessorsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.documentai.v1beta3.ListProcessorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProcessorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a processor from the type processor that the user chose.
     * The processor will be at "ENABLED" state by default after its creation.
     * </pre>
     */
    public void createProcessor(com.google.cloud.documentai.v1beta3.CreateProcessorRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.documentai.v1beta3.Processor> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProcessorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the processor, unloads all deployed model artifacts if it was
     * enabled and then deletes all artifacts associated with this processor.
     * </pre>
     */
    public void deleteProcessor(com.google.cloud.documentai.v1beta3.DeleteProcessorRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProcessorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enables a processor
     * </pre>
     */
    public void enableProcessor(com.google.cloud.documentai.v1beta3.EnableProcessorRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableProcessorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Disables a processor
     * </pre>
     */
    public void disableProcessor(com.google.cloud.documentai.v1beta3.DisableProcessorRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableProcessorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send a document for Human Review. The input document should be processed by
     * the specified processor.
     * </pre>
     */
    public void reviewDocument(com.google.cloud.documentai.v1beta3.ReviewDocumentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReviewDocumentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProcessDocumentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.documentai.v1beta3.ProcessRequest,
                com.google.cloud.documentai.v1beta3.ProcessResponse>(
                  this, METHODID_PROCESS_DOCUMENT)))
          .addMethod(
            getBatchProcessDocumentsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.documentai.v1beta3.BatchProcessRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_BATCH_PROCESS_DOCUMENTS)))
          .addMethod(
            getFetchProcessorTypesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.documentai.v1beta3.FetchProcessorTypesRequest,
                com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse>(
                  this, METHODID_FETCH_PROCESSOR_TYPES)))
          .addMethod(
            getListProcessorsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.documentai.v1beta3.ListProcessorsRequest,
                com.google.cloud.documentai.v1beta3.ListProcessorsResponse>(
                  this, METHODID_LIST_PROCESSORS)))
          .addMethod(
            getCreateProcessorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.documentai.v1beta3.CreateProcessorRequest,
                com.google.cloud.documentai.v1beta3.Processor>(
                  this, METHODID_CREATE_PROCESSOR)))
          .addMethod(
            getDeleteProcessorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.documentai.v1beta3.DeleteProcessorRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_DELETE_PROCESSOR)))
          .addMethod(
            getEnableProcessorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.documentai.v1beta3.EnableProcessorRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_ENABLE_PROCESSOR)))
          .addMethod(
            getDisableProcessorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.documentai.v1beta3.DisableProcessorRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_DISABLE_PROCESSOR)))
          .addMethod(
            getReviewDocumentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.documentai.v1beta3.ReviewDocumentRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_REVIEW_DOCUMENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to call Cloud DocumentAI to process documents according to the
   * processor's definition. Processors are built using state-of-the-art Google
   * AI such as natural language, computer vision, and translation to extract
   * structured information from unstructured or semi-structured documents.
   * </pre>
   */
  public static final class DocumentProcessorServiceStub extends io.grpc.stub.AbstractAsyncStub<DocumentProcessorServiceStub> {
    private DocumentProcessorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DocumentProcessorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DocumentProcessorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes a single document.
     * </pre>
     */
    public void processDocument(com.google.cloud.documentai.v1beta3.ProcessRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.documentai.v1beta3.ProcessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProcessDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LRO endpoint to batch process many documents. The output is written
     * to Cloud Storage as JSON in the [Document] format.
     * </pre>
     */
    public void batchProcessDocuments(com.google.cloud.documentai.v1beta3.BatchProcessRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchProcessDocumentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fetches processor types.
     * </pre>
     */
    public void fetchProcessorTypes(com.google.cloud.documentai.v1beta3.FetchProcessorTypesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchProcessorTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all processors which belong to this project.
     * </pre>
     */
    public void listProcessors(com.google.cloud.documentai.v1beta3.ListProcessorsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.documentai.v1beta3.ListProcessorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProcessorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a processor from the type processor that the user chose.
     * The processor will be at "ENABLED" state by default after its creation.
     * </pre>
     */
    public void createProcessor(com.google.cloud.documentai.v1beta3.CreateProcessorRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.documentai.v1beta3.Processor> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProcessorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the processor, unloads all deployed model artifacts if it was
     * enabled and then deletes all artifacts associated with this processor.
     * </pre>
     */
    public void deleteProcessor(com.google.cloud.documentai.v1beta3.DeleteProcessorRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProcessorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enables a processor
     * </pre>
     */
    public void enableProcessor(com.google.cloud.documentai.v1beta3.EnableProcessorRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableProcessorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Disables a processor
     * </pre>
     */
    public void disableProcessor(com.google.cloud.documentai.v1beta3.DisableProcessorRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableProcessorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send a document for Human Review. The input document should be processed by
     * the specified processor.
     * </pre>
     */
    public void reviewDocument(com.google.cloud.documentai.v1beta3.ReviewDocumentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReviewDocumentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to call Cloud DocumentAI to process documents according to the
   * processor's definition. Processors are built using state-of-the-art Google
   * AI such as natural language, computer vision, and translation to extract
   * structured information from unstructured or semi-structured documents.
   * </pre>
   */
  public static final class DocumentProcessorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DocumentProcessorServiceBlockingStub> {
    private DocumentProcessorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DocumentProcessorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DocumentProcessorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes a single document.
     * </pre>
     */
    public com.google.cloud.documentai.v1beta3.ProcessResponse processDocument(com.google.cloud.documentai.v1beta3.ProcessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProcessDocumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LRO endpoint to batch process many documents. The output is written
     * to Cloud Storage as JSON in the [Document] format.
     * </pre>
     */
    public com.google.longrunning.Operation batchProcessDocuments(com.google.cloud.documentai.v1beta3.BatchProcessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchProcessDocumentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetches processor types.
     * </pre>
     */
    public com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse fetchProcessorTypes(com.google.cloud.documentai.v1beta3.FetchProcessorTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchProcessorTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all processors which belong to this project.
     * </pre>
     */
    public com.google.cloud.documentai.v1beta3.ListProcessorsResponse listProcessors(com.google.cloud.documentai.v1beta3.ListProcessorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProcessorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a processor from the type processor that the user chose.
     * The processor will be at "ENABLED" state by default after its creation.
     * </pre>
     */
    public com.google.cloud.documentai.v1beta3.Processor createProcessor(com.google.cloud.documentai.v1beta3.CreateProcessorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProcessorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the processor, unloads all deployed model artifacts if it was
     * enabled and then deletes all artifacts associated with this processor.
     * </pre>
     */
    public com.google.longrunning.Operation deleteProcessor(com.google.cloud.documentai.v1beta3.DeleteProcessorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProcessorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enables a processor
     * </pre>
     */
    public com.google.longrunning.Operation enableProcessor(com.google.cloud.documentai.v1beta3.EnableProcessorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableProcessorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disables a processor
     * </pre>
     */
    public com.google.longrunning.Operation disableProcessor(com.google.cloud.documentai.v1beta3.DisableProcessorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableProcessorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send a document for Human Review. The input document should be processed by
     * the specified processor.
     * </pre>
     */
    public com.google.longrunning.Operation reviewDocument(com.google.cloud.documentai.v1beta3.ReviewDocumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReviewDocumentMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to call Cloud DocumentAI to process documents according to the
   * processor's definition. Processors are built using state-of-the-art Google
   * AI such as natural language, computer vision, and translation to extract
   * structured information from unstructured or semi-structured documents.
   * </pre>
   */
  public static final class DocumentProcessorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DocumentProcessorServiceFutureStub> {
    private DocumentProcessorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DocumentProcessorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DocumentProcessorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Processes a single document.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.documentai.v1beta3.ProcessResponse> processDocument(
        com.google.cloud.documentai.v1beta3.ProcessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProcessDocumentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LRO endpoint to batch process many documents. The output is written
     * to Cloud Storage as JSON in the [Document] format.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> batchProcessDocuments(
        com.google.cloud.documentai.v1beta3.BatchProcessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchProcessDocumentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fetches processor types.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse> fetchProcessorTypes(
        com.google.cloud.documentai.v1beta3.FetchProcessorTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchProcessorTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all processors which belong to this project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.documentai.v1beta3.ListProcessorsResponse> listProcessors(
        com.google.cloud.documentai.v1beta3.ListProcessorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProcessorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a processor from the type processor that the user chose.
     * The processor will be at "ENABLED" state by default after its creation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.documentai.v1beta3.Processor> createProcessor(
        com.google.cloud.documentai.v1beta3.CreateProcessorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProcessorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the processor, unloads all deployed model artifacts if it was
     * enabled and then deletes all artifacts associated with this processor.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> deleteProcessor(
        com.google.cloud.documentai.v1beta3.DeleteProcessorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProcessorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enables a processor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> enableProcessor(
        com.google.cloud.documentai.v1beta3.EnableProcessorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableProcessorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Disables a processor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> disableProcessor(
        com.google.cloud.documentai.v1beta3.DisableProcessorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableProcessorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send a document for Human Review. The input document should be processed by
     * the specified processor.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> reviewDocument(
        com.google.cloud.documentai.v1beta3.ReviewDocumentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReviewDocumentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROCESS_DOCUMENT = 0;
  private static final int METHODID_BATCH_PROCESS_DOCUMENTS = 1;
  private static final int METHODID_FETCH_PROCESSOR_TYPES = 2;
  private static final int METHODID_LIST_PROCESSORS = 3;
  private static final int METHODID_CREATE_PROCESSOR = 4;
  private static final int METHODID_DELETE_PROCESSOR = 5;
  private static final int METHODID_ENABLE_PROCESSOR = 6;
  private static final int METHODID_DISABLE_PROCESSOR = 7;
  private static final int METHODID_REVIEW_DOCUMENT = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DocumentProcessorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DocumentProcessorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROCESS_DOCUMENT:
          serviceImpl.processDocument((com.google.cloud.documentai.v1beta3.ProcessRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.documentai.v1beta3.ProcessResponse>) responseObserver);
          break;
        case METHODID_BATCH_PROCESS_DOCUMENTS:
          serviceImpl.batchProcessDocuments((com.google.cloud.documentai.v1beta3.BatchProcessRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_FETCH_PROCESSOR_TYPES:
          serviceImpl.fetchProcessorTypes((com.google.cloud.documentai.v1beta3.FetchProcessorTypesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse>) responseObserver);
          break;
        case METHODID_LIST_PROCESSORS:
          serviceImpl.listProcessors((com.google.cloud.documentai.v1beta3.ListProcessorsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.documentai.v1beta3.ListProcessorsResponse>) responseObserver);
          break;
        case METHODID_CREATE_PROCESSOR:
          serviceImpl.createProcessor((com.google.cloud.documentai.v1beta3.CreateProcessorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.documentai.v1beta3.Processor>) responseObserver);
          break;
        case METHODID_DELETE_PROCESSOR:
          serviceImpl.deleteProcessor((com.google.cloud.documentai.v1beta3.DeleteProcessorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_ENABLE_PROCESSOR:
          serviceImpl.enableProcessor((com.google.cloud.documentai.v1beta3.EnableProcessorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DISABLE_PROCESSOR:
          serviceImpl.disableProcessor((com.google.cloud.documentai.v1beta3.DisableProcessorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_REVIEW_DOCUMENT:
          serviceImpl.reviewDocument((com.google.cloud.documentai.v1beta3.ReviewDocumentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
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

  private static abstract class DocumentProcessorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DocumentProcessorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DocumentProcessorService");
    }
  }

  private static final class DocumentProcessorServiceFileDescriptorSupplier
      extends DocumentProcessorServiceBaseDescriptorSupplier {
    DocumentProcessorServiceFileDescriptorSupplier() {}
  }

  private static final class DocumentProcessorServiceMethodDescriptorSupplier
      extends DocumentProcessorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DocumentProcessorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DocumentProcessorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DocumentProcessorServiceFileDescriptorSupplier())
              .addMethod(getProcessDocumentMethod())
              .addMethod(getBatchProcessDocumentsMethod())
              .addMethod(getFetchProcessorTypesMethod())
              .addMethod(getListProcessorsMethod())
              .addMethod(getCreateProcessorMethod())
              .addMethod(getDeleteProcessorMethod())
              .addMethod(getEnableProcessorMethod())
              .addMethod(getDisableProcessorMethod())
              .addMethod(getReviewDocumentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
