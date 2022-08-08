// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1/document_processor_service.proto

package com.google.cloud.documentai.v1;

public interface ListProcessorVersionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1.ListProcessorVersionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent (project, location and processor) to list all versions.
   * Format: `projects/{project}/locations/{location}/processors/{processor}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent (project, location and processor) to list all versions.
   * Format: `projects/{project}/locations/{location}/processors/{processor}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The maximum number of processor versions to return.
   * If unspecified, at most 10 processor versions will be returned.
   * The maximum value is 20; values above 20 will be coerced to 20.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * We will return the processor versions sorted by creation time. The page
   * token will point to the next processor version.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * We will return the processor versions sorted by creation time. The page
   * token will point to the next processor version.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
