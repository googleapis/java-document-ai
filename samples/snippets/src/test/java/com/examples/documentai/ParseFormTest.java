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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import static com.google.common.truth.Truth.assertThat;

public class ParseFormTest {
  private static final String PROJECT_ID = System.getenv("GOOGLE_CLOUD_PROJECT");
  private static final String INPUT_URI = "gs://cloud-samples-data/documentai/invoice.pdf";

  private ByteArrayOutputStream bout;
  private PrintStream out;

  @Before
  public void setUp() {
    bout = new ByteArrayOutputStream();
    out = new PrintStream(bout);
    System.setOut(out);
  }

  @Test
  public void testParseForm()
      throws InterruptedException, ExecutionException, TimeoutException, IOException {
    // retrieve a job.
    ParseForm.parseForm(
        PROJECT_ID, "us-west2", INPUT_URI);
    String got = bout.toString();

    assertThat(got).contains("Extracted key value pair:");
  }

  @After
  public void tearDown() {
    System.setOut(null);
  }
}
