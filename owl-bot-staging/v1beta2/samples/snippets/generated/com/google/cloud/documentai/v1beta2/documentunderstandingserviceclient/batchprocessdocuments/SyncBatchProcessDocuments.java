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

package com.google.cloud.documentai.v1beta2.samples;

// [START documentai_v1beta2_generated_documentunderstandingserviceclient_batchprocessdocuments_sync]
import com.google.cloud.documentai.v1beta2.BatchProcessDocumentsRequest;
import com.google.cloud.documentai.v1beta2.BatchProcessDocumentsResponse;
import com.google.cloud.documentai.v1beta2.DocumentUnderstandingServiceClient;
import com.google.cloud.documentai.v1beta2.ProcessDocumentRequest;
import java.util.ArrayList;

public class SyncBatchProcessDocuments {

  public static void main(String[] args) throws Exception {
    syncBatchProcessDocuments();
  }

  public static void syncBatchProcessDocuments() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DocumentUnderstandingServiceClient documentUnderstandingServiceClient =
        DocumentUnderstandingServiceClient.create()) {
      BatchProcessDocumentsRequest request =
          BatchProcessDocumentsRequest.newBuilder()
              .addAllRequests(new ArrayList<ProcessDocumentRequest>())
              .setParent("parent-995424086")
              .build();
      BatchProcessDocumentsResponse response =
          documentUnderstandingServiceClient.batchProcessDocumentsAsync(request).get();
    }
  }
}
// [END documentai_v1beta2_generated_documentunderstandingserviceclient_batchprocessdocuments_sync]
