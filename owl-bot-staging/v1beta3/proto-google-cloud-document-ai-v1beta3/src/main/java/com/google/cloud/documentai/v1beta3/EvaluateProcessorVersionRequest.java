// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/document_processor_service.proto

package com.google.cloud.documentai.v1beta3;

/**
 * <pre>
 * Evaluates the given ProcessorVersion against the supplied documents.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest}
 */
public final class EvaluateProcessorVersionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest)
    EvaluateProcessorVersionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EvaluateProcessorVersionRequest.newBuilder() to construct.
  private EvaluateProcessorVersionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EvaluateProcessorVersionRequest() {
    processorVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EvaluateProcessorVersionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1beta3_EvaluateProcessorVersionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1beta3_EvaluateProcessorVersionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest.class, com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest.Builder.class);
  }

  public static final int PROCESSOR_VERSION_FIELD_NUMBER = 1;
  private volatile java.lang.Object processorVersion_;
  /**
   * <pre>
   * Required. The resource name of the [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion] to evaluate.
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>string processor_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The processorVersion.
   */
  @java.lang.Override
  public java.lang.String getProcessorVersion() {
    java.lang.Object ref = processorVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      processorVersion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion] to evaluate.
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>string processor_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for processorVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProcessorVersionBytes() {
    java.lang.Object ref = processorVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      processorVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVALUATION_DOCUMENTS_FIELD_NUMBER = 3;
  private com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig evaluationDocuments_;
  /**
   * <pre>
   * Optional. The documents used in the evaluation. If unspecified, use the processor's
   * dataset as evaluation input.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the evaluationDocuments field is set.
   */
  @java.lang.Override
  public boolean hasEvaluationDocuments() {
    return evaluationDocuments_ != null;
  }
  /**
   * <pre>
   * Optional. The documents used in the evaluation. If unspecified, use the processor's
   * dataset as evaluation input.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The evaluationDocuments.
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig getEvaluationDocuments() {
    return evaluationDocuments_ == null ? com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig.getDefaultInstance() : evaluationDocuments_;
  }
  /**
   * <pre>
   * Optional. The documents used in the evaluation. If unspecified, use the processor's
   * dataset as evaluation input.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfigOrBuilder getEvaluationDocumentsOrBuilder() {
    return getEvaluationDocuments();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(processorVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, processorVersion_);
    }
    if (evaluationDocuments_ != null) {
      output.writeMessage(3, getEvaluationDocuments());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(processorVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, processorVersion_);
    }
    if (evaluationDocuments_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getEvaluationDocuments());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest other = (com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest) obj;

    if (!getProcessorVersion()
        .equals(other.getProcessorVersion())) return false;
    if (hasEvaluationDocuments() != other.hasEvaluationDocuments()) return false;
    if (hasEvaluationDocuments()) {
      if (!getEvaluationDocuments()
          .equals(other.getEvaluationDocuments())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROCESSOR_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getProcessorVersion().hashCode();
    if (hasEvaluationDocuments()) {
      hash = (37 * hash) + EVALUATION_DOCUMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEvaluationDocuments().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Evaluates the given ProcessorVersion against the supplied documents.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest)
      com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1beta3_EvaluateProcessorVersionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1beta3_EvaluateProcessorVersionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest.class, com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      processorVersion_ = "";

      if (evaluationDocumentsBuilder_ == null) {
        evaluationDocuments_ = null;
      } else {
        evaluationDocuments_ = null;
        evaluationDocumentsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1beta3_EvaluateProcessorVersionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest build() {
      com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest buildPartial() {
      com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest result = new com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest(this);
      result.processorVersion_ = processorVersion_;
      if (evaluationDocumentsBuilder_ == null) {
        result.evaluationDocuments_ = evaluationDocuments_;
      } else {
        result.evaluationDocuments_ = evaluationDocumentsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest) {
        return mergeFrom((com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest other) {
      if (other == com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest.getDefaultInstance()) return this;
      if (!other.getProcessorVersion().isEmpty()) {
        processorVersion_ = other.processorVersion_;
        onChanged();
      }
      if (other.hasEvaluationDocuments()) {
        mergeEvaluationDocuments(other.getEvaluationDocuments());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              processorVersion_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 26: {
              input.readMessage(
                  getEvaluationDocumentsFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object processorVersion_ = "";
    /**
     * <pre>
     * Required. The resource name of the [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion] to evaluate.
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
     * </pre>
     *
     * <code>string processor_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The processorVersion.
     */
    public java.lang.String getProcessorVersion() {
      java.lang.Object ref = processorVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        processorVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion] to evaluate.
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
     * </pre>
     *
     * <code>string processor_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for processorVersion.
     */
    public com.google.protobuf.ByteString
        getProcessorVersionBytes() {
      java.lang.Object ref = processorVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        processorVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion] to evaluate.
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
     * </pre>
     *
     * <code>string processor_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The processorVersion to set.
     * @return This builder for chaining.
     */
    public Builder setProcessorVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      processorVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion] to evaluate.
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
     * </pre>
     *
     * <code>string processor_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearProcessorVersion() {
      
      processorVersion_ = getDefaultInstance().getProcessorVersion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion] to evaluate.
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
     * </pre>
     *
     * <code>string processor_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for processorVersion to set.
     * @return This builder for chaining.
     */
    public Builder setProcessorVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      processorVersion_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig evaluationDocuments_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig, com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig.Builder, com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfigOrBuilder> evaluationDocumentsBuilder_;
    /**
     * <pre>
     * Optional. The documents used in the evaluation. If unspecified, use the processor's
     * dataset as evaluation input.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the evaluationDocuments field is set.
     */
    public boolean hasEvaluationDocuments() {
      return evaluationDocumentsBuilder_ != null || evaluationDocuments_ != null;
    }
    /**
     * <pre>
     * Optional. The documents used in the evaluation. If unspecified, use the processor's
     * dataset as evaluation input.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The evaluationDocuments.
     */
    public com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig getEvaluationDocuments() {
      if (evaluationDocumentsBuilder_ == null) {
        return evaluationDocuments_ == null ? com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig.getDefaultInstance() : evaluationDocuments_;
      } else {
        return evaluationDocumentsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. The documents used in the evaluation. If unspecified, use the processor's
     * dataset as evaluation input.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setEvaluationDocuments(com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig value) {
      if (evaluationDocumentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        evaluationDocuments_ = value;
        onChanged();
      } else {
        evaluationDocumentsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional. The documents used in the evaluation. If unspecified, use the processor's
     * dataset as evaluation input.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setEvaluationDocuments(
        com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig.Builder builderForValue) {
      if (evaluationDocumentsBuilder_ == null) {
        evaluationDocuments_ = builderForValue.build();
        onChanged();
      } else {
        evaluationDocumentsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Optional. The documents used in the evaluation. If unspecified, use the processor's
     * dataset as evaluation input.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeEvaluationDocuments(com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig value) {
      if (evaluationDocumentsBuilder_ == null) {
        if (evaluationDocuments_ != null) {
          evaluationDocuments_ =
            com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig.newBuilder(evaluationDocuments_).mergeFrom(value).buildPartial();
        } else {
          evaluationDocuments_ = value;
        }
        onChanged();
      } else {
        evaluationDocumentsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional. The documents used in the evaluation. If unspecified, use the processor's
     * dataset as evaluation input.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearEvaluationDocuments() {
      if (evaluationDocumentsBuilder_ == null) {
        evaluationDocuments_ = null;
        onChanged();
      } else {
        evaluationDocuments_ = null;
        evaluationDocumentsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Optional. The documents used in the evaluation. If unspecified, use the processor's
     * dataset as evaluation input.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig.Builder getEvaluationDocumentsBuilder() {
      
      onChanged();
      return getEvaluationDocumentsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. The documents used in the evaluation. If unspecified, use the processor's
     * dataset as evaluation input.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfigOrBuilder getEvaluationDocumentsOrBuilder() {
      if (evaluationDocumentsBuilder_ != null) {
        return evaluationDocumentsBuilder_.getMessageOrBuilder();
      } else {
        return evaluationDocuments_ == null ?
            com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig.getDefaultInstance() : evaluationDocuments_;
      }
    }
    /**
     * <pre>
     * Optional. The documents used in the evaluation. If unspecified, use the processor's
     * dataset as evaluation input.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig, com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig.Builder, com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfigOrBuilder> 
        getEvaluationDocumentsFieldBuilder() {
      if (evaluationDocumentsBuilder_ == null) {
        evaluationDocumentsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig, com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig.Builder, com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfigOrBuilder>(
                getEvaluationDocuments(),
                getParentForChildren(),
                isClean());
        evaluationDocuments_ = null;
      }
      return evaluationDocumentsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest)
  private static final com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest();
  }

  public static com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EvaluateProcessorVersionRequest>
      PARSER = new com.google.protobuf.AbstractParser<EvaluateProcessorVersionRequest>() {
    @java.lang.Override
    public EvaluateProcessorVersionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<EvaluateProcessorVersionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EvaluateProcessorVersionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

