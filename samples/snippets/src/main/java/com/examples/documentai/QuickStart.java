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

// [START documentai_quickstart]

import com.google.cloud.documentai.v1beta2.Document;
import com.google.cloud.documentai.v1beta2.DocumentUnderstandingServiceClient;
import com.google.cloud.documentai.v1beta2.GcsSource;
import com.google.cloud.documentai.v1beta2.InputConfig;
import com.google.cloud.documentai.v1beta2.ProcessDocumentRequest;
import java.io.IOException;

public class QuickStart {

  public static void quickStart() throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String projectId = "your-project-id";
    String location = "us-central1";
    String inputGcsUri = "gs://your-gcs-bucket/path/to/input/file.json";
    quickStart(projectId, location, inputGcsUri);
  }

  public static void quickStart(String projectId, String location, String inputGcsUri)
      throws IOException {
    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (DocumentUnderstandingServiceClient client = DocumentUnderstandingServiceClient.create()) {
      // Configure the request for processing the PDF
      String parent = String.format("projects/%s/locations/%s", projectId, location);

      System.out.println(parent);
      GcsSource uri = GcsSource.newBuilder().setUri(inputGcsUri).build();

      InputConfig config =
          InputConfig.newBuilder().setGcsSource(uri)
                  // mime_type can be application/pdf, image/tiff,
                  // and image/gif, or application/json
                  .setMimeType("application/pdf").build();

      ProcessDocumentRequest request =
          ProcessDocumentRequest.newBuilder().setParent(parent).setInputConfig(config).build();

      // Recognizes text entities in the PDF document
      Document response = client.processDocument(request);

      // Get all of the document text as one big string
      String text = response.getText();

      // Process the output
      for (Document.Entity entity : response.getEntitiesList()) {
        System.out.printf("Entity text: %s\n", getText(entity, text));
        System.out.printf("Entity type: %s\n", entity.getType());
        System.out.printf("Entity mention text: %s\n", entity.getMentionText());
      }
    }
  }

  private static String getText(Document.Entity entity, String text) {
    int startIdx = (int) entity.getTextAnchor().getTextSegments(0).getStartIndex();
    int endIdx = (int) entity.getTextAnchor().getTextSegments(0).getEndIndex();
    return text.substring(startIdx, endIdx);
  }
}
// [END documentai_quickstart]
