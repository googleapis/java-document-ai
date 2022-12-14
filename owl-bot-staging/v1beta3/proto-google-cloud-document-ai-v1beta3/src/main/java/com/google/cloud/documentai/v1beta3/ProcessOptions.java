// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/document_processor_service.proto

package com.google.cloud.documentai.v1beta3;

/**
 * <pre>
 * Options for Process API
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1beta3.ProcessOptions}
 */
public final class ProcessOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1beta3.ProcessOptions)
    ProcessOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProcessOptions.newBuilder() to construct.
  private ProcessOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProcessOptions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProcessOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1beta3_ProcessOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1beta3_ProcessOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1beta3.ProcessOptions.class, com.google.cloud.documentai.v1beta3.ProcessOptions.Builder.class);
  }

  public static final int OCR_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.documentai.v1beta3.OcrConfig ocrConfig_;
  /**
   * <pre>
   * Only applicable to "Document OCR Processor". Returns error if set on other
   * processor types.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.OcrConfig ocr_config = 1;</code>
   * @return Whether the ocrConfig field is set.
   */
  @java.lang.Override
  public boolean hasOcrConfig() {
    return ocrConfig_ != null;
  }
  /**
   * <pre>
   * Only applicable to "Document OCR Processor". Returns error if set on other
   * processor types.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.OcrConfig ocr_config = 1;</code>
   * @return The ocrConfig.
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.OcrConfig getOcrConfig() {
    return ocrConfig_ == null ? com.google.cloud.documentai.v1beta3.OcrConfig.getDefaultInstance() : ocrConfig_;
  }
  /**
   * <pre>
   * Only applicable to "Document OCR Processor". Returns error if set on other
   * processor types.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.OcrConfig ocr_config = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.OcrConfigOrBuilder getOcrConfigOrBuilder() {
    return getOcrConfig();
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
    if (ocrConfig_ != null) {
      output.writeMessage(1, getOcrConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ocrConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOcrConfig());
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
    if (!(obj instanceof com.google.cloud.documentai.v1beta3.ProcessOptions)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1beta3.ProcessOptions other = (com.google.cloud.documentai.v1beta3.ProcessOptions) obj;

    if (hasOcrConfig() != other.hasOcrConfig()) return false;
    if (hasOcrConfig()) {
      if (!getOcrConfig()
          .equals(other.getOcrConfig())) return false;
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
    if (hasOcrConfig()) {
      hash = (37 * hash) + OCR_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getOcrConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1beta3.ProcessOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta3.ProcessOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.ProcessOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta3.ProcessOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.ProcessOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.documentai.v1beta3.ProcessOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.ProcessOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta3.ProcessOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.ProcessOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta3.ProcessOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.documentai.v1beta3.ProcessOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.documentai.v1beta3.ProcessOptions parseFrom(
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
  public static Builder newBuilder(com.google.cloud.documentai.v1beta3.ProcessOptions prototype) {
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
   * Options for Process API
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1beta3.ProcessOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1beta3.ProcessOptions)
      com.google.cloud.documentai.v1beta3.ProcessOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1beta3_ProcessOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1beta3_ProcessOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1beta3.ProcessOptions.class, com.google.cloud.documentai.v1beta3.ProcessOptions.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1beta3.ProcessOptions.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ocrConfigBuilder_ == null) {
        ocrConfig_ = null;
      } else {
        ocrConfig_ = null;
        ocrConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService.internal_static_google_cloud_documentai_v1beta3_ProcessOptions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.ProcessOptions getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1beta3.ProcessOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.ProcessOptions build() {
      com.google.cloud.documentai.v1beta3.ProcessOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.ProcessOptions buildPartial() {
      com.google.cloud.documentai.v1beta3.ProcessOptions result = new com.google.cloud.documentai.v1beta3.ProcessOptions(this);
      if (ocrConfigBuilder_ == null) {
        result.ocrConfig_ = ocrConfig_;
      } else {
        result.ocrConfig_ = ocrConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.documentai.v1beta3.ProcessOptions) {
        return mergeFrom((com.google.cloud.documentai.v1beta3.ProcessOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1beta3.ProcessOptions other) {
      if (other == com.google.cloud.documentai.v1beta3.ProcessOptions.getDefaultInstance()) return this;
      if (other.hasOcrConfig()) {
        mergeOcrConfig(other.getOcrConfig());
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
              input.readMessage(
                  getOcrConfigFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
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

    private com.google.cloud.documentai.v1beta3.OcrConfig ocrConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.documentai.v1beta3.OcrConfig, com.google.cloud.documentai.v1beta3.OcrConfig.Builder, com.google.cloud.documentai.v1beta3.OcrConfigOrBuilder> ocrConfigBuilder_;
    /**
     * <pre>
     * Only applicable to "Document OCR Processor". Returns error if set on other
     * processor types.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.OcrConfig ocr_config = 1;</code>
     * @return Whether the ocrConfig field is set.
     */
    public boolean hasOcrConfig() {
      return ocrConfigBuilder_ != null || ocrConfig_ != null;
    }
    /**
     * <pre>
     * Only applicable to "Document OCR Processor". Returns error if set on other
     * processor types.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.OcrConfig ocr_config = 1;</code>
     * @return The ocrConfig.
     */
    public com.google.cloud.documentai.v1beta3.OcrConfig getOcrConfig() {
      if (ocrConfigBuilder_ == null) {
        return ocrConfig_ == null ? com.google.cloud.documentai.v1beta3.OcrConfig.getDefaultInstance() : ocrConfig_;
      } else {
        return ocrConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Only applicable to "Document OCR Processor". Returns error if set on other
     * processor types.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.OcrConfig ocr_config = 1;</code>
     */
    public Builder setOcrConfig(com.google.cloud.documentai.v1beta3.OcrConfig value) {
      if (ocrConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ocrConfig_ = value;
        onChanged();
      } else {
        ocrConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Only applicable to "Document OCR Processor". Returns error if set on other
     * processor types.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.OcrConfig ocr_config = 1;</code>
     */
    public Builder setOcrConfig(
        com.google.cloud.documentai.v1beta3.OcrConfig.Builder builderForValue) {
      if (ocrConfigBuilder_ == null) {
        ocrConfig_ = builderForValue.build();
        onChanged();
      } else {
        ocrConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Only applicable to "Document OCR Processor". Returns error if set on other
     * processor types.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.OcrConfig ocr_config = 1;</code>
     */
    public Builder mergeOcrConfig(com.google.cloud.documentai.v1beta3.OcrConfig value) {
      if (ocrConfigBuilder_ == null) {
        if (ocrConfig_ != null) {
          ocrConfig_ =
            com.google.cloud.documentai.v1beta3.OcrConfig.newBuilder(ocrConfig_).mergeFrom(value).buildPartial();
        } else {
          ocrConfig_ = value;
        }
        onChanged();
      } else {
        ocrConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Only applicable to "Document OCR Processor". Returns error if set on other
     * processor types.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.OcrConfig ocr_config = 1;</code>
     */
    public Builder clearOcrConfig() {
      if (ocrConfigBuilder_ == null) {
        ocrConfig_ = null;
        onChanged();
      } else {
        ocrConfig_ = null;
        ocrConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Only applicable to "Document OCR Processor". Returns error if set on other
     * processor types.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.OcrConfig ocr_config = 1;</code>
     */
    public com.google.cloud.documentai.v1beta3.OcrConfig.Builder getOcrConfigBuilder() {
      
      onChanged();
      return getOcrConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Only applicable to "Document OCR Processor". Returns error if set on other
     * processor types.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.OcrConfig ocr_config = 1;</code>
     */
    public com.google.cloud.documentai.v1beta3.OcrConfigOrBuilder getOcrConfigOrBuilder() {
      if (ocrConfigBuilder_ != null) {
        return ocrConfigBuilder_.getMessageOrBuilder();
      } else {
        return ocrConfig_ == null ?
            com.google.cloud.documentai.v1beta3.OcrConfig.getDefaultInstance() : ocrConfig_;
      }
    }
    /**
     * <pre>
     * Only applicable to "Document OCR Processor". Returns error if set on other
     * processor types.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.OcrConfig ocr_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.documentai.v1beta3.OcrConfig, com.google.cloud.documentai.v1beta3.OcrConfig.Builder, com.google.cloud.documentai.v1beta3.OcrConfigOrBuilder> 
        getOcrConfigFieldBuilder() {
      if (ocrConfigBuilder_ == null) {
        ocrConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta3.OcrConfig, com.google.cloud.documentai.v1beta3.OcrConfig.Builder, com.google.cloud.documentai.v1beta3.OcrConfigOrBuilder>(
                getOcrConfig(),
                getParentForChildren(),
                isClean());
        ocrConfig_ = null;
      }
      return ocrConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1beta3.ProcessOptions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta3.ProcessOptions)
  private static final com.google.cloud.documentai.v1beta3.ProcessOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1beta3.ProcessOptions();
  }

  public static com.google.cloud.documentai.v1beta3.ProcessOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProcessOptions>
      PARSER = new com.google.protobuf.AbstractParser<ProcessOptions>() {
    @java.lang.Override
    public ProcessOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProcessOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProcessOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.ProcessOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

