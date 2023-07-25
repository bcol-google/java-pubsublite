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
// source: google/cloud/pubsublite/v1/cursor.proto

package com.google.cloud.pubsublite.proto;

public interface CommitCursorRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.pubsublite.v1.CommitCursorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The subscription for which to update the cursor.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   *
   * @return The subscription.
   */
  java.lang.String getSubscription();
  /**
   *
   *
   * <pre>
   * The subscription for which to update the cursor.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   *
   * @return The bytes for subscription.
   */
  com.google.protobuf.ByteString getSubscriptionBytes();

  /**
   *
   *
   * <pre>
   * The partition for which to update the cursor. Partitions are zero indexed,
   * so `partition` must be in the range [0, topic.num_partitions).
   * </pre>
   *
   * <code>int64 partition = 2;</code>
   *
   * @return The partition.
   */
  long getPartition();

  /**
   *
   *
   * <pre>
   * The new value for the committed cursor.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 3;</code>
   *
   * @return Whether the cursor field is set.
   */
  boolean hasCursor();
  /**
   *
   *
   * <pre>
   * The new value for the committed cursor.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 3;</code>
   *
   * @return The cursor.
   */
  com.google.cloud.pubsublite.proto.Cursor getCursor();
  /**
   *
   *
   * <pre>
   * The new value for the committed cursor.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 3;</code>
   */
  com.google.cloud.pubsublite.proto.CursorOrBuilder getCursorOrBuilder();
}
