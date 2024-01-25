/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/pubsublite/v1/common.proto

package com.google.cloud.pubsublite.proto;

public interface SequencedMessageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.pubsublite.v1.SequencedMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The position of a message within the partition where it is stored.
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
   * The position of a message within the partition where it is stored.
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
   * The position of a message within the partition where it is stored.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
   */
  com.google.cloud.pubsublite.proto.CursorOrBuilder getCursorOrBuilder();

  /**
   *
   *
   * <pre>
   * The time when the message was received by the server when it was first
   * published.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp publish_time = 2;</code>
   *
   * @return Whether the publishTime field is set.
   */
  boolean hasPublishTime();
  /**
   *
   *
   * <pre>
   * The time when the message was received by the server when it was first
   * published.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp publish_time = 2;</code>
   *
   * @return The publishTime.
   */
  com.google.protobuf.Timestamp getPublishTime();
  /**
   *
   *
   * <pre>
   * The time when the message was received by the server when it was first
   * published.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp publish_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getPublishTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The user message.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.PubSubMessage message = 3;</code>
   *
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   *
   *
   * <pre>
   * The user message.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.PubSubMessage message = 3;</code>
   *
   * @return The message.
   */
  com.google.cloud.pubsublite.proto.PubSubMessage getMessage();
  /**
   *
   *
   * <pre>
   * The user message.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.PubSubMessage message = 3;</code>
   */
  com.google.cloud.pubsublite.proto.PubSubMessageOrBuilder getMessageOrBuilder();

  /**
   *
   *
   * <pre>
   * The size in bytes of this message for flow control and quota purposes.
   * </pre>
   *
   * <code>int64 size_bytes = 4;</code>
   *
   * @return The sizeBytes.
   */
  long getSizeBytes();
}
