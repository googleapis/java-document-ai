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

import static com.google.common.truth.Truth.assertThat;

import com.google.api.gax.paging.Page;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BatchParseFormTest {
  private static final String PROJECT_ID = System.getenv("GOOGLE_CLOUD_PROJECT");
  private static final String INPUT_URI = "gs://cloud-samples-data/documentai/invoice.pdf";
  private static final String OUTPUT_PREFIX = String.format("documentai/%s", UUID.randomUUID());
  private static final String OUTPUT_BUCKET_NAME = PROJECT_ID;

  private ByteArrayOutputStream bout;
  private PrintStream out;

  private static void cleanUpBucket() {
    Storage storage = StorageOptions.getDefaultInstance().getService();
    Page<Blob> blobs =
        storage.list(
            PROJECT_ID,
            Storage.BlobListOption.currentDirectory(),
            Storage.BlobListOption.prefix(OUTPUT_PREFIX));

    deleteDirectory(storage, blobs);
  }

  private static void deleteDirectory(Storage storage, Page<Blob> blobs) {
    for (Blob blob : blobs.iterateAll()) {
      System.out.println(blob.getBlobId());
      if (!blob.delete()) {
        Page<Blob> subBlobs =
            storage.list(
                PROJECT_ID,
                Storage.BlobListOption.currentDirectory(),
                Storage.BlobListOption.prefix(blob.getName()));

        deleteDirectory(storage, subBlobs);
      }
    }
  }

  @Before
  public void setUp() {
    bout = new ByteArrayOutputStream();
    out = new PrintStream(bout);
    System.setOut(out);
  }

  @Test
  public void testBatchParseForm()
      throws InterruptedException, ExecutionException, TimeoutException, IOException {
    // parse the GCS invoice as a form.
    BatchParseForm.batchParseFormGcs(
        PROJECT_ID, "us-west2", OUTPUT_BUCKET_NAME, OUTPUT_PREFIX, INPUT_URI);
    String got = bout.toString();

    assertThat(got).contains("Fetched file");
    assertThat(got).contains("ADDRESS:");
    assertThat(got).contains("BALANCE DUE");
  }

  @After
  public void tearDown() {
    cleanUpBucket();
    System.setOut(null);
  }
}
