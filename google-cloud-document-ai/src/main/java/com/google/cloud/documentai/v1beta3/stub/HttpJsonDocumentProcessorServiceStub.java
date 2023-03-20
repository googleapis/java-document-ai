/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.documentai.v1beta3.stub;

import static com.google.cloud.documentai.v1beta3.DocumentProcessorServiceClient.ListEvaluationsPagedResponse;
import static com.google.cloud.documentai.v1beta3.DocumentProcessorServiceClient.ListLocationsPagedResponse;
import static com.google.cloud.documentai.v1beta3.DocumentProcessorServiceClient.ListProcessorTypesPagedResponse;
import static com.google.cloud.documentai.v1beta3.DocumentProcessorServiceClient.ListProcessorVersionsPagedResponse;
import static com.google.cloud.documentai.v1beta3.DocumentProcessorServiceClient.ListProcessorsPagedResponse;

import com.google.api.HttpRule;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonOperationSnapshot;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.httpjson.longrunning.stub.HttpJsonOperationsStub;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.documentai.v1beta3.BatchProcessMetadata;
import com.google.cloud.documentai.v1beta3.BatchProcessRequest;
import com.google.cloud.documentai.v1beta3.BatchProcessResponse;
import com.google.cloud.documentai.v1beta3.CreateProcessorRequest;
import com.google.cloud.documentai.v1beta3.DeleteProcessorMetadata;
import com.google.cloud.documentai.v1beta3.DeleteProcessorRequest;
import com.google.cloud.documentai.v1beta3.DeleteProcessorVersionMetadata;
import com.google.cloud.documentai.v1beta3.DeleteProcessorVersionRequest;
import com.google.cloud.documentai.v1beta3.DeployProcessorVersionMetadata;
import com.google.cloud.documentai.v1beta3.DeployProcessorVersionRequest;
import com.google.cloud.documentai.v1beta3.DeployProcessorVersionResponse;
import com.google.cloud.documentai.v1beta3.DisableProcessorMetadata;
import com.google.cloud.documentai.v1beta3.DisableProcessorRequest;
import com.google.cloud.documentai.v1beta3.DisableProcessorResponse;
import com.google.cloud.documentai.v1beta3.EnableProcessorMetadata;
import com.google.cloud.documentai.v1beta3.EnableProcessorRequest;
import com.google.cloud.documentai.v1beta3.EnableProcessorResponse;
import com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionMetadata;
import com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionRequest;
import com.google.cloud.documentai.v1beta3.EvaluateProcessorVersionResponse;
import com.google.cloud.documentai.v1beta3.Evaluation;
import com.google.cloud.documentai.v1beta3.FetchProcessorTypesRequest;
import com.google.cloud.documentai.v1beta3.FetchProcessorTypesResponse;
import com.google.cloud.documentai.v1beta3.GetEvaluationRequest;
import com.google.cloud.documentai.v1beta3.GetProcessorRequest;
import com.google.cloud.documentai.v1beta3.GetProcessorTypeRequest;
import com.google.cloud.documentai.v1beta3.GetProcessorVersionRequest;
import com.google.cloud.documentai.v1beta3.ImportProcessorVersionMetadata;
import com.google.cloud.documentai.v1beta3.ImportProcessorVersionRequest;
import com.google.cloud.documentai.v1beta3.ImportProcessorVersionResponse;
import com.google.cloud.documentai.v1beta3.ListEvaluationsRequest;
import com.google.cloud.documentai.v1beta3.ListEvaluationsResponse;
import com.google.cloud.documentai.v1beta3.ListProcessorTypesRequest;
import com.google.cloud.documentai.v1beta3.ListProcessorTypesResponse;
import com.google.cloud.documentai.v1beta3.ListProcessorVersionsRequest;
import com.google.cloud.documentai.v1beta3.ListProcessorVersionsResponse;
import com.google.cloud.documentai.v1beta3.ListProcessorsRequest;
import com.google.cloud.documentai.v1beta3.ListProcessorsResponse;
import com.google.cloud.documentai.v1beta3.ProcessRequest;
import com.google.cloud.documentai.v1beta3.ProcessResponse;
import com.google.cloud.documentai.v1beta3.Processor;
import com.google.cloud.documentai.v1beta3.ProcessorType;
import com.google.cloud.documentai.v1beta3.ProcessorVersion;
import com.google.cloud.documentai.v1beta3.ReviewDocumentOperationMetadata;
import com.google.cloud.documentai.v1beta3.ReviewDocumentRequest;
import com.google.cloud.documentai.v1beta3.ReviewDocumentResponse;
import com.google.cloud.documentai.v1beta3.SetDefaultProcessorVersionMetadata;
import com.google.cloud.documentai.v1beta3.SetDefaultProcessorVersionRequest;
import com.google.cloud.documentai.v1beta3.SetDefaultProcessorVersionResponse;
import com.google.cloud.documentai.v1beta3.TrainProcessorVersionMetadata;
import com.google.cloud.documentai.v1beta3.TrainProcessorVersionRequest;
import com.google.cloud.documentai.v1beta3.TrainProcessorVersionResponse;
import com.google.cloud.documentai.v1beta3.UndeployProcessorVersionMetadata;
import com.google.cloud.documentai.v1beta3.UndeployProcessorVersionRequest;
import com.google.cloud.documentai.v1beta3.UndeployProcessorVersionResponse;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.TypeRegistry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the DocumentProcessorService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class HttpJsonDocumentProcessorServiceStub extends DocumentProcessorServiceStub {
  private static final TypeRegistry typeRegistry =
      TypeRegistry.newBuilder()
          .add(DisableProcessorMetadata.getDescriptor())
          .add(DeployProcessorVersionMetadata.getDescriptor())
          .add(EnableProcessorMetadata.getDescriptor())
          .add(SetDefaultProcessorVersionMetadata.getDescriptor())
          .add(DeployProcessorVersionResponse.getDescriptor())
          .add(BatchProcessResponse.getDescriptor())
          .add(UndeployProcessorVersionResponse.getDescriptor())
          .add(DisableProcessorResponse.getDescriptor())
          .add(ReviewDocumentOperationMetadata.getDescriptor())
          .add(EvaluateProcessorVersionResponse.getDescriptor())
          .add(EvaluateProcessorVersionMetadata.getDescriptor())
          .add(TrainProcessorVersionMetadata.getDescriptor())
          .add(ImportProcessorVersionMetadata.getDescriptor())
          .add(BatchProcessMetadata.getDescriptor())
          .add(Empty.getDescriptor())
          .add(UndeployProcessorVersionMetadata.getDescriptor())
          .add(DeleteProcessorMetadata.getDescriptor())
          .add(ReviewDocumentResponse.getDescriptor())
          .add(EnableProcessorResponse.getDescriptor())
          .add(TrainProcessorVersionResponse.getDescriptor())
          .add(ImportProcessorVersionResponse.getDescriptor())
          .add(DeleteProcessorVersionMetadata.getDescriptor())
          .add(SetDefaultProcessorVersionResponse.getDescriptor())
          .build();

  private static final ApiMethodDescriptor<ProcessRequest, ProcessResponse>
      processDocumentMethodDescriptor =
          ApiMethodDescriptor.<ProcessRequest, ProcessResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/ProcessDocument")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ProcessRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*/locations/*/processors/*}:process",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ProcessRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setAdditionalPaths(
                          "/v1beta3/{name=projects/*/locations/*/processors/*/processorVersions/*}:process")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ProcessRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearName().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ProcessResponse>newBuilder()
                      .setDefaultInstance(ProcessResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<BatchProcessRequest, Operation>
      batchProcessDocumentsMethodDescriptor =
          ApiMethodDescriptor.<BatchProcessRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/BatchProcessDocuments")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<BatchProcessRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*/locations/*/processors/*}:batchProcess",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<BatchProcessRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setAdditionalPaths(
                          "/v1beta3/{name=projects/*/locations/*/processors/*/processorVersions/*}:batchProcess")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<BatchProcessRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearName().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (BatchProcessRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<FetchProcessorTypesRequest, FetchProcessorTypesResponse>
      fetchProcessorTypesMethodDescriptor =
          ApiMethodDescriptor.<FetchProcessorTypesRequest, FetchProcessorTypesResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/FetchProcessorTypes")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<FetchProcessorTypesRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{parent=projects/*/locations/*}:fetchProcessorTypes",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<FetchProcessorTypesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<FetchProcessorTypesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<FetchProcessorTypesResponse>newBuilder()
                      .setDefaultInstance(FetchProcessorTypesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListProcessorTypesRequest, ListProcessorTypesResponse>
      listProcessorTypesMethodDescriptor =
          ApiMethodDescriptor.<ListProcessorTypesRequest, ListProcessorTypesResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/ListProcessorTypes")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListProcessorTypesRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{parent=projects/*/locations/*}/processorTypes",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListProcessorTypesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListProcessorTypesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListProcessorTypesResponse>newBuilder()
                      .setDefaultInstance(ListProcessorTypesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetProcessorTypeRequest, ProcessorType>
      getProcessorTypeMethodDescriptor =
          ApiMethodDescriptor.<GetProcessorTypeRequest, ProcessorType>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/GetProcessorType")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetProcessorTypeRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*/locations/*/processorTypes/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetProcessorTypeRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetProcessorTypeRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ProcessorType>newBuilder()
                      .setDefaultInstance(ProcessorType.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListProcessorsRequest, ListProcessorsResponse>
      listProcessorsMethodDescriptor =
          ApiMethodDescriptor.<ListProcessorsRequest, ListProcessorsResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/ListProcessors")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListProcessorsRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{parent=projects/*/locations/*}/processors",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListProcessorsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListProcessorsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListProcessorsResponse>newBuilder()
                      .setDefaultInstance(ListProcessorsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetProcessorRequest, Processor>
      getProcessorMethodDescriptor =
          ApiMethodDescriptor.<GetProcessorRequest, Processor>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/GetProcessor")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetProcessorRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*/locations/*/processors/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetProcessorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetProcessorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Processor>newBuilder()
                      .setDefaultInstance(Processor.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<TrainProcessorVersionRequest, Operation>
      trainProcessorVersionMethodDescriptor =
          ApiMethodDescriptor.<TrainProcessorVersionRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/TrainProcessorVersion")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<TrainProcessorVersionRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{parent=projects/*/locations/*/processors/*}/processorVersions:train",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<TrainProcessorVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<TrainProcessorVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearParent().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (TrainProcessorVersionRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<GetProcessorVersionRequest, ProcessorVersion>
      getProcessorVersionMethodDescriptor =
          ApiMethodDescriptor.<GetProcessorVersionRequest, ProcessorVersion>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/GetProcessorVersion")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetProcessorVersionRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*/locations/*/processors/*/processorVersions/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetProcessorVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetProcessorVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ProcessorVersion>newBuilder()
                      .setDefaultInstance(ProcessorVersion.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<
          ListProcessorVersionsRequest, ListProcessorVersionsResponse>
      listProcessorVersionsMethodDescriptor =
          ApiMethodDescriptor
              .<ListProcessorVersionsRequest, ListProcessorVersionsResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/ListProcessorVersions")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListProcessorVersionsRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{parent=projects/*/locations/*/processors/*}/processorVersions",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListProcessorVersionsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListProcessorVersionsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListProcessorVersionsResponse>newBuilder()
                      .setDefaultInstance(ListProcessorVersionsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<DeleteProcessorVersionRequest, Operation>
      deleteProcessorVersionMethodDescriptor =
          ApiMethodDescriptor.<DeleteProcessorVersionRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/DeleteProcessorVersion")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteProcessorVersionRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*/locations/*/processors/*/processorVersions/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteProcessorVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteProcessorVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (DeleteProcessorVersionRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<DeployProcessorVersionRequest, Operation>
      deployProcessorVersionMethodDescriptor =
          ApiMethodDescriptor.<DeployProcessorVersionRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/DeployProcessorVersion")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeployProcessorVersionRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*/locations/*/processors/*/processorVersions/*}:deploy",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeployProcessorVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeployProcessorVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearName().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (DeployProcessorVersionRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<UndeployProcessorVersionRequest, Operation>
      undeployProcessorVersionMethodDescriptor =
          ApiMethodDescriptor.<UndeployProcessorVersionRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/UndeployProcessorVersion")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UndeployProcessorVersionRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*/locations/*/processors/*/processorVersions/*}:undeploy",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UndeployProcessorVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UndeployProcessorVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearName().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (UndeployProcessorVersionRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<CreateProcessorRequest, Processor>
      createProcessorMethodDescriptor =
          ApiMethodDescriptor.<CreateProcessorRequest, Processor>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/CreateProcessor")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateProcessorRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{parent=projects/*/locations/*}/processors",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateProcessorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateProcessorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("processor", request.getProcessor(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Processor>newBuilder()
                      .setDefaultInstance(Processor.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<DeleteProcessorRequest, Operation>
      deleteProcessorMethodDescriptor =
          ApiMethodDescriptor.<DeleteProcessorRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/DeleteProcessor")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteProcessorRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*/locations/*/processors/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteProcessorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteProcessorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (DeleteProcessorRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<EnableProcessorRequest, Operation>
      enableProcessorMethodDescriptor =
          ApiMethodDescriptor.<EnableProcessorRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/EnableProcessor")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<EnableProcessorRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*/locations/*/processors/*}:enable",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<EnableProcessorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<EnableProcessorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearName().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (EnableProcessorRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<DisableProcessorRequest, Operation>
      disableProcessorMethodDescriptor =
          ApiMethodDescriptor.<DisableProcessorRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/DisableProcessor")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DisableProcessorRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*/locations/*/processors/*}:disable",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DisableProcessorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DisableProcessorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearName().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (DisableProcessorRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<SetDefaultProcessorVersionRequest, Operation>
      setDefaultProcessorVersionMethodDescriptor =
          ApiMethodDescriptor.<SetDefaultProcessorVersionRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/SetDefaultProcessorVersion")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<SetDefaultProcessorVersionRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{processor=projects/*/locations/*/processors/*}:setDefaultProcessorVersion",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<SetDefaultProcessorVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "processor", request.getProcessor());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<SetDefaultProcessorVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearProcessor().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (SetDefaultProcessorVersionRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<ReviewDocumentRequest, Operation>
      reviewDocumentMethodDescriptor =
          ApiMethodDescriptor.<ReviewDocumentRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/ReviewDocument")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ReviewDocumentRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{humanReviewConfig=projects/*/locations/*/processors/*/humanReviewConfig}:reviewDocument",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ReviewDocumentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "humanReviewConfig", request.getHumanReviewConfig());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ReviewDocumentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "*",
                                      request.toBuilder().clearHumanReviewConfig().build(),
                                      true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (ReviewDocumentRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<EvaluateProcessorVersionRequest, Operation>
      evaluateProcessorVersionMethodDescriptor =
          ApiMethodDescriptor.<EvaluateProcessorVersionRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/EvaluateProcessorVersion")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<EvaluateProcessorVersionRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{processorVersion=projects/*/locations/*/processors/*/processorVersions/*}:evaluateProcessorVersion",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<EvaluateProcessorVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "processorVersion", request.getProcessorVersion());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<EvaluateProcessorVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "*",
                                      request.toBuilder().clearProcessorVersion().build(),
                                      true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (EvaluateProcessorVersionRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<GetEvaluationRequest, Evaluation>
      getEvaluationMethodDescriptor =
          ApiMethodDescriptor.<GetEvaluationRequest, Evaluation>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/GetEvaluation")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetEvaluationRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*/locations/*/processors/*/processorVersions/*/evaluations/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetEvaluationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetEvaluationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Evaluation>newBuilder()
                      .setDefaultInstance(Evaluation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListEvaluationsRequest, ListEvaluationsResponse>
      listEvaluationsMethodDescriptor =
          ApiMethodDescriptor.<ListEvaluationsRequest, ListEvaluationsResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/ListEvaluations")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListEvaluationsRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{parent=projects/*/locations/*/processors/*/processorVersions/*}/evaluations",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListEvaluationsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListEvaluationsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListEvaluationsResponse>newBuilder()
                      .setDefaultInstance(ListEvaluationsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ImportProcessorVersionRequest, Operation>
      importProcessorVersionMethodDescriptor =
          ApiMethodDescriptor.<ImportProcessorVersionRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.documentai.v1beta3.DocumentProcessorService/ImportProcessorVersion")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ImportProcessorVersionRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{parent=projects/*/locations/*/processors/*}/processorVersions:importProcessorVersion",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ImportProcessorVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ImportProcessorVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearParent().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (ImportProcessorVersionRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<ListLocationsRequest, ListLocationsResponse>
      listLocationsMethodDescriptor =
          ApiMethodDescriptor.<ListLocationsRequest, ListLocationsResponse>newBuilder()
              .setFullMethodName("google.cloud.location.Locations/ListLocations")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListLocationsRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*}/locations",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListLocationsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setAdditionalPaths("/uiv1beta3/{name=projects/*}/locations")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListLocationsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListLocationsResponse>newBuilder()
                      .setDefaultInstance(ListLocationsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetLocationRequest, Location>
      getLocationMethodDescriptor =
          ApiMethodDescriptor.<GetLocationRequest, Location>newBuilder()
              .setFullMethodName("google.cloud.location.Locations/GetLocation")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetLocationRequest>newBuilder()
                      .setPath(
                          "/v1beta3/{name=projects/*/locations/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetLocationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setAdditionalPaths("/uiv1beta3/{name=projects/*/locations/*}")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetLocationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Location>newBuilder()
                      .setDefaultInstance(Location.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private final UnaryCallable<ProcessRequest, ProcessResponse> processDocumentCallable;
  private final UnaryCallable<BatchProcessRequest, Operation> batchProcessDocumentsCallable;
  private final OperationCallable<BatchProcessRequest, BatchProcessResponse, BatchProcessMetadata>
      batchProcessDocumentsOperationCallable;
  private final UnaryCallable<FetchProcessorTypesRequest, FetchProcessorTypesResponse>
      fetchProcessorTypesCallable;
  private final UnaryCallable<ListProcessorTypesRequest, ListProcessorTypesResponse>
      listProcessorTypesCallable;
  private final UnaryCallable<ListProcessorTypesRequest, ListProcessorTypesPagedResponse>
      listProcessorTypesPagedCallable;
  private final UnaryCallable<GetProcessorTypeRequest, ProcessorType> getProcessorTypeCallable;
  private final UnaryCallable<ListProcessorsRequest, ListProcessorsResponse> listProcessorsCallable;
  private final UnaryCallable<ListProcessorsRequest, ListProcessorsPagedResponse>
      listProcessorsPagedCallable;
  private final UnaryCallable<GetProcessorRequest, Processor> getProcessorCallable;
  private final UnaryCallable<TrainProcessorVersionRequest, Operation>
      trainProcessorVersionCallable;
  private final OperationCallable<
          TrainProcessorVersionRequest,
          TrainProcessorVersionResponse,
          TrainProcessorVersionMetadata>
      trainProcessorVersionOperationCallable;
  private final UnaryCallable<GetProcessorVersionRequest, ProcessorVersion>
      getProcessorVersionCallable;
  private final UnaryCallable<ListProcessorVersionsRequest, ListProcessorVersionsResponse>
      listProcessorVersionsCallable;
  private final UnaryCallable<ListProcessorVersionsRequest, ListProcessorVersionsPagedResponse>
      listProcessorVersionsPagedCallable;
  private final UnaryCallable<DeleteProcessorVersionRequest, Operation>
      deleteProcessorVersionCallable;
  private final OperationCallable<
          DeleteProcessorVersionRequest, Empty, DeleteProcessorVersionMetadata>
      deleteProcessorVersionOperationCallable;
  private final UnaryCallable<DeployProcessorVersionRequest, Operation>
      deployProcessorVersionCallable;
  private final OperationCallable<
          DeployProcessorVersionRequest,
          DeployProcessorVersionResponse,
          DeployProcessorVersionMetadata>
      deployProcessorVersionOperationCallable;
  private final UnaryCallable<UndeployProcessorVersionRequest, Operation>
      undeployProcessorVersionCallable;
  private final OperationCallable<
          UndeployProcessorVersionRequest,
          UndeployProcessorVersionResponse,
          UndeployProcessorVersionMetadata>
      undeployProcessorVersionOperationCallable;
  private final UnaryCallable<CreateProcessorRequest, Processor> createProcessorCallable;
  private final UnaryCallable<DeleteProcessorRequest, Operation> deleteProcessorCallable;
  private final OperationCallable<DeleteProcessorRequest, Empty, DeleteProcessorMetadata>
      deleteProcessorOperationCallable;
  private final UnaryCallable<EnableProcessorRequest, Operation> enableProcessorCallable;
  private final OperationCallable<
          EnableProcessorRequest, EnableProcessorResponse, EnableProcessorMetadata>
      enableProcessorOperationCallable;
  private final UnaryCallable<DisableProcessorRequest, Operation> disableProcessorCallable;
  private final OperationCallable<
          DisableProcessorRequest, DisableProcessorResponse, DisableProcessorMetadata>
      disableProcessorOperationCallable;
  private final UnaryCallable<SetDefaultProcessorVersionRequest, Operation>
      setDefaultProcessorVersionCallable;
  private final OperationCallable<
          SetDefaultProcessorVersionRequest,
          SetDefaultProcessorVersionResponse,
          SetDefaultProcessorVersionMetadata>
      setDefaultProcessorVersionOperationCallable;
  private final UnaryCallable<ReviewDocumentRequest, Operation> reviewDocumentCallable;
  private final OperationCallable<
          ReviewDocumentRequest, ReviewDocumentResponse, ReviewDocumentOperationMetadata>
      reviewDocumentOperationCallable;
  private final UnaryCallable<EvaluateProcessorVersionRequest, Operation>
      evaluateProcessorVersionCallable;
  private final OperationCallable<
          EvaluateProcessorVersionRequest,
          EvaluateProcessorVersionResponse,
          EvaluateProcessorVersionMetadata>
      evaluateProcessorVersionOperationCallable;
  private final UnaryCallable<GetEvaluationRequest, Evaluation> getEvaluationCallable;
  private final UnaryCallable<ListEvaluationsRequest, ListEvaluationsResponse>
      listEvaluationsCallable;
  private final UnaryCallable<ListEvaluationsRequest, ListEvaluationsPagedResponse>
      listEvaluationsPagedCallable;
  private final UnaryCallable<ImportProcessorVersionRequest, Operation>
      importProcessorVersionCallable;
  private final OperationCallable<
          ImportProcessorVersionRequest,
          ImportProcessorVersionResponse,
          ImportProcessorVersionMetadata>
      importProcessorVersionOperationCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable;
  private final UnaryCallable<GetLocationRequest, Location> getLocationCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonOperationsStub httpJsonOperationsStub;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonDocumentProcessorServiceStub create(
      DocumentProcessorServiceStubSettings settings) throws IOException {
    return new HttpJsonDocumentProcessorServiceStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonDocumentProcessorServiceStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonDocumentProcessorServiceStub(
        DocumentProcessorServiceStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonDocumentProcessorServiceStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonDocumentProcessorServiceStub(
        DocumentProcessorServiceStubSettings.newHttpJsonBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonDocumentProcessorServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonDocumentProcessorServiceStub(
      DocumentProcessorServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonDocumentProcessorServiceCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonDocumentProcessorServiceStub, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonDocumentProcessorServiceStub(
      DocumentProcessorServiceStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.httpJsonOperationsStub =
        HttpJsonOperationsStub.create(
            clientContext,
            callableFactory,
            typeRegistry,
            ImmutableMap.<String, HttpRule>builder()
                .put(
                    "google.longrunning.Operations.CancelOperation",
                    HttpRule.newBuilder()
                        .setPost("/v1beta3/{name=projects/*/locations/*/operations/*}:cancel")
                        .addAdditionalBindings(
                            HttpRule.newBuilder()
                                .setPost(
                                    "/uiv1beta3/{name=projects/*/locations/*/operations/*}:cancel")
                                .build())
                        .build())
                .put(
                    "google.longrunning.Operations.GetOperation",
                    HttpRule.newBuilder()
                        .setGet("/v1beta3/{name=projects/*/locations/*/operations/*}")
                        .addAdditionalBindings(
                            HttpRule.newBuilder()
                                .setGet("/uiv1beta3/{name=projects/*/locations/*/operations/*}")
                                .build())
                        .build())
                .put(
                    "google.longrunning.Operations.ListOperations",
                    HttpRule.newBuilder()
                        .setGet("/v1beta3/{name=projects/*/locations/*/operations}")
                        .addAdditionalBindings(
                            HttpRule.newBuilder()
                                .setGet("/uiv1beta3/{name=projects/*/locations/*/operations}")
                                .build())
                        .build())
                .build());

    HttpJsonCallSettings<ProcessRequest, ProcessResponse> processDocumentTransportSettings =
        HttpJsonCallSettings.<ProcessRequest, ProcessResponse>newBuilder()
            .setMethodDescriptor(processDocumentMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<BatchProcessRequest, Operation> batchProcessDocumentsTransportSettings =
        HttpJsonCallSettings.<BatchProcessRequest, Operation>newBuilder()
            .setMethodDescriptor(batchProcessDocumentsMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<FetchProcessorTypesRequest, FetchProcessorTypesResponse>
        fetchProcessorTypesTransportSettings =
            HttpJsonCallSettings
                .<FetchProcessorTypesRequest, FetchProcessorTypesResponse>newBuilder()
                .setMethodDescriptor(fetchProcessorTypesMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<ListProcessorTypesRequest, ListProcessorTypesResponse>
        listProcessorTypesTransportSettings =
            HttpJsonCallSettings.<ListProcessorTypesRequest, ListProcessorTypesResponse>newBuilder()
                .setMethodDescriptor(listProcessorTypesMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<GetProcessorTypeRequest, ProcessorType> getProcessorTypeTransportSettings =
        HttpJsonCallSettings.<GetProcessorTypeRequest, ProcessorType>newBuilder()
            .setMethodDescriptor(getProcessorTypeMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<ListProcessorsRequest, ListProcessorsResponse>
        listProcessorsTransportSettings =
            HttpJsonCallSettings.<ListProcessorsRequest, ListProcessorsResponse>newBuilder()
                .setMethodDescriptor(listProcessorsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<GetProcessorRequest, Processor> getProcessorTransportSettings =
        HttpJsonCallSettings.<GetProcessorRequest, Processor>newBuilder()
            .setMethodDescriptor(getProcessorMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<TrainProcessorVersionRequest, Operation>
        trainProcessorVersionTransportSettings =
            HttpJsonCallSettings.<TrainProcessorVersionRequest, Operation>newBuilder()
                .setMethodDescriptor(trainProcessorVersionMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<GetProcessorVersionRequest, ProcessorVersion>
        getProcessorVersionTransportSettings =
            HttpJsonCallSettings.<GetProcessorVersionRequest, ProcessorVersion>newBuilder()
                .setMethodDescriptor(getProcessorVersionMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<ListProcessorVersionsRequest, ListProcessorVersionsResponse>
        listProcessorVersionsTransportSettings =
            HttpJsonCallSettings
                .<ListProcessorVersionsRequest, ListProcessorVersionsResponse>newBuilder()
                .setMethodDescriptor(listProcessorVersionsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<DeleteProcessorVersionRequest, Operation>
        deleteProcessorVersionTransportSettings =
            HttpJsonCallSettings.<DeleteProcessorVersionRequest, Operation>newBuilder()
                .setMethodDescriptor(deleteProcessorVersionMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<DeployProcessorVersionRequest, Operation>
        deployProcessorVersionTransportSettings =
            HttpJsonCallSettings.<DeployProcessorVersionRequest, Operation>newBuilder()
                .setMethodDescriptor(deployProcessorVersionMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<UndeployProcessorVersionRequest, Operation>
        undeployProcessorVersionTransportSettings =
            HttpJsonCallSettings.<UndeployProcessorVersionRequest, Operation>newBuilder()
                .setMethodDescriptor(undeployProcessorVersionMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<CreateProcessorRequest, Processor> createProcessorTransportSettings =
        HttpJsonCallSettings.<CreateProcessorRequest, Processor>newBuilder()
            .setMethodDescriptor(createProcessorMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<DeleteProcessorRequest, Operation> deleteProcessorTransportSettings =
        HttpJsonCallSettings.<DeleteProcessorRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteProcessorMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<EnableProcessorRequest, Operation> enableProcessorTransportSettings =
        HttpJsonCallSettings.<EnableProcessorRequest, Operation>newBuilder()
            .setMethodDescriptor(enableProcessorMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<DisableProcessorRequest, Operation> disableProcessorTransportSettings =
        HttpJsonCallSettings.<DisableProcessorRequest, Operation>newBuilder()
            .setMethodDescriptor(disableProcessorMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<SetDefaultProcessorVersionRequest, Operation>
        setDefaultProcessorVersionTransportSettings =
            HttpJsonCallSettings.<SetDefaultProcessorVersionRequest, Operation>newBuilder()
                .setMethodDescriptor(setDefaultProcessorVersionMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<ReviewDocumentRequest, Operation> reviewDocumentTransportSettings =
        HttpJsonCallSettings.<ReviewDocumentRequest, Operation>newBuilder()
            .setMethodDescriptor(reviewDocumentMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<EvaluateProcessorVersionRequest, Operation>
        evaluateProcessorVersionTransportSettings =
            HttpJsonCallSettings.<EvaluateProcessorVersionRequest, Operation>newBuilder()
                .setMethodDescriptor(evaluateProcessorVersionMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<GetEvaluationRequest, Evaluation> getEvaluationTransportSettings =
        HttpJsonCallSettings.<GetEvaluationRequest, Evaluation>newBuilder()
            .setMethodDescriptor(getEvaluationMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<ListEvaluationsRequest, ListEvaluationsResponse>
        listEvaluationsTransportSettings =
            HttpJsonCallSettings.<ListEvaluationsRequest, ListEvaluationsResponse>newBuilder()
                .setMethodDescriptor(listEvaluationsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<ImportProcessorVersionRequest, Operation>
        importProcessorVersionTransportSettings =
            HttpJsonCallSettings.<ImportProcessorVersionRequest, Operation>newBuilder()
                .setMethodDescriptor(importProcessorVersionMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<ListLocationsRequest, ListLocationsResponse>
        listLocationsTransportSettings =
            HttpJsonCallSettings.<ListLocationsRequest, ListLocationsResponse>newBuilder()
                .setMethodDescriptor(listLocationsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<GetLocationRequest, Location> getLocationTransportSettings =
        HttpJsonCallSettings.<GetLocationRequest, Location>newBuilder()
            .setMethodDescriptor(getLocationMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();

    this.processDocumentCallable =
        callableFactory.createUnaryCallable(
            processDocumentTransportSettings, settings.processDocumentSettings(), clientContext);
    this.batchProcessDocumentsCallable =
        callableFactory.createUnaryCallable(
            batchProcessDocumentsTransportSettings,
            settings.batchProcessDocumentsSettings(),
            clientContext);
    this.batchProcessDocumentsOperationCallable =
        callableFactory.createOperationCallable(
            batchProcessDocumentsTransportSettings,
            settings.batchProcessDocumentsOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.fetchProcessorTypesCallable =
        callableFactory.createUnaryCallable(
            fetchProcessorTypesTransportSettings,
            settings.fetchProcessorTypesSettings(),
            clientContext);
    this.listProcessorTypesCallable =
        callableFactory.createUnaryCallable(
            listProcessorTypesTransportSettings,
            settings.listProcessorTypesSettings(),
            clientContext);
    this.listProcessorTypesPagedCallable =
        callableFactory.createPagedCallable(
            listProcessorTypesTransportSettings,
            settings.listProcessorTypesSettings(),
            clientContext);
    this.getProcessorTypeCallable =
        callableFactory.createUnaryCallable(
            getProcessorTypeTransportSettings, settings.getProcessorTypeSettings(), clientContext);
    this.listProcessorsCallable =
        callableFactory.createUnaryCallable(
            listProcessorsTransportSettings, settings.listProcessorsSettings(), clientContext);
    this.listProcessorsPagedCallable =
        callableFactory.createPagedCallable(
            listProcessorsTransportSettings, settings.listProcessorsSettings(), clientContext);
    this.getProcessorCallable =
        callableFactory.createUnaryCallable(
            getProcessorTransportSettings, settings.getProcessorSettings(), clientContext);
    this.trainProcessorVersionCallable =
        callableFactory.createUnaryCallable(
            trainProcessorVersionTransportSettings,
            settings.trainProcessorVersionSettings(),
            clientContext);
    this.trainProcessorVersionOperationCallable =
        callableFactory.createOperationCallable(
            trainProcessorVersionTransportSettings,
            settings.trainProcessorVersionOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.getProcessorVersionCallable =
        callableFactory.createUnaryCallable(
            getProcessorVersionTransportSettings,
            settings.getProcessorVersionSettings(),
            clientContext);
    this.listProcessorVersionsCallable =
        callableFactory.createUnaryCallable(
            listProcessorVersionsTransportSettings,
            settings.listProcessorVersionsSettings(),
            clientContext);
    this.listProcessorVersionsPagedCallable =
        callableFactory.createPagedCallable(
            listProcessorVersionsTransportSettings,
            settings.listProcessorVersionsSettings(),
            clientContext);
    this.deleteProcessorVersionCallable =
        callableFactory.createUnaryCallable(
            deleteProcessorVersionTransportSettings,
            settings.deleteProcessorVersionSettings(),
            clientContext);
    this.deleteProcessorVersionOperationCallable =
        callableFactory.createOperationCallable(
            deleteProcessorVersionTransportSettings,
            settings.deleteProcessorVersionOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.deployProcessorVersionCallable =
        callableFactory.createUnaryCallable(
            deployProcessorVersionTransportSettings,
            settings.deployProcessorVersionSettings(),
            clientContext);
    this.deployProcessorVersionOperationCallable =
        callableFactory.createOperationCallable(
            deployProcessorVersionTransportSettings,
            settings.deployProcessorVersionOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.undeployProcessorVersionCallable =
        callableFactory.createUnaryCallable(
            undeployProcessorVersionTransportSettings,
            settings.undeployProcessorVersionSettings(),
            clientContext);
    this.undeployProcessorVersionOperationCallable =
        callableFactory.createOperationCallable(
            undeployProcessorVersionTransportSettings,
            settings.undeployProcessorVersionOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.createProcessorCallable =
        callableFactory.createUnaryCallable(
            createProcessorTransportSettings, settings.createProcessorSettings(), clientContext);
    this.deleteProcessorCallable =
        callableFactory.createUnaryCallable(
            deleteProcessorTransportSettings, settings.deleteProcessorSettings(), clientContext);
    this.deleteProcessorOperationCallable =
        callableFactory.createOperationCallable(
            deleteProcessorTransportSettings,
            settings.deleteProcessorOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.enableProcessorCallable =
        callableFactory.createUnaryCallable(
            enableProcessorTransportSettings, settings.enableProcessorSettings(), clientContext);
    this.enableProcessorOperationCallable =
        callableFactory.createOperationCallable(
            enableProcessorTransportSettings,
            settings.enableProcessorOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.disableProcessorCallable =
        callableFactory.createUnaryCallable(
            disableProcessorTransportSettings, settings.disableProcessorSettings(), clientContext);
    this.disableProcessorOperationCallable =
        callableFactory.createOperationCallable(
            disableProcessorTransportSettings,
            settings.disableProcessorOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.setDefaultProcessorVersionCallable =
        callableFactory.createUnaryCallable(
            setDefaultProcessorVersionTransportSettings,
            settings.setDefaultProcessorVersionSettings(),
            clientContext);
    this.setDefaultProcessorVersionOperationCallable =
        callableFactory.createOperationCallable(
            setDefaultProcessorVersionTransportSettings,
            settings.setDefaultProcessorVersionOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.reviewDocumentCallable =
        callableFactory.createUnaryCallable(
            reviewDocumentTransportSettings, settings.reviewDocumentSettings(), clientContext);
    this.reviewDocumentOperationCallable =
        callableFactory.createOperationCallable(
            reviewDocumentTransportSettings,
            settings.reviewDocumentOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.evaluateProcessorVersionCallable =
        callableFactory.createUnaryCallable(
            evaluateProcessorVersionTransportSettings,
            settings.evaluateProcessorVersionSettings(),
            clientContext);
    this.evaluateProcessorVersionOperationCallable =
        callableFactory.createOperationCallable(
            evaluateProcessorVersionTransportSettings,
            settings.evaluateProcessorVersionOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.getEvaluationCallable =
        callableFactory.createUnaryCallable(
            getEvaluationTransportSettings, settings.getEvaluationSettings(), clientContext);
    this.listEvaluationsCallable =
        callableFactory.createUnaryCallable(
            listEvaluationsTransportSettings, settings.listEvaluationsSettings(), clientContext);
    this.listEvaluationsPagedCallable =
        callableFactory.createPagedCallable(
            listEvaluationsTransportSettings, settings.listEvaluationsSettings(), clientContext);
    this.importProcessorVersionCallable =
        callableFactory.createUnaryCallable(
            importProcessorVersionTransportSettings,
            settings.importProcessorVersionSettings(),
            clientContext);
    this.importProcessorVersionOperationCallable =
        callableFactory.createOperationCallable(
            importProcessorVersionTransportSettings,
            settings.importProcessorVersionOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.listLocationsCallable =
        callableFactory.createUnaryCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.listLocationsPagedCallable =
        callableFactory.createPagedCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.getLocationCallable =
        callableFactory.createUnaryCallable(
            getLocationTransportSettings, settings.getLocationSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(processDocumentMethodDescriptor);
    methodDescriptors.add(batchProcessDocumentsMethodDescriptor);
    methodDescriptors.add(fetchProcessorTypesMethodDescriptor);
    methodDescriptors.add(listProcessorTypesMethodDescriptor);
    methodDescriptors.add(getProcessorTypeMethodDescriptor);
    methodDescriptors.add(listProcessorsMethodDescriptor);
    methodDescriptors.add(getProcessorMethodDescriptor);
    methodDescriptors.add(trainProcessorVersionMethodDescriptor);
    methodDescriptors.add(getProcessorVersionMethodDescriptor);
    methodDescriptors.add(listProcessorVersionsMethodDescriptor);
    methodDescriptors.add(deleteProcessorVersionMethodDescriptor);
    methodDescriptors.add(deployProcessorVersionMethodDescriptor);
    methodDescriptors.add(undeployProcessorVersionMethodDescriptor);
    methodDescriptors.add(createProcessorMethodDescriptor);
    methodDescriptors.add(deleteProcessorMethodDescriptor);
    methodDescriptors.add(enableProcessorMethodDescriptor);
    methodDescriptors.add(disableProcessorMethodDescriptor);
    methodDescriptors.add(setDefaultProcessorVersionMethodDescriptor);
    methodDescriptors.add(reviewDocumentMethodDescriptor);
    methodDescriptors.add(evaluateProcessorVersionMethodDescriptor);
    methodDescriptors.add(getEvaluationMethodDescriptor);
    methodDescriptors.add(listEvaluationsMethodDescriptor);
    methodDescriptors.add(importProcessorVersionMethodDescriptor);
    methodDescriptors.add(listLocationsMethodDescriptor);
    methodDescriptors.add(getLocationMethodDescriptor);
    return methodDescriptors;
  }

  public HttpJsonOperationsStub getHttpJsonOperationsStub() {
    return httpJsonOperationsStub;
  }

  @Override
  public UnaryCallable<ProcessRequest, ProcessResponse> processDocumentCallable() {
    return processDocumentCallable;
  }

  @Override
  public UnaryCallable<BatchProcessRequest, Operation> batchProcessDocumentsCallable() {
    return batchProcessDocumentsCallable;
  }

  @Override
  public OperationCallable<BatchProcessRequest, BatchProcessResponse, BatchProcessMetadata>
      batchProcessDocumentsOperationCallable() {
    return batchProcessDocumentsOperationCallable;
  }

  @Override
  public UnaryCallable<FetchProcessorTypesRequest, FetchProcessorTypesResponse>
      fetchProcessorTypesCallable() {
    return fetchProcessorTypesCallable;
  }

  @Override
  public UnaryCallable<ListProcessorTypesRequest, ListProcessorTypesResponse>
      listProcessorTypesCallable() {
    return listProcessorTypesCallable;
  }

  @Override
  public UnaryCallable<ListProcessorTypesRequest, ListProcessorTypesPagedResponse>
      listProcessorTypesPagedCallable() {
    return listProcessorTypesPagedCallable;
  }

  @Override
  public UnaryCallable<GetProcessorTypeRequest, ProcessorType> getProcessorTypeCallable() {
    return getProcessorTypeCallable;
  }

  @Override
  public UnaryCallable<ListProcessorsRequest, ListProcessorsResponse> listProcessorsCallable() {
    return listProcessorsCallable;
  }

  @Override
  public UnaryCallable<ListProcessorsRequest, ListProcessorsPagedResponse>
      listProcessorsPagedCallable() {
    return listProcessorsPagedCallable;
  }

  @Override
  public UnaryCallable<GetProcessorRequest, Processor> getProcessorCallable() {
    return getProcessorCallable;
  }

  @Override
  public UnaryCallable<TrainProcessorVersionRequest, Operation> trainProcessorVersionCallable() {
    return trainProcessorVersionCallable;
  }

  @Override
  public OperationCallable<
          TrainProcessorVersionRequest,
          TrainProcessorVersionResponse,
          TrainProcessorVersionMetadata>
      trainProcessorVersionOperationCallable() {
    return trainProcessorVersionOperationCallable;
  }

  @Override
  public UnaryCallable<GetProcessorVersionRequest, ProcessorVersion> getProcessorVersionCallable() {
    return getProcessorVersionCallable;
  }

  @Override
  public UnaryCallable<ListProcessorVersionsRequest, ListProcessorVersionsResponse>
      listProcessorVersionsCallable() {
    return listProcessorVersionsCallable;
  }

  @Override
  public UnaryCallable<ListProcessorVersionsRequest, ListProcessorVersionsPagedResponse>
      listProcessorVersionsPagedCallable() {
    return listProcessorVersionsPagedCallable;
  }

  @Override
  public UnaryCallable<DeleteProcessorVersionRequest, Operation> deleteProcessorVersionCallable() {
    return deleteProcessorVersionCallable;
  }

  @Override
  public OperationCallable<DeleteProcessorVersionRequest, Empty, DeleteProcessorVersionMetadata>
      deleteProcessorVersionOperationCallable() {
    return deleteProcessorVersionOperationCallable;
  }

  @Override
  public UnaryCallable<DeployProcessorVersionRequest, Operation> deployProcessorVersionCallable() {
    return deployProcessorVersionCallable;
  }

  @Override
  public OperationCallable<
          DeployProcessorVersionRequest,
          DeployProcessorVersionResponse,
          DeployProcessorVersionMetadata>
      deployProcessorVersionOperationCallable() {
    return deployProcessorVersionOperationCallable;
  }

  @Override
  public UnaryCallable<UndeployProcessorVersionRequest, Operation>
      undeployProcessorVersionCallable() {
    return undeployProcessorVersionCallable;
  }

  @Override
  public OperationCallable<
          UndeployProcessorVersionRequest,
          UndeployProcessorVersionResponse,
          UndeployProcessorVersionMetadata>
      undeployProcessorVersionOperationCallable() {
    return undeployProcessorVersionOperationCallable;
  }

  @Override
  public UnaryCallable<CreateProcessorRequest, Processor> createProcessorCallable() {
    return createProcessorCallable;
  }

  @Override
  public UnaryCallable<DeleteProcessorRequest, Operation> deleteProcessorCallable() {
    return deleteProcessorCallable;
  }

  @Override
  public OperationCallable<DeleteProcessorRequest, Empty, DeleteProcessorMetadata>
      deleteProcessorOperationCallable() {
    return deleteProcessorOperationCallable;
  }

  @Override
  public UnaryCallable<EnableProcessorRequest, Operation> enableProcessorCallable() {
    return enableProcessorCallable;
  }

  @Override
  public OperationCallable<EnableProcessorRequest, EnableProcessorResponse, EnableProcessorMetadata>
      enableProcessorOperationCallable() {
    return enableProcessorOperationCallable;
  }

  @Override
  public UnaryCallable<DisableProcessorRequest, Operation> disableProcessorCallable() {
    return disableProcessorCallable;
  }

  @Override
  public OperationCallable<
          DisableProcessorRequest, DisableProcessorResponse, DisableProcessorMetadata>
      disableProcessorOperationCallable() {
    return disableProcessorOperationCallable;
  }

  @Override
  public UnaryCallable<SetDefaultProcessorVersionRequest, Operation>
      setDefaultProcessorVersionCallable() {
    return setDefaultProcessorVersionCallable;
  }

  @Override
  public OperationCallable<
          SetDefaultProcessorVersionRequest,
          SetDefaultProcessorVersionResponse,
          SetDefaultProcessorVersionMetadata>
      setDefaultProcessorVersionOperationCallable() {
    return setDefaultProcessorVersionOperationCallable;
  }

  @Override
  public UnaryCallable<ReviewDocumentRequest, Operation> reviewDocumentCallable() {
    return reviewDocumentCallable;
  }

  @Override
  public OperationCallable<
          ReviewDocumentRequest, ReviewDocumentResponse, ReviewDocumentOperationMetadata>
      reviewDocumentOperationCallable() {
    return reviewDocumentOperationCallable;
  }

  @Override
  public UnaryCallable<EvaluateProcessorVersionRequest, Operation>
      evaluateProcessorVersionCallable() {
    return evaluateProcessorVersionCallable;
  }

  @Override
  public OperationCallable<
          EvaluateProcessorVersionRequest,
          EvaluateProcessorVersionResponse,
          EvaluateProcessorVersionMetadata>
      evaluateProcessorVersionOperationCallable() {
    return evaluateProcessorVersionOperationCallable;
  }

  @Override
  public UnaryCallable<GetEvaluationRequest, Evaluation> getEvaluationCallable() {
    return getEvaluationCallable;
  }

  @Override
  public UnaryCallable<ListEvaluationsRequest, ListEvaluationsResponse> listEvaluationsCallable() {
    return listEvaluationsCallable;
  }

  @Override
  public UnaryCallable<ListEvaluationsRequest, ListEvaluationsPagedResponse>
      listEvaluationsPagedCallable() {
    return listEvaluationsPagedCallable;
  }

  @Override
  public UnaryCallable<ImportProcessorVersionRequest, Operation> importProcessorVersionCallable() {
    return importProcessorVersionCallable;
  }

  @Override
  public OperationCallable<
          ImportProcessorVersionRequest,
          ImportProcessorVersionResponse,
          ImportProcessorVersionMetadata>
      importProcessorVersionOperationCallable() {
    return importProcessorVersionOperationCallable;
  }

  @Override
  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    return listLocationsCallable;
  }

  @Override
  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    return listLocationsPagedCallable;
  }

  @Override
  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return getLocationCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
