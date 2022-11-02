/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/document_io.proto

package com.google.cloud.documentai.v1beta3;

public final class DocumentIoProto {
  private DocumentIoProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_RawDocument_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_RawDocument_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_GcsDocument_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_GcsDocument_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_GcsDocuments_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_GcsDocuments_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_GcsPrefix_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_GcsPrefix_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_BatchDocumentsInputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_BatchDocumentsInputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_GcsOutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_GcsOutputConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/documentai/v1beta3/docume"
          + "nt_io.proto\022\037google.cloud.documentai.v1b"
          + "eta3\"1\n\013RawDocument\022\017\n\007content\030\001 \001(\014\022\021\n\t"
          + "mime_type\030\002 \001(\t\"1\n\013GcsDocument\022\017\n\007gcs_ur"
          + "i\030\001 \001(\t\022\021\n\tmime_type\030\002 \001(\t\"O\n\014GcsDocumen"
          + "ts\022?\n\tdocuments\030\001 \003(\0132,.google.cloud.doc"
          + "umentai.v1beta3.GcsDocument\"#\n\tGcsPrefix"
          + "\022\026\n\016gcs_uri_prefix\030\001 \001(\t\"\257\001\n\031BatchDocume"
          + "ntsInputConfig\022@\n\ngcs_prefix\030\001 \001(\0132*.goo"
          + "gle.cloud.documentai.v1beta3.GcsPrefixH\000"
          + "\022F\n\rgcs_documents\030\002 \001(\0132-.google.cloud.d"
          + "ocumentai.v1beta3.GcsDocumentsH\000B\010\n\006sour"
          + "ce\"\255\001\n\024DocumentOutputConfig\022b\n\021gcs_outpu"
          + "t_config\030\001 \001(\0132E.google.cloud.documentai"
          + ".v1beta3.DocumentOutputConfig.GcsOutputC"
          + "onfigH\000\032\"\n\017GcsOutputConfig\022\017\n\007gcs_uri\030\001 "
          + "\001(\tB\r\n\013destinationB\354\001\n#com.google.cloud."
          + "documentai.v1beta3B\017DocumentIoProtoP\001ZIg"
          + "oogle.golang.org/genproto/googleapis/clo"
          + "ud/documentai/v1beta3;documentai\252\002\037Googl"
          + "e.Cloud.DocumentAI.V1Beta3\312\002\037Google\\Clou"
          + "d\\DocumentAI\\V1beta3\352\002\"Google::Cloud::Do"
          + "cumentAI::V1beta3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_documentai_v1beta3_RawDocument_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_RawDocument_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_RawDocument_descriptor,
            new java.lang.String[] {
              "Content", "MimeType",
            });
    internal_static_google_cloud_documentai_v1beta3_GcsDocument_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_documentai_v1beta3_GcsDocument_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_GcsDocument_descriptor,
            new java.lang.String[] {
              "GcsUri", "MimeType",
            });
    internal_static_google_cloud_documentai_v1beta3_GcsDocuments_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_documentai_v1beta3_GcsDocuments_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_GcsDocuments_descriptor,
            new java.lang.String[] {
              "Documents",
            });
    internal_static_google_cloud_documentai_v1beta3_GcsPrefix_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_documentai_v1beta3_GcsPrefix_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_GcsPrefix_descriptor,
            new java.lang.String[] {
              "GcsUriPrefix",
            });
    internal_static_google_cloud_documentai_v1beta3_BatchDocumentsInputConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_documentai_v1beta3_BatchDocumentsInputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_BatchDocumentsInputConfig_descriptor,
            new java.lang.String[] {
              "GcsPrefix", "GcsDocuments", "Source",
            });
    internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_descriptor,
            new java.lang.String[] {
              "GcsOutputConfig", "Destination",
            });
    internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_GcsOutputConfig_descriptor =
        internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_GcsOutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_DocumentOutputConfig_GcsOutputConfig_descriptor,
            new java.lang.String[] {
              "GcsUri",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
