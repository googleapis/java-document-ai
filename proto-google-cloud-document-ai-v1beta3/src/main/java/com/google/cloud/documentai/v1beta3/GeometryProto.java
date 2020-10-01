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
// source: google/cloud/documentai/v1beta3/geometry.proto

package com.google.cloud.documentai.v1beta3;

public final class GeometryProto {
  private GeometryProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Vertex_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Vertex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_NormalizedVertex_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_NormalizedVertex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_BoundingPoly_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_BoundingPoly_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/documentai/v1beta3/geomet"
          + "ry.proto\022\037google.cloud.documentai.v1beta"
          + "3\032\034google/api/annotations.proto\"\036\n\006Verte"
          + "x\022\t\n\001x\030\001 \001(\005\022\t\n\001y\030\002 \001(\005\"(\n\020NormalizedVer"
          + "tex\022\t\n\001x\030\001 \001(\002\022\t\n\001y\030\002 \001(\002\"\231\001\n\014BoundingPo"
          + "ly\0229\n\010vertices\030\001 \003(\0132\'.google.cloud.docu"
          + "mentai.v1beta3.Vertex\022N\n\023normalized_vert"
          + "ices\030\002 \003(\01321.google.cloud.documentai.v1b"
          + "eta3.NormalizedVertexB\351\001\n#com.google.clo"
          + "ud.documentai.v1beta3B\rGeometryProtoP\001ZI"
          + "google.golang.org/genproto/googleapis/cl"
          + "oud/documentai/v1beta3;documentai\252\002\037Goog"
          + "le.Cloud.DocumentAI.v1beta3\312\002\037Google\\Clo"
          + "ud\\DocumentAi\\v1beta3\352\002!Google::Cloud::D"
          + "ocumentAI::masterb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_documentai_v1beta3_Vertex_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_Vertex_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Vertex_descriptor,
            new java.lang.String[] {
              "X", "Y",
            });
    internal_static_google_cloud_documentai_v1beta3_NormalizedVertex_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_documentai_v1beta3_NormalizedVertex_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_NormalizedVertex_descriptor,
            new java.lang.String[] {
              "X", "Y",
            });
    internal_static_google_cloud_documentai_v1beta3_BoundingPoly_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_documentai_v1beta3_BoundingPoly_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_BoundingPoly_descriptor,
            new java.lang.String[] {
              "Vertices", "NormalizedVertices",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
