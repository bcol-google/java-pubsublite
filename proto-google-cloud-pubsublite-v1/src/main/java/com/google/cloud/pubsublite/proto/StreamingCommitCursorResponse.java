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

/**
 *
 *
 * <pre>
 * Response to a StreamingCommitCursorRequest.
 * </pre>
 *
 * Protobuf type {@code google.cloud.pubsublite.v1.StreamingCommitCursorResponse}
 */
public final class StreamingCommitCursorResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.pubsublite.v1.StreamingCommitCursorResponse)
    StreamingCommitCursorResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StreamingCommitCursorResponse.newBuilder() to construct.
  private StreamingCommitCursorResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StreamingCommitCursorResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StreamingCommitCursorResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.pubsublite.proto.CursorProto
        .internal_static_google_cloud_pubsublite_v1_StreamingCommitCursorResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.pubsublite.proto.CursorProto
        .internal_static_google_cloud_pubsublite_v1_StreamingCommitCursorResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse.class,
            com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse.Builder.class);
  }

  private int requestCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object request_;

  public enum RequestCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    INITIAL(1),
    COMMIT(2),
    REQUEST_NOT_SET(0);
    private final int value;

    private RequestCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RequestCase valueOf(int value) {
      return forNumber(value);
    }

    public static RequestCase forNumber(int value) {
      switch (value) {
        case 1:
          return INITIAL;
        case 2:
          return COMMIT;
        case 0:
          return REQUEST_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public RequestCase getRequestCase() {
    return RequestCase.forNumber(requestCase_);
  }

  public static final int INITIAL_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Initial response on the stream.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.InitialCommitCursorResponse initial = 1;</code>
   *
   * @return Whether the initial field is set.
   */
  @java.lang.Override
  public boolean hasInitial() {
    return requestCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Initial response on the stream.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.InitialCommitCursorResponse initial = 1;</code>
   *
   * @return The initial.
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.InitialCommitCursorResponse getInitial() {
    if (requestCase_ == 1) {
      return (com.google.cloud.pubsublite.proto.InitialCommitCursorResponse) request_;
    }
    return com.google.cloud.pubsublite.proto.InitialCommitCursorResponse.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Initial response on the stream.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.InitialCommitCursorResponse initial = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.InitialCommitCursorResponseOrBuilder
      getInitialOrBuilder() {
    if (requestCase_ == 1) {
      return (com.google.cloud.pubsublite.proto.InitialCommitCursorResponse) request_;
    }
    return com.google.cloud.pubsublite.proto.InitialCommitCursorResponse.getDefaultInstance();
  }

  public static final int COMMIT_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Response to committing a new cursor value.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.SequencedCommitCursorResponse commit = 2;</code>
   *
   * @return Whether the commit field is set.
   */
  @java.lang.Override
  public boolean hasCommit() {
    return requestCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Response to committing a new cursor value.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.SequencedCommitCursorResponse commit = 2;</code>
   *
   * @return The commit.
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse getCommit() {
    if (requestCase_ == 2) {
      return (com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse) request_;
    }
    return com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Response to committing a new cursor value.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.SequencedCommitCursorResponse commit = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.SequencedCommitCursorResponseOrBuilder
      getCommitOrBuilder() {
    if (requestCase_ == 2) {
      return (com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse) request_;
    }
    return com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.getDefaultInstance();
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
    if (requestCase_ == 1) {
      output.writeMessage(
          1, (com.google.cloud.pubsublite.proto.InitialCommitCursorResponse) request_);
    }
    if (requestCase_ == 2) {
      output.writeMessage(
          2, (com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse) request_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requestCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.pubsublite.proto.InitialCommitCursorResponse) request_);
    }
    if (requestCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse) request_);
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
    if (!(obj instanceof com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse other =
        (com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse) obj;

    if (!getRequestCase().equals(other.getRequestCase())) return false;
    switch (requestCase_) {
      case 1:
        if (!getInitial().equals(other.getInitial())) return false;
        break;
      case 2:
        if (!getCommit().equals(other.getCommit())) return false;
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
    switch (requestCase_) {
      case 1:
        hash = (37 * hash) + INITIAL_FIELD_NUMBER;
        hash = (53 * hash) + getInitial().hashCode();
        break;
      case 2:
        hash = (37 * hash) + COMMIT_FIELD_NUMBER;
        hash = (53 * hash) + getCommit().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse prototype) {
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
   * Response to a StreamingCommitCursorRequest.
   * </pre>
   *
   * Protobuf type {@code google.cloud.pubsublite.v1.StreamingCommitCursorResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.pubsublite.v1.StreamingCommitCursorResponse)
      com.google.cloud.pubsublite.proto.StreamingCommitCursorResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.pubsublite.proto.CursorProto
          .internal_static_google_cloud_pubsublite_v1_StreamingCommitCursorResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.pubsublite.proto.CursorProto
          .internal_static_google_cloud_pubsublite_v1_StreamingCommitCursorResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse.class,
              com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse.Builder.class);
    }

    // Construct using com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (initialBuilder_ != null) {
        initialBuilder_.clear();
      }
      if (commitBuilder_ != null) {
        commitBuilder_.clear();
      }
      requestCase_ = 0;
      request_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.pubsublite.proto.CursorProto
          .internal_static_google_cloud_pubsublite_v1_StreamingCommitCursorResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse
        getDefaultInstanceForType() {
      return com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse build() {
      com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse buildPartial() {
      com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse result =
          new com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(
        com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse result) {
      result.requestCase_ = requestCase_;
      result.request_ = this.request_;
      if (requestCase_ == 1 && initialBuilder_ != null) {
        result.request_ = initialBuilder_.build();
      }
      if (requestCase_ == 2 && commitBuilder_ != null) {
        result.request_ = commitBuilder_.build();
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
      if (other instanceof com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse) {
        return mergeFrom((com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse other) {
      if (other
          == com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse.getDefaultInstance())
        return this;
      switch (other.getRequestCase()) {
        case INITIAL:
          {
            mergeInitial(other.getInitial());
            break;
          }
        case COMMIT:
          {
            mergeCommit(other.getCommit());
            break;
          }
        case REQUEST_NOT_SET:
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
            case 10:
              {
                input.readMessage(getInitialFieldBuilder().getBuilder(), extensionRegistry);
                requestCase_ = 1;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getCommitFieldBuilder().getBuilder(), extensionRegistry);
                requestCase_ = 2;
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

    private int requestCase_ = 0;
    private java.lang.Object request_;

    public RequestCase getRequestCase() {
      return RequestCase.forNumber(requestCase_);
    }

    public Builder clearRequest() {
      requestCase_ = 0;
      request_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.InitialCommitCursorResponse,
            com.google.cloud.pubsublite.proto.InitialCommitCursorResponse.Builder,
            com.google.cloud.pubsublite.proto.InitialCommitCursorResponseOrBuilder>
        initialBuilder_;
    /**
     *
     *
     * <pre>
     * Initial response on the stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.InitialCommitCursorResponse initial = 1;</code>
     *
     * @return Whether the initial field is set.
     */
    @java.lang.Override
    public boolean hasInitial() {
      return requestCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Initial response on the stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.InitialCommitCursorResponse initial = 1;</code>
     *
     * @return The initial.
     */
    @java.lang.Override
    public com.google.cloud.pubsublite.proto.InitialCommitCursorResponse getInitial() {
      if (initialBuilder_ == null) {
        if (requestCase_ == 1) {
          return (com.google.cloud.pubsublite.proto.InitialCommitCursorResponse) request_;
        }
        return com.google.cloud.pubsublite.proto.InitialCommitCursorResponse.getDefaultInstance();
      } else {
        if (requestCase_ == 1) {
          return initialBuilder_.getMessage();
        }
        return com.google.cloud.pubsublite.proto.InitialCommitCursorResponse.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Initial response on the stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.InitialCommitCursorResponse initial = 1;</code>
     */
    public Builder setInitial(com.google.cloud.pubsublite.proto.InitialCommitCursorResponse value) {
      if (initialBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        request_ = value;
        onChanged();
      } else {
        initialBuilder_.setMessage(value);
      }
      requestCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Initial response on the stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.InitialCommitCursorResponse initial = 1;</code>
     */
    public Builder setInitial(
        com.google.cloud.pubsublite.proto.InitialCommitCursorResponse.Builder builderForValue) {
      if (initialBuilder_ == null) {
        request_ = builderForValue.build();
        onChanged();
      } else {
        initialBuilder_.setMessage(builderForValue.build());
      }
      requestCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Initial response on the stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.InitialCommitCursorResponse initial = 1;</code>
     */
    public Builder mergeInitial(
        com.google.cloud.pubsublite.proto.InitialCommitCursorResponse value) {
      if (initialBuilder_ == null) {
        if (requestCase_ == 1
            && request_
                != com.google.cloud.pubsublite.proto.InitialCommitCursorResponse
                    .getDefaultInstance()) {
          request_ =
              com.google.cloud.pubsublite.proto.InitialCommitCursorResponse.newBuilder(
                      (com.google.cloud.pubsublite.proto.InitialCommitCursorResponse) request_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          request_ = value;
        }
        onChanged();
      } else {
        if (requestCase_ == 1) {
          initialBuilder_.mergeFrom(value);
        } else {
          initialBuilder_.setMessage(value);
        }
      }
      requestCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Initial response on the stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.InitialCommitCursorResponse initial = 1;</code>
     */
    public Builder clearInitial() {
      if (initialBuilder_ == null) {
        if (requestCase_ == 1) {
          requestCase_ = 0;
          request_ = null;
          onChanged();
        }
      } else {
        if (requestCase_ == 1) {
          requestCase_ = 0;
          request_ = null;
        }
        initialBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Initial response on the stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.InitialCommitCursorResponse initial = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.InitialCommitCursorResponse.Builder
        getInitialBuilder() {
      return getInitialFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Initial response on the stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.InitialCommitCursorResponse initial = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.pubsublite.proto.InitialCommitCursorResponseOrBuilder
        getInitialOrBuilder() {
      if ((requestCase_ == 1) && (initialBuilder_ != null)) {
        return initialBuilder_.getMessageOrBuilder();
      } else {
        if (requestCase_ == 1) {
          return (com.google.cloud.pubsublite.proto.InitialCommitCursorResponse) request_;
        }
        return com.google.cloud.pubsublite.proto.InitialCommitCursorResponse.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Initial response on the stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.InitialCommitCursorResponse initial = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.InitialCommitCursorResponse,
            com.google.cloud.pubsublite.proto.InitialCommitCursorResponse.Builder,
            com.google.cloud.pubsublite.proto.InitialCommitCursorResponseOrBuilder>
        getInitialFieldBuilder() {
      if (initialBuilder_ == null) {
        if (!(requestCase_ == 1)) {
          request_ =
              com.google.cloud.pubsublite.proto.InitialCommitCursorResponse.getDefaultInstance();
        }
        initialBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.pubsublite.proto.InitialCommitCursorResponse,
                com.google.cloud.pubsublite.proto.InitialCommitCursorResponse.Builder,
                com.google.cloud.pubsublite.proto.InitialCommitCursorResponseOrBuilder>(
                (com.google.cloud.pubsublite.proto.InitialCommitCursorResponse) request_,
                getParentForChildren(),
                isClean());
        request_ = null;
      }
      requestCase_ = 1;
      onChanged();
      return initialBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse,
            com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.Builder,
            com.google.cloud.pubsublite.proto.SequencedCommitCursorResponseOrBuilder>
        commitBuilder_;
    /**
     *
     *
     * <pre>
     * Response to committing a new cursor value.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.SequencedCommitCursorResponse commit = 2;</code>
     *
     * @return Whether the commit field is set.
     */
    @java.lang.Override
    public boolean hasCommit() {
      return requestCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Response to committing a new cursor value.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.SequencedCommitCursorResponse commit = 2;</code>
     *
     * @return The commit.
     */
    @java.lang.Override
    public com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse getCommit() {
      if (commitBuilder_ == null) {
        if (requestCase_ == 2) {
          return (com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse) request_;
        }
        return com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.getDefaultInstance();
      } else {
        if (requestCase_ == 2) {
          return commitBuilder_.getMessage();
        }
        return com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Response to committing a new cursor value.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.SequencedCommitCursorResponse commit = 2;</code>
     */
    public Builder setCommit(
        com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse value) {
      if (commitBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        request_ = value;
        onChanged();
      } else {
        commitBuilder_.setMessage(value);
      }
      requestCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Response to committing a new cursor value.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.SequencedCommitCursorResponse commit = 2;</code>
     */
    public Builder setCommit(
        com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.Builder builderForValue) {
      if (commitBuilder_ == null) {
        request_ = builderForValue.build();
        onChanged();
      } else {
        commitBuilder_.setMessage(builderForValue.build());
      }
      requestCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Response to committing a new cursor value.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.SequencedCommitCursorResponse commit = 2;</code>
     */
    public Builder mergeCommit(
        com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse value) {
      if (commitBuilder_ == null) {
        if (requestCase_ == 2
            && request_
                != com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse
                    .getDefaultInstance()) {
          request_ =
              com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.newBuilder(
                      (com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse) request_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          request_ = value;
        }
        onChanged();
      } else {
        if (requestCase_ == 2) {
          commitBuilder_.mergeFrom(value);
        } else {
          commitBuilder_.setMessage(value);
        }
      }
      requestCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Response to committing a new cursor value.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.SequencedCommitCursorResponse commit = 2;</code>
     */
    public Builder clearCommit() {
      if (commitBuilder_ == null) {
        if (requestCase_ == 2) {
          requestCase_ = 0;
          request_ = null;
          onChanged();
        }
      } else {
        if (requestCase_ == 2) {
          requestCase_ = 0;
          request_ = null;
        }
        commitBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Response to committing a new cursor value.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.SequencedCommitCursorResponse commit = 2;</code>
     */
    public com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.Builder
        getCommitBuilder() {
      return getCommitFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Response to committing a new cursor value.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.SequencedCommitCursorResponse commit = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.pubsublite.proto.SequencedCommitCursorResponseOrBuilder
        getCommitOrBuilder() {
      if ((requestCase_ == 2) && (commitBuilder_ != null)) {
        return commitBuilder_.getMessageOrBuilder();
      } else {
        if (requestCase_ == 2) {
          return (com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse) request_;
        }
        return com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Response to committing a new cursor value.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.SequencedCommitCursorResponse commit = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse,
            com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.Builder,
            com.google.cloud.pubsublite.proto.SequencedCommitCursorResponseOrBuilder>
        getCommitFieldBuilder() {
      if (commitBuilder_ == null) {
        if (!(requestCase_ == 2)) {
          request_ =
              com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.getDefaultInstance();
        }
        commitBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse,
                com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse.Builder,
                com.google.cloud.pubsublite.proto.SequencedCommitCursorResponseOrBuilder>(
                (com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse) request_,
                getParentForChildren(),
                isClean());
        request_ = null;
      }
      requestCase_ = 2;
      onChanged();
      return commitBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.pubsublite.v1.StreamingCommitCursorResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.StreamingCommitCursorResponse)
  private static final com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse();
  }

  public static com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamingCommitCursorResponse> PARSER =
      new com.google.protobuf.AbstractParser<StreamingCommitCursorResponse>() {
        @java.lang.Override
        public StreamingCommitCursorResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<StreamingCommitCursorResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamingCommitCursorResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.pubsublite.proto.StreamingCommitCursorResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
