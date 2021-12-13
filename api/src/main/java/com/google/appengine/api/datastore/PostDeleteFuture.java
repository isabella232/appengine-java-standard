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

package com.google.appengine.api.datastore;

import java.util.concurrent.Future;

/**
 * {@link PostOpFuture} implementation that invokes PostDelete callbacks.
 *
 */
class PostDeleteFuture extends PostOpFuture<Void> {
  private final DeleteContext postDeleteContext;

  PostDeleteFuture(
      Future<Void> delegate, DatastoreCallbacks callbacks, DeleteContext postDeleteContext) {
    super(delegate, callbacks);
    this.postDeleteContext = postDeleteContext;
  }

  @Override
  void executeCallbacks(Void ignore) {
    datastoreCallbacks.executePostDeleteCallbacks(postDeleteContext);
  }
}
