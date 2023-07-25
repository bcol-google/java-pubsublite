/*
 * Copyright 2023 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/pubsublite/v1/subscriber.proto

package com.google.cloud.pubsublite.proto;

public interface InitialSubscribeResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.pubsublite.v1.InitialSubscribeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The cursor from which the subscriber will start receiving messages once
   * flow control tokens become available.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
   *
   * @return Whether the cursor field is set.
   */
  boolean hasCursor();
  /**
   *
   *
   * <pre>
   * The cursor from which the subscriber will start receiving messages once
   * flow control tokens become available.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
   *
   * @return The cursor.
   */
  com.google.cloud.pubsublite.proto.Cursor getCursor();
  /**
   *
   *
   * <pre>
   * The cursor from which the subscriber will start receiving messages once
   * flow control tokens become available.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
   */
  com.google.cloud.pubsublite.proto.CursorOrBuilder getCursorOrBuilder();
}
