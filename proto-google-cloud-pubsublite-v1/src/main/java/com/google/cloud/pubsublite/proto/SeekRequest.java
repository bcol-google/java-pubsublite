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

/**
 *
 *
 * <pre>
 * Request to update the stream's delivery cursor based on the given target.
 * Resets the server available tokens to 0. SeekRequests past head result in
 * stream breakage.
 *
 * SeekRequests may not be sent while another SeekRequest is outstanding (i.e.,
 * has not received a SeekResponse) on the same stream.
 * </pre>
 *
 * Protobuf type {@code google.cloud.pubsublite.v1.SeekRequest}
 */
public final class SeekRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.pubsublite.v1.SeekRequest)
    SeekRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SeekRequest.newBuilder() to construct.
  private SeekRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SeekRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SeekRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.pubsublite.proto.SubscriberProto
        .internal_static_google_cloud_pubsublite_v1_SeekRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.pubsublite.proto.SubscriberProto
        .internal_static_google_cloud_pubsublite_v1_SeekRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.pubsublite.proto.SeekRequest.class,
            com.google.cloud.pubsublite.proto.SeekRequest.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * A special target in the partition that takes no other parameters.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.pubsublite.v1.SeekRequest.NamedTarget}
   */
  public enum NamedTarget implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default value. This value is unused.
     * </pre>
     *
     * <code>NAMED_TARGET_UNSPECIFIED = 0;</code>
     */
    NAMED_TARGET_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * A target corresponding to the most recently published message in the
     * partition.
     * </pre>
     *
     * <code>HEAD = 1;</code>
     */
    HEAD(1),
    /**
     *
     *
     * <pre>
     * A target corresponding to the committed cursor for the given subscription
     * and topic partition.
     * </pre>
     *
     * <code>COMMITTED_CURSOR = 2;</code>
     */
    COMMITTED_CURSOR(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default value. This value is unused.
     * </pre>
     *
     * <code>NAMED_TARGET_UNSPECIFIED = 0;</code>
     */
    public static final int NAMED_TARGET_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * A target corresponding to the most recently published message in the
     * partition.
     * </pre>
     *
     * <code>HEAD = 1;</code>
     */
    public static final int HEAD_VALUE = 1;
    /**
     *
     *
     * <pre>
     * A target corresponding to the committed cursor for the given subscription
     * and topic partition.
     * </pre>
     *
     * <code>COMMITTED_CURSOR = 2;</code>
     */
    public static final int COMMITTED_CURSOR_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static NamedTarget valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static NamedTarget forNumber(int value) {
      switch (value) {
        case 0:
          return NAMED_TARGET_UNSPECIFIED;
        case 1:
          return HEAD;
        case 2:
          return COMMITTED_CURSOR;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<NamedTarget> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<NamedTarget> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NamedTarget>() {
          public NamedTarget findValueByNumber(int number) {
            return NamedTarget.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.pubsublite.proto.SeekRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final NamedTarget[] VALUES = values();

    public static NamedTarget valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private NamedTarget(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.pubsublite.v1.SeekRequest.NamedTarget)
  }

  private int targetCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object target_;

  public enum TargetCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    NAMED_TARGET(1),
    CURSOR(2),
    TARGET_NOT_SET(0);
    private final int value;

    private TargetCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TargetCase valueOf(int value) {
      return forNumber(value);
    }

    public static TargetCase forNumber(int value) {
      switch (value) {
        case 1:
          return NAMED_TARGET;
        case 2:
          return CURSOR;
        case 0:
          return TARGET_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public TargetCase getTargetCase() {
    return TargetCase.forNumber(targetCase_);
  }

  public static final int NAMED_TARGET_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * A named target.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.SeekRequest.NamedTarget named_target = 1;</code>
   *
   * @return Whether the namedTarget field is set.
   */
  public boolean hasNamedTarget() {
    return targetCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * A named target.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.SeekRequest.NamedTarget named_target = 1;</code>
   *
   * @return The enum numeric value on the wire for namedTarget.
   */
  public int getNamedTargetValue() {
    if (targetCase_ == 1) {
      return (java.lang.Integer) target_;
    }
    return 0;
  }
  /**
   *
   *
   * <pre>
   * A named target.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.SeekRequest.NamedTarget named_target = 1;</code>
   *
   * @return The namedTarget.
   */
  public com.google.cloud.pubsublite.proto.SeekRequest.NamedTarget getNamedTarget() {
    if (targetCase_ == 1) {
      com.google.cloud.pubsublite.proto.SeekRequest.NamedTarget result =
          com.google.cloud.pubsublite.proto.SeekRequest.NamedTarget.forNumber(
              (java.lang.Integer) target_);
      return result == null
          ? com.google.cloud.pubsublite.proto.SeekRequest.NamedTarget.UNRECOGNIZED
          : result;
    }
    return com.google.cloud.pubsublite.proto.SeekRequest.NamedTarget.NAMED_TARGET_UNSPECIFIED;
  }

  public static final int CURSOR_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * A target corresponding to the cursor, pointing to anywhere in the
   * topic partition.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 2;</code>
   *
   * @return Whether the cursor field is set.
   */
  @java.lang.Override
  public boolean hasCursor() {
    return targetCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * A target corresponding to the cursor, pointing to anywhere in the
   * topic partition.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 2;</code>
   *
   * @return The cursor.
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.Cursor getCursor() {
    if (targetCase_ == 2) {
      return (com.google.cloud.pubsublite.proto.Cursor) target_;
    }
    return com.google.cloud.pubsublite.proto.Cursor.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * A target corresponding to the cursor, pointing to anywhere in the
   * topic partition.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.CursorOrBuilder getCursorOrBuilder() {
    if (targetCase_ == 2) {
      return (com.google.cloud.pubsublite.proto.Cursor) target_;
    }
    return com.google.cloud.pubsublite.proto.Cursor.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (targetCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) target_));
    }
    if (targetCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.pubsublite.proto.Cursor) target_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (targetCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeEnumSize(1, ((java.lang.Integer) target_));
    }
    if (targetCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.pubsublite.proto.Cursor) target_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.pubsublite.proto.SeekRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.pubsublite.proto.SeekRequest other =
        (com.google.cloud.pubsublite.proto.SeekRequest) obj;

    if (!getTargetCase().equals(other.getTargetCase())) return false;
    switch (targetCase_) {
      case 1:
        if (getNamedTargetValue() != other.getNamedTargetValue()) return false;
        break;
      case 2:
        if (!getCursor().equals(other.getCursor())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (targetCase_) {
      case 1:
        hash = (37 * hash) + NAMED_TARGET_FIELD_NUMBER;
        hash = (53 * hash) + getNamedTargetValue();
        break;
      case 2:
        hash = (37 * hash) + CURSOR_FIELD_NUMBER;
        hash = (53 * hash) + getCursor().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.pubsublite.proto.SeekRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.SeekRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.SeekRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.SeekRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.SeekRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.SeekRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.SeekRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.SeekRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.SeekRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.SeekRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.SeekRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.SeekRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.pubsublite.proto.SeekRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request to update the stream's delivery cursor based on the given target.
   * Resets the server available tokens to 0. SeekRequests past head result in
   * stream breakage.
   *
   * SeekRequests may not be sent while another SeekRequest is outstanding (i.e.,
   * has not received a SeekResponse) on the same stream.
   * </pre>
   *
   * Protobuf type {@code google.cloud.pubsublite.v1.SeekRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.pubsublite.v1.SeekRequest)
      com.google.cloud.pubsublite.proto.SeekRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.pubsublite.proto.SubscriberProto
          .internal_static_google_cloud_pubsublite_v1_SeekRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.pubsublite.proto.SubscriberProto
          .internal_static_google_cloud_pubsublite_v1_SeekRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.pubsublite.proto.SeekRequest.class,
              com.google.cloud.pubsublite.proto.SeekRequest.Builder.class);
    }

    // Construct using com.google.cloud.pubsublite.proto.SeekRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (cursorBuilder_ != null) {
        cursorBuilder_.clear();
      }
      targetCase_ = 0;
      target_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.pubsublite.proto.SubscriberProto
          .internal_static_google_cloud_pubsublite_v1_SeekRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.SeekRequest getDefaultInstanceForType() {
      return com.google.cloud.pubsublite.proto.SeekRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.SeekRequest build() {
      com.google.cloud.pubsublite.proto.SeekRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.SeekRequest buildPartial() {
      com.google.cloud.pubsublite.proto.SeekRequest result =
          new com.google.cloud.pubsublite.proto.SeekRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.pubsublite.proto.SeekRequest result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.pubsublite.proto.SeekRequest result) {
      result.targetCase_ = targetCase_;
      result.target_ = this.target_;
      if (targetCase_ == 2 && cursorBuilder_ != null) {
        result.target_ = cursorBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.pubsublite.proto.SeekRequest) {
        return mergeFrom((com.google.cloud.pubsublite.proto.SeekRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.pubsublite.proto.SeekRequest other) {
      if (other == com.google.cloud.pubsublite.proto.SeekRequest.getDefaultInstance()) return this;
      switch (other.getTargetCase()) {
        case NAMED_TARGET:
          {
            setNamedTargetValue(other.getNamedTargetValue());
            break;
          }
        case CURSOR:
          {
            mergeCursor(other.getCursor());
            break;
          }
        case TARGET_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                int rawValue = input.readEnum();
                targetCase_ = 1;
                target_ = rawValue;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(getCursorFieldBuilder().getBuilder(), extensionRegistry);
                targetCase_ = 2;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int targetCase_ = 0;
    private java.lang.Object target_;

    public TargetCase getTargetCase() {
      return TargetCase.forNumber(targetCase_);
    }

    public Builder clearTarget() {
      targetCase_ = 0;
      target_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * A named target.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.SeekRequest.NamedTarget named_target = 1;</code>
     *
     * @return Whether the namedTarget field is set.
     */
    @java.lang.Override
    public boolean hasNamedTarget() {
      return targetCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * A named target.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.SeekRequest.NamedTarget named_target = 1;</code>
     *
     * @return The enum numeric value on the wire for namedTarget.
     */
    @java.lang.Override
    public int getNamedTargetValue() {
      if (targetCase_ == 1) {
        return ((java.lang.Integer) target_).intValue();
      }
      return 0;
    }
    /**
     *
     *
     * <pre>
     * A named target.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.SeekRequest.NamedTarget named_target = 1;</code>
     *
     * @param value The enum numeric value on the wire for namedTarget to set.
     * @return This builder for chaining.
     */
    public Builder setNamedTargetValue(int value) {
      targetCase_ = 1;
      target_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A named target.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.SeekRequest.NamedTarget named_target = 1;</code>
     *
     * @return The namedTarget.
     */
    @java.lang.Override
    public com.google.cloud.pubsublite.proto.SeekRequest.NamedTarget getNamedTarget() {
      if (targetCase_ == 1) {
        com.google.cloud.pubsublite.proto.SeekRequest.NamedTarget result =
            com.google.cloud.pubsublite.proto.SeekRequest.NamedTarget.forNumber(
                (java.lang.Integer) target_);
        return result == null
            ? com.google.cloud.pubsublite.proto.SeekRequest.NamedTarget.UNRECOGNIZED
            : result;
      }
      return com.google.cloud.pubsublite.proto.SeekRequest.NamedTarget.NAMED_TARGET_UNSPECIFIED;
    }
    /**
     *
     *
     * <pre>
     * A named target.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.SeekRequest.NamedTarget named_target = 1;</code>
     *
     * @param value The namedTarget to set.
     * @return This builder for chaining.
     */
    public Builder setNamedTarget(com.google.cloud.pubsublite.proto.SeekRequest.NamedTarget value) {
      if (value == null) {
        throw new NullPointerException();
      }
      targetCase_ = 1;
      target_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A named target.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.SeekRequest.NamedTarget named_target = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNamedTarget() {
      if (targetCase_ == 1) {
        targetCase_ = 0;
        target_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.Cursor,
            com.google.cloud.pubsublite.proto.Cursor.Builder,
            com.google.cloud.pubsublite.proto.CursorOrBuilder>
        cursorBuilder_;
    /**
     *
     *
     * <pre>
     * A target corresponding to the cursor, pointing to anywhere in the
     * topic partition.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 2;</code>
     *
     * @return Whether the cursor field is set.
     */
    @java.lang.Override
    public boolean hasCursor() {
      return targetCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * A target corresponding to the cursor, pointing to anywhere in the
     * topic partition.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 2;</code>
     *
     * @return The cursor.
     */
    @java.lang.Override
    public com.google.cloud.pubsublite.proto.Cursor getCursor() {
      if (cursorBuilder_ == null) {
        if (targetCase_ == 2) {
          return (com.google.cloud.pubsublite.proto.Cursor) target_;
        }
        return com.google.cloud.pubsublite.proto.Cursor.getDefaultInstance();
      } else {
        if (targetCase_ == 2) {
          return cursorBuilder_.getMessage();
        }
        return com.google.cloud.pubsublite.proto.Cursor.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A target corresponding to the cursor, pointing to anywhere in the
     * topic partition.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 2;</code>
     */
    public Builder setCursor(com.google.cloud.pubsublite.proto.Cursor value) {
      if (cursorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        target_ = value;
        onChanged();
      } else {
        cursorBuilder_.setMessage(value);
      }
      targetCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A target corresponding to the cursor, pointing to anywhere in the
     * topic partition.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 2;</code>
     */
    public Builder setCursor(com.google.cloud.pubsublite.proto.Cursor.Builder builderForValue) {
      if (cursorBuilder_ == null) {
        target_ = builderForValue.build();
        onChanged();
      } else {
        cursorBuilder_.setMessage(builderForValue.build());
      }
      targetCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A target corresponding to the cursor, pointing to anywhere in the
     * topic partition.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 2;</code>
     */
    public Builder mergeCursor(com.google.cloud.pubsublite.proto.Cursor value) {
      if (cursorBuilder_ == null) {
        if (targetCase_ == 2
            && target_ != com.google.cloud.pubsublite.proto.Cursor.getDefaultInstance()) {
          target_ =
              com.google.cloud.pubsublite.proto.Cursor.newBuilder(
                      (com.google.cloud.pubsublite.proto.Cursor) target_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          target_ = value;
        }
        onChanged();
      } else {
        if (targetCase_ == 2) {
          cursorBuilder_.mergeFrom(value);
        } else {
          cursorBuilder_.setMessage(value);
        }
      }
      targetCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A target corresponding to the cursor, pointing to anywhere in the
     * topic partition.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 2;</code>
     */
    public Builder clearCursor() {
      if (cursorBuilder_ == null) {
        if (targetCase_ == 2) {
          targetCase_ = 0;
          target_ = null;
          onChanged();
        }
      } else {
        if (targetCase_ == 2) {
          targetCase_ = 0;
          target_ = null;
        }
        cursorBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A target corresponding to the cursor, pointing to anywhere in the
     * topic partition.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 2;</code>
     */
    public com.google.cloud.pubsublite.proto.Cursor.Builder getCursorBuilder() {
      return getCursorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A target corresponding to the cursor, pointing to anywhere in the
     * topic partition.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.pubsublite.proto.CursorOrBuilder getCursorOrBuilder() {
      if ((targetCase_ == 2) && (cursorBuilder_ != null)) {
        return cursorBuilder_.getMessageOrBuilder();
      } else {
        if (targetCase_ == 2) {
          return (com.google.cloud.pubsublite.proto.Cursor) target_;
        }
        return com.google.cloud.pubsublite.proto.Cursor.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A target corresponding to the cursor, pointing to anywhere in the
     * topic partition.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.Cursor,
            com.google.cloud.pubsublite.proto.Cursor.Builder,
            com.google.cloud.pubsublite.proto.CursorOrBuilder>
        getCursorFieldBuilder() {
      if (cursorBuilder_ == null) {
        if (!(targetCase_ == 2)) {
          target_ = com.google.cloud.pubsublite.proto.Cursor.getDefaultInstance();
        }
        cursorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.pubsublite.proto.Cursor,
                com.google.cloud.pubsublite.proto.Cursor.Builder,
                com.google.cloud.pubsublite.proto.CursorOrBuilder>(
                (com.google.cloud.pubsublite.proto.Cursor) target_,
                getParentForChildren(),
                isClean());
        target_ = null;
      }
      targetCase_ = 2;
      onChanged();
      return cursorBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.pubsublite.v1.SeekRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.SeekRequest)
  private static final com.google.cloud.pubsublite.proto.SeekRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.pubsublite.proto.SeekRequest();
  }

  public static com.google.cloud.pubsublite.proto.SeekRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SeekRequest> PARSER =
      new com.google.protobuf.AbstractParser<SeekRequest>() {
        @java.lang.Override
        public SeekRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<SeekRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SeekRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.pubsublite.proto.SeekRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
