/*
 * Copyright 2021 Google LLC
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

package com.google.appengine.api.search;

import static com.google.common.truth.Truth.assertThat;

import com.google.appengine.api.search.proto.SearchServicePb;
import com.google.appengine.api.search.proto.SearchServicePb.ScorerSpec;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link MatchScorer}.
 *
 */
@RunWith(JUnit4.class)
public class MatchScorerTest {

  @Test
  public void testBuilder_build() {
    MatchScorer.newBuilder().build();
  }

  @Test
  public void testCloneAsProtocolBuffer() {
    SearchServicePb.ScorerSpec spec = MatchScorer.newBuilder()
        .build()
        .copyToScorerSpecProtocolBuffer()
        .build();
    assertThat(spec.getScorer()).isEqualTo(ScorerSpec.Scorer.MATCH_SCORER);
    assertThat(spec.hasLimit()).isFalse();
  }

  @Test
  public void testToString() {
    assertThat(MatchScorer.newBuilder().build().toString()).isEqualTo("MatchScorer()");
  }
}
