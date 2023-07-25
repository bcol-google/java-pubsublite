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
// source: google/cloud/pubsublite/v1/admin.proto

package com.google.cloud.pubsublite.proto;

public interface CreateReservationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.pubsublite.v1.CreateReservationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent location in which to create the reservation.
   * Structured like `projects/{project_number}/locations/{location}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent location in which to create the reservation.
   * Structured like `projects/{project_number}/locations/{location}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Configuration of the reservation to create. Its `name` field is
   * ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.pubsublite.v1.Reservation reservation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the reservation field is set.
   */
  boolean hasReservation();
  /**
   *
   *
   * <pre>
   * Required. Configuration of the reservation to create. Its `name` field is
   * ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.pubsublite.v1.Reservation reservation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The reservation.
   */
  com.google.cloud.pubsublite.proto.Reservation getReservation();
  /**
   *
   *
   * <pre>
   * Required. Configuration of the reservation to create. Its `name` field is
   * ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.pubsublite.v1.Reservation reservation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.pubsublite.proto.ReservationOrBuilder getReservationOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the reservation, which will become the final
   * component of the reservation's name.
   *
   * This value is structured like: `my-reservation-name`.
   * </pre>
   *
   * <code>string reservation_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The reservationId.
   */
  java.lang.String getReservationId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the reservation, which will become the final
   * component of the reservation's name.
   *
   * This value is structured like: `my-reservation-name`.
   * </pre>
   *
   * <code>string reservation_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for reservationId.
   */
  com.google.protobuf.ByteString getReservationIdBytes();
}
