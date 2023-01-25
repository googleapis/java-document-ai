// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/document_io.proto

package com.google.cloud.documentai.v1beta3;

public final class DocumentIoProto {
  private DocumentIoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_RawDocument_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_RawDocument_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_GcsDocument_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_GcsDocument_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_GcsDocuments_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_GcsDocuments_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_GcsPrefix_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_GcsPrefix_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_BatchDocumentsInputConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_BatchDocumentsInputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_GcsOutputConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_GcsOutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_GcsOutputConfig_ShardingConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_GcsOutputConfig_ShardingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_OcrConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_OcrConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/documentai/v1beta3/docume" +
      "nt_io.proto\022\037google.cloud.documentai.v1b" +
      "eta3\032 google/protobuf/field_mask.proto\"1" +
      "\n\013RawDocument\022\017\n\007content\030\001 \001(\014\022\021\n\tmime_t" +
      "ype\030\002 \001(\t\"1\n\013GcsDocument\022\017\n\007gcs_uri\030\001 \001(" +
      "\t\022\021\n\tmime_type\030\002 \001(\t\"O\n\014GcsDocuments\022?\n\t" +
      "documents\030\001 \003(\0132,.google.cloud.documenta" +
      "i.v1beta3.GcsDocument\"#\n\tGcsPrefix\022\026\n\016gc" +
      "s_uri_prefix\030\001 \001(\t\"\257\001\n\031BatchDocumentsInp" +
      "utConfig\022@\n\ngcs_prefix\030\001 \001(\0132*.google.cl" +
      "oud.documentai.v1beta3.GcsPrefixH\000\022F\n\rgc" +
      "s_documents\030\002 \001(\0132-.google.cloud.documen" +
      "tai.v1beta3.GcsDocumentsH\000B\010\n\006source\"\217\003\n" +
      "\024DocumentOutputConfig\022b\n\021gcs_output_conf" +
      "ig\030\001 \001(\0132E.google.cloud.documentai.v1bet" +
      "a3.DocumentOutputConfig.GcsOutputConfigH" +
      "\000\032\203\002\n\017GcsOutputConfig\022\017\n\007gcs_uri\030\001 \001(\t\022." +
      "\n\nfield_mask\030\002 \001(\0132\032.google.protobuf.Fie" +
      "ldMask\022m\n\017sharding_config\030\003 \001(\0132T.google" +
      ".cloud.documentai.v1beta3.DocumentOutput" +
      "Config.GcsOutputConfig.ShardingConfig\032@\n" +
      "\016ShardingConfig\022\027\n\017pages_per_shard\030\001 \001(\005" +
      "\022\025\n\rpages_overlap\030\002 \001(\005B\r\n\013destination\"L" +
      "\n\tOcrConfig\022!\n\031enable_native_pdf_parsing" +
      "\030\003 \001(\010\022\034\n\024advanced_ocr_options\030\005 \003(\tB\354\001\n" +
      "#com.google.cloud.documentai.v1beta3B\017Do" +
      "cumentIoProtoP\001ZIgoogle.golang.org/genpr" +
      "oto/googleapis/cloud/documentai/v1beta3;" +
      "documentai\252\002\037Google.Cloud.DocumentAI.V1B" +
      "eta3\312\002\037Google\\Cloud\\DocumentAI\\V1beta3\352\002" +
      "\"Google::Cloud::DocumentAI::V1beta3b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_documentai_v1beta3_RawDocument_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_RawDocument_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_RawDocument_descriptor,
        new java.lang.String[] { "Content", "MimeType", });
    internal_static_google_cloud_documentai_v1beta3_GcsDocument_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_documentai_v1beta3_GcsDocument_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_GcsDocument_descriptor,
        new java.lang.String[] { "GcsUri", "MimeType", });
    internal_static_google_cloud_documentai_v1beta3_GcsDocuments_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_documentai_v1beta3_GcsDocuments_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_GcsDocuments_descriptor,
        new java.lang.String[] { "Documents", });
    internal_static_google_cloud_documentai_v1beta3_GcsPrefix_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_documentai_v1beta3_GcsPrefix_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_GcsPrefix_descriptor,
        new java.lang.String[] { "GcsUriPrefix", });
    internal_static_google_cloud_documentai_v1beta3_BatchDocumentsInputConfig_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_documentai_v1beta3_BatchDocumentsInputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_BatchDocumentsInputConfig_descriptor,
        new java.lang.String[] { "GcsPrefix", "GcsDocuments", "Source", });
    internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_descriptor,
        new java.lang.String[] { "GcsOutputConfig", "Destination", });
    internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_GcsOutputConfig_descriptor =
      internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_GcsOutputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_GcsOutputConfig_descriptor,
        new java.lang.String[] { "GcsUri", "FieldMask", "ShardingConfig", });
    internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_GcsOutputConfig_ShardingConfig_descriptor =
      internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_GcsOutputConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_GcsOutputConfig_ShardingConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_GcsOutputConfig_ShardingConfig_descriptor,
        new java.lang.String[] { "PagesPerShard", "PagesOverlap", });
    internal_static_google_cloud_documentai_v1beta3_OcrConfig_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_documentai_v1beta3_OcrConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_OcrConfig_descriptor,
        new java.lang.String[] { "EnableNativePdfParsing", "AdvancedOcrOptions", });
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
