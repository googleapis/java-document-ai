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

// [START documentai_v1beta2_generated_documentunderstandingserviceclient_processdocument_sync]
import com.google.cloud.documentai.v1beta2.AutoMlParams;
import com.google.cloud.documentai.v1beta2.Document;
import com.google.cloud.documentai.v1beta2.DocumentUnderstandingServiceClient;
import com.google.cloud.documentai.v1beta2.EntityExtractionParams;
import com.google.cloud.documentai.v1beta2.FormExtractionParams;
import com.google.cloud.documentai.v1beta2.InputConfig;
import com.google.cloud.documentai.v1beta2.OcrParams;
import com.google.cloud.documentai.v1beta2.OutputConfig;
import com.google.cloud.documentai.v1beta2.ProcessDocumentRequest;
import com.google.cloud.documentai.v1beta2.TableExtractionParams;

public class SyncProcessDocument {

  public static void main(String[] args) throws Exception {
    syncProcessDocument();
  }

  public static void syncProcessDocument() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DocumentUnderstandingServiceClient documentUnderstandingServiceClient =
        DocumentUnderstandingServiceClient.create()) {
      ProcessDocumentRequest request =
          ProcessDocumentRequest.newBuilder()
              .setParent("parent-995424086")
              .setInputConfig(InputConfig.newBuilder().build())
              .setOutputConfig(OutputConfig.newBuilder().build())
              .setDocumentType("documentType-1473196299")
              .setTableExtractionParams(TableExtractionParams.newBuilder().build())
              .setFormExtractionParams(FormExtractionParams.newBuilder().build())
              .setEntityExtractionParams(EntityExtractionParams.newBuilder().build())
              .setOcrParams(OcrParams.newBuilder().build())
              .setAutomlParams(AutoMlParams.newBuilder().build())
              .build();
      Document response = documentUnderstandingServiceClient.processDocument(request);
    }
  }
}
// [END documentai_v1beta2_generated_documentunderstandingserviceclient_processdocument_sync]
