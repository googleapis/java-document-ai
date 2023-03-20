// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/processor.proto

package com.google.cloud.documentai.v1beta3;

public final class DocumentAiProcessor {
  private DocumentAiProcessor() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_DeprecationInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_DeprecationInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_Processor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Processor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/documentai/v1beta3/proces" +
      "sor.proto\022\037google.cloud.documentai.v1bet" +
      "a3\032\037google/api/field_behavior.proto\032\031goo" +
      "gle/api/resource.proto\0325google/cloud/doc" +
      "umentai/v1beta3/document_schema.proto\0320g" +
      "oogle/cloud/documentai/v1beta3/evaluatio" +
      "n.proto\032\037google/protobuf/timestamp.proto" +
      "\"\265\007\n\020ProcessorVersion\022\014\n\004name\030\001 \001(\t\022\024\n\014d" +
      "isplay_name\030\002 \001(\t\022H\n\017document_schema\030\014 \001" +
      "(\0132/.google.cloud.documentai.v1beta3.Doc" +
      "umentSchema\022F\n\005state\030\006 \001(\01627.google.clou" +
      "d.documentai.v1beta3.ProcessorVersion.St" +
      "ate\022/\n\013create_time\030\007 \001(\0132\032.google.protob" +
      "uf.Timestamp\022O\n\021latest_evaluation\030\010 \001(\0132" +
      "4.google.cloud.documentai.v1beta3.Evalua" +
      "tionReference\022\024\n\014kms_key_name\030\t \001(\t\022\034\n\024k" +
      "ms_key_version_name\030\n \001(\t\022\026\n\016google_mana" +
      "ged\030\013 \001(\010\022[\n\020deprecation_info\030\r \001(\0132A.go" +
      "ogle.cloud.documentai.v1beta3.ProcessorV" +
      "ersion.DeprecationInfo\032\237\001\n\017DeprecationIn" +
      "fo\0224\n\020deprecation_time\030\001 \001(\0132\032.google.pr" +
      "otobuf.Timestamp\022V\n\035replacement_processo" +
      "r_version\030\002 \001(\tB/\372A,\n*documentai.googlea" +
      "pis.com/ProcessorVersion\"\204\001\n\005State\022\025\n\021ST" +
      "ATE_UNSPECIFIED\020\000\022\014\n\010DEPLOYED\020\001\022\r\n\tDEPLO" +
      "YING\020\002\022\016\n\nUNDEPLOYED\020\003\022\017\n\013UNDEPLOYING\020\004\022" +
      "\014\n\010CREATING\020\005\022\014\n\010DELETING\020\006\022\n\n\006FAILED\020\007:" +
      "\226\001\352A\222\001\n*documentai.googleapis.com/Proces" +
      "sorVersion\022dprojects/{project}/locations" +
      "/{location}/processors/{processor}/proce" +
      "ssorVersions/{processor_version}\"\262\004\n\tPro" +
      "cessor\022\024\n\004name\030\001 \001(\tB\006\340A\005\340A\003\022\014\n\004type\030\002 \001" +
      "(\t\022\024\n\014display_name\030\003 \001(\t\022D\n\005state\030\004 \001(\0162" +
      "0.google.cloud.documentai.v1beta3.Proces" +
      "sor.StateB\003\340A\003\022R\n\031default_processor_vers" +
      "ion\030\t \001(\tB/\372A,\n*documentai.googleapis.co" +
      "m/ProcessorVersion\022 \n\020process_endpoint\030\006" +
      " \001(\tB\006\340A\003\340A\005\022/\n\013create_time\030\007 \001(\0132\032.goog" +
      "le.protobuf.Timestamp\022\024\n\014kms_key_name\030\010 " +
      "\001(\t\"~\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007E" +
      "NABLED\020\001\022\014\n\010DISABLED\020\002\022\014\n\010ENABLING\020\003\022\r\n\t" +
      "DISABLING\020\004\022\014\n\010CREATING\020\005\022\n\n\006FAILED\020\006\022\014\n" +
      "\010DELETING\020\007:h\352Ae\n#documentai.googleapis." +
      "com/Processor\022>projects/{project}/locati" +
      "ons/{location}/processors/{processor}B\352\001" +
      "\n#com.google.cloud.documentai.v1beta3B\023D" +
      "ocumentAiProcessorP\001ZCcloud.google.com/g" +
      "o/documentai/apiv1beta3/documentaipb;doc" +
      "umentaipb\252\002\037Google.Cloud.DocumentAI.V1Be" +
      "ta3\312\002\037Google\\Cloud\\DocumentAI\\V1beta3\352\002\"" +
      "Google::Cloud::DocumentAI::V1beta3b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.documentai.v1beta3.DocumentAiDocumentSchema.getDescriptor(),
          com.google.cloud.documentai.v1beta3.DocumentAiEvaluation.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "DocumentSchema", "State", "CreateTime", "LatestEvaluation", "KmsKeyName", "KmsKeyVersionName", "GoogleManaged", "DeprecationInfo", });
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_DeprecationInfo_descriptor =
      internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_DeprecationInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_ProcessorVersion_DeprecationInfo_descriptor,
        new java.lang.String[] { "DeprecationTime", "ReplacementProcessorVersion", });
    internal_static_google_cloud_documentai_v1beta3_Processor_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_documentai_v1beta3_Processor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_Processor_descriptor,
        new java.lang.String[] { "Name", "Type", "DisplayName", "State", "DefaultProcessorVersion", "ProcessEndpoint", "CreateTime", "KmsKeyName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.documentai.v1beta3.DocumentAiDocumentSchema.getDescriptor();
    com.google.cloud.documentai.v1beta3.DocumentAiEvaluation.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
