/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.examples.documentai;

// [START document_quickstart]

import com.google.cloud.documentai.v1beta2.AutoMlParams;
import com.google.cloud.documentai.v1beta2.Document;
import com.google.cloud.documentai.v1beta2.DocumentUnderstandingServiceClient;
import com.google.cloud.documentai.v1beta2.GcsSource;
import com.google.cloud.documentai.v1beta2.InputConfig;
import com.google.cloud.documentai.v1beta2.ProcessDocumentRequest;
import java.io.IOException;

public class ParseWithModel {

  public static void parseWithModel() throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String projectId = "your-project-id";
    String location = "your-region";    // available regions https://cloud.google.com/compute/docs/regions-zones
    String autoMlModel = "your-full-resource-model-name";
    String gcsUri = "gs://your-gcs-bucket/path/to/input/file.json";
    parseWithModel(projectId, location, autoMlModel, gcsUri);
  }

  public static void parseWithModel(
      String projectId, String location, String autoMlModel, String gcsUri) throws IOException {
    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (DocumentUnderstandingServiceClient client = DocumentUnderstandingServiceClient.create()) {
      // Configure the request for processing the PDF
      // todo: find correct object builder
      String parent = String.format("projects/%s/locations/%s", projectId, location);

      AutoMlParams params = AutoMlParams.newBuilder().setModel(autoMlModel).build();

      GcsSource uri = GcsSource.newBuilder().setUri(gcsUri).build();

      InputConfig config =
          InputConfig.newBuilder().setGcsSource(uri).setMimeType("application/pdf").build();

      ProcessDocumentRequest req =
          ProcessDocumentRequest.newBuilder()
              .setParent(parent)
              .setAutomlParams(params)
              .setInputConfig(config)
              .build();

      // Recognizes text entities in the PDF document
      Document res = client.processDocument(req);

      // Process the output
      Document.Page page1 = res.getPages(0);
      for (Document.Label label : res.getLabelsList()) {
        System.out.printf("Label detected: %s\n", label.getName());
        System.out.printf("Confidence:  %s\n", label.getConfidence());
      }
    }
  }
}
// [END document_quickstart]
