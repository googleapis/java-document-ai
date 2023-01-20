// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/processor_type.proto

package com.google.cloud.documentai.v1beta3;

public final class DocumentAiProcessorType {
  private DocumentAiProcessorType() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_ProcessorType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_ProcessorType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_ProcessorType_LocationInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_ProcessorType_LocationInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/documentai/v1beta3/proces" +
      "sor_type.proto\022\037google.cloud.documentai." +
      "v1beta3\032\035google/api/launch_stage.proto\032\031" +
      "google/api/resource.proto\"\230\003\n\rProcessorT" +
      "ype\022\014\n\004name\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\022\020\n\010categ" +
      "ory\030\003 \001(\t\022X\n\023available_locations\030\004 \003(\0132;" +
      ".google.cloud.documentai.v1beta3.Process" +
      "orType.LocationInfo\022\026\n\016allow_creation\030\006 " +
      "\001(\010\022-\n\014launch_stage\030\010 \001(\0162\027.google.api.L" +
      "aunchStage\022\034\n\024sample_document_uris\030\t \003(\t" +
      "\032#\n\014LocationInfo\022\023\n\013location_id\030\001 \001(\t:u\352" +
      "Ar\n\'documentai.googleapis.com/ProcessorT" +
      "ype\022Gprojects/{project}/locations/{locat" +
      "ion}/processorTypes/{processor_type}B\364\001\n" +
      "#com.google.cloud.documentai.v1beta3B\027Do" +
      "cumentAiProcessorTypeP\001ZIgoogle.golang.o" +
      "rg/genproto/googleapis/cloud/documentai/" +
      "v1beta3;documentai\252\002\037Google.Cloud.Docume" +
      "ntAI.V1Beta3\312\002\037Google\\Cloud\\DocumentAI\\V" +
      "1beta3\352\002\"Google::Cloud::DocumentAI::V1be" +
      "ta3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.LaunchStageProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_cloud_documentai_v1beta3_ProcessorType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_ProcessorType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_ProcessorType_descriptor,
        new java.lang.String[] { "Name", "Type", "Category", "AvailableLocations", "AllowCreation", "LaunchStage", "SampleDocumentUris", });
    internal_static_google_cloud_documentai_v1beta3_ProcessorType_LocationInfo_descriptor =
      internal_static_google_cloud_documentai_v1beta3_ProcessorType_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_ProcessorType_LocationInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_ProcessorType_LocationInfo_descriptor,
        new java.lang.String[] { "LocationId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.LaunchStageProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
