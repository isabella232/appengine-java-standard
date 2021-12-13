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

package com.google.appengine.api.images;

/**
 * {@code ImagesServiceFailureException} is thrown when any unknown
 * error occurs while communicating with the images service.
 *
 */
public class ImagesServiceFailureException extends RuntimeException {

  static final long serialVersionUID = -3666552183703569527L;

  /**
   * Creates an exception with the supplied message.
   * @param message A message describing the reason for the exception.
   */
  public ImagesServiceFailureException(String message) {
    super(message);
  }

  public ImagesServiceFailureException(String message, Throwable cause) {
    super(message, cause);
  }
}
