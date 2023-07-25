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

public interface InitialPartitionAssignmentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.pubsublite.v1.InitialPartitionAssignmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The subscription name. Structured like:
   * projects/&lt;project number&gt;/locations/&lt;zone name&gt;/subscriptions/&lt;subscription
   * id&gt;
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
   * The subscription name. Structured like:
   * projects/&lt;project number&gt;/locations/&lt;zone name&gt;/subscriptions/&lt;subscription
   * id&gt;
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
   * An opaque, unique client identifier. This field must be exactly 16 bytes
   * long and is interpreted as an unsigned 128 bit integer. Other size values
   * will be rejected and the stream will be failed with a non-retryable error.
   *
   * This field is large enough to fit a uuid from standard uuid algorithms like
   * uuid1 or uuid4, which should be used to generate this number. The same
   * identifier should be reused following disconnections with retryable stream
   * errors.
   * </pre>
   *
   * <code>bytes client_id = 2;</code>
   *
   * @return The clientId.
   */
  com.google.protobuf.ByteString getClientId();
}
