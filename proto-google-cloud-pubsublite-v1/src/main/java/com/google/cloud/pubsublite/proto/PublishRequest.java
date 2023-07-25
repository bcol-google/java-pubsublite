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
// source: google/cloud/pubsublite/v1/publisher.proto

package com.google.cloud.pubsublite.proto;

/**
 *
 *
 * <pre>
 * Request sent from the client to the server on a stream.
 * </pre>
 *
 * Protobuf type {@code google.cloud.pubsublite.v1.PublishRequest}
 */
public final class PublishRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.pubsublite.v1.PublishRequest)
    PublishRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PublishRequest.newBuilder() to construct.
  private PublishRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PublishRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PublishRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.pubsublite.proto.PublisherProto
        .internal_static_google_cloud_pubsublite_v1_PublishRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.pubsublite.proto.PublisherProto
        .internal_static_google_cloud_pubsublite_v1_PublishRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.pubsublite.proto.PublishRequest.class,
            com.google.cloud.pubsublite.proto.PublishRequest.Builder.class);
  }

  private int requestTypeCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object requestType_;

  public enum RequestTypeCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    INITIAL_REQUEST(1),
    MESSAGE_PUBLISH_REQUEST(2),
    REQUESTTYPE_NOT_SET(0);
    private final int value;

    private RequestTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RequestTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static RequestTypeCase forNumber(int value) {
      switch (value) {
        case 1:
          return INITIAL_REQUEST;
        case 2:
          return MESSAGE_PUBLISH_REQUEST;
        case 0:
          return REQUESTTYPE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public RequestTypeCase getRequestTypeCase() {
    return RequestTypeCase.forNumber(requestTypeCase_);
  }

  public static final int INITIAL_REQUEST_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Initial request on the stream.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.InitialPublishRequest initial_request = 1;</code>
   *
   * @return Whether the initialRequest field is set.
   */
  @java.lang.Override
  public boolean hasInitialRequest() {
    return requestTypeCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Initial request on the stream.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.InitialPublishRequest initial_request = 1;</code>
   *
   * @return The initialRequest.
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.InitialPublishRequest getInitialRequest() {
    if (requestTypeCase_ == 1) {
      return (com.google.cloud.pubsublite.proto.InitialPublishRequest) requestType_;
    }
    return com.google.cloud.pubsublite.proto.InitialPublishRequest.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Initial request on the stream.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.InitialPublishRequest initial_request = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.InitialPublishRequestOrBuilder
      getInitialRequestOrBuilder() {
    if (requestTypeCase_ == 1) {
      return (com.google.cloud.pubsublite.proto.InitialPublishRequest) requestType_;
    }
    return com.google.cloud.pubsublite.proto.InitialPublishRequest.getDefaultInstance();
  }

  public static final int MESSAGE_PUBLISH_REQUEST_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Request to publish messages.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.MessagePublishRequest message_publish_request = 2;</code>
   *
   * @return Whether the messagePublishRequest field is set.
   */
  @java.lang.Override
  public boolean hasMessagePublishRequest() {
    return requestTypeCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Request to publish messages.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.MessagePublishRequest message_publish_request = 2;</code>
   *
   * @return The messagePublishRequest.
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.MessagePublishRequest getMessagePublishRequest() {
    if (requestTypeCase_ == 2) {
      return (com.google.cloud.pubsublite.proto.MessagePublishRequest) requestType_;
    }
    return com.google.cloud.pubsublite.proto.MessagePublishRequest.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Request to publish messages.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.MessagePublishRequest message_publish_request = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.MessagePublishRequestOrBuilder
      getMessagePublishRequestOrBuilder() {
    if (requestTypeCase_ == 2) {
      return (com.google.cloud.pubsublite.proto.MessagePublishRequest) requestType_;
    }
    return com.google.cloud.pubsublite.proto.MessagePublishRequest.getDefaultInstance();
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
    if (requestTypeCase_ == 1) {
      output.writeMessage(
          1, (com.google.cloud.pubsublite.proto.InitialPublishRequest) requestType_);
    }
    if (requestTypeCase_ == 2) {
      output.writeMessage(
          2, (com.google.cloud.pubsublite.proto.MessagePublishRequest) requestType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requestTypeCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.pubsublite.proto.InitialPublishRequest) requestType_);
    }
    if (requestTypeCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.pubsublite.proto.MessagePublishRequest) requestType_);
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
    if (!(obj instanceof com.google.cloud.pubsublite.proto.PublishRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.pubsublite.proto.PublishRequest other =
        (com.google.cloud.pubsublite.proto.PublishRequest) obj;

    if (!getRequestTypeCase().equals(other.getRequestTypeCase())) return false;
    switch (requestTypeCase_) {
      case 1:
        if (!getInitialRequest().equals(other.getInitialRequest())) return false;
        break;
      case 2:
        if (!getMessagePublishRequest().equals(other.getMessagePublishRequest())) return false;
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
    switch (requestTypeCase_) {
      case 1:
        hash = (37 * hash) + INITIAL_REQUEST_FIELD_NUMBER;
        hash = (53 * hash) + getInitialRequest().hashCode();
        break;
      case 2:
        hash = (37 * hash) + MESSAGE_PUBLISH_REQUEST_FIELD_NUMBER;
        hash = (53 * hash) + getMessagePublishRequest().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.pubsublite.proto.PublishRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.PublishRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.PublishRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.PublishRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.PublishRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.PublishRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.PublishRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.PublishRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.PublishRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.PublishRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.PublishRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.PublishRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.pubsublite.proto.PublishRequest prototype) {
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
   * Request sent from the client to the server on a stream.
   * </pre>
   *
   * Protobuf type {@code google.cloud.pubsublite.v1.PublishRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.pubsublite.v1.PublishRequest)
      com.google.cloud.pubsublite.proto.PublishRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.pubsublite.proto.PublisherProto
          .internal_static_google_cloud_pubsublite_v1_PublishRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.pubsublite.proto.PublisherProto
          .internal_static_google_cloud_pubsublite_v1_PublishRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.pubsublite.proto.PublishRequest.class,
              com.google.cloud.pubsublite.proto.PublishRequest.Builder.class);
    }

    // Construct using com.google.cloud.pubsublite.proto.PublishRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (initialRequestBuilder_ != null) {
        initialRequestBuilder_.clear();
      }
      if (messagePublishRequestBuilder_ != null) {
        messagePublishRequestBuilder_.clear();
      }
      requestTypeCase_ = 0;
      requestType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.pubsublite.proto.PublisherProto
          .internal_static_google_cloud_pubsublite_v1_PublishRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.PublishRequest getDefaultInstanceForType() {
      return com.google.cloud.pubsublite.proto.PublishRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.PublishRequest build() {
      com.google.cloud.pubsublite.proto.PublishRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.PublishRequest buildPartial() {
      com.google.cloud.pubsublite.proto.PublishRequest result =
          new com.google.cloud.pubsublite.proto.PublishRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.pubsublite.proto.PublishRequest result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.pubsublite.proto.PublishRequest result) {
      result.requestTypeCase_ = requestTypeCase_;
      result.requestType_ = this.requestType_;
      if (requestTypeCase_ == 1 && initialRequestBuilder_ != null) {
        result.requestType_ = initialRequestBuilder_.build();
      }
      if (requestTypeCase_ == 2 && messagePublishRequestBuilder_ != null) {
        result.requestType_ = messagePublishRequestBuilder_.build();
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
      if (other instanceof com.google.cloud.pubsublite.proto.PublishRequest) {
        return mergeFrom((com.google.cloud.pubsublite.proto.PublishRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.pubsublite.proto.PublishRequest other) {
      if (other == com.google.cloud.pubsublite.proto.PublishRequest.getDefaultInstance())
        return this;
      switch (other.getRequestTypeCase()) {
        case INITIAL_REQUEST:
          {
            mergeInitialRequest(other.getInitialRequest());
            break;
          }
        case MESSAGE_PUBLISH_REQUEST:
          {
            mergeMessagePublishRequest(other.getMessagePublishRequest());
            break;
          }
        case REQUESTTYPE_NOT_SET:
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
                input.readMessage(getInitialRequestFieldBuilder().getBuilder(), extensionRegistry);
                requestTypeCase_ = 1;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getMessagePublishRequestFieldBuilder().getBuilder(), extensionRegistry);
                requestTypeCase_ = 2;
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

    private int requestTypeCase_ = 0;
    private java.lang.Object requestType_;

    public RequestTypeCase getRequestTypeCase() {
      return RequestTypeCase.forNumber(requestTypeCase_);
    }

    public Builder clearRequestType() {
      requestTypeCase_ = 0;
      requestType_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.InitialPublishRequest,
            com.google.cloud.pubsublite.proto.InitialPublishRequest.Builder,
            com.google.cloud.pubsublite.proto.InitialPublishRequestOrBuilder>
        initialRequestBuilder_;
    /**
     *
     *
     * <pre>
     * Initial request on the stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.InitialPublishRequest initial_request = 1;</code>
     *
     * @return Whether the initialRequest field is set.
     */
    @java.lang.Override
    public boolean hasInitialRequest() {
      return requestTypeCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Initial request on the stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.InitialPublishRequest initial_request = 1;</code>
     *
     * @return The initialRequest.
     */
    @java.lang.Override
    public com.google.cloud.pubsublite.proto.InitialPublishRequest getInitialRequest() {
      if (initialRequestBuilder_ == null) {
        if (requestTypeCase_ == 1) {
          return (com.google.cloud.pubsublite.proto.InitialPublishRequest) requestType_;
        }
        return com.google.cloud.pubsublite.proto.InitialPublishRequest.getDefaultInstance();
      } else {
        if (requestTypeCase_ == 1) {
          return initialRequestBuilder_.getMessage();
        }
        return com.google.cloud.pubsublite.proto.InitialPublishRequest.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Initial request on the stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.InitialPublishRequest initial_request = 1;</code>
     */
    public Builder setInitialRequest(
        com.google.cloud.pubsublite.proto.InitialPublishRequest value) {
      if (initialRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        requestType_ = value;
        onChanged();
      } else {
        initialRequestBuilder_.setMessage(value);
      }
      requestTypeCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Initial request on the stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.InitialPublishRequest initial_request = 1;</code>
     */
    public Builder setInitialRequest(
        com.google.cloud.pubsublite.proto.InitialPublishRequest.Builder builderForValue) {
      if (initialRequestBuilder_ == null) {
        requestType_ = builderForValue.build();
        onChanged();
      } else {
        initialRequestBuilder_.setMessage(builderForValue.build());
      }
      requestTypeCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Initial request on the stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.InitialPublishRequest initial_request = 1;</code>
     */
    public Builder mergeInitialRequest(
        com.google.cloud.pubsublite.proto.InitialPublishRequest value) {
      if (initialRequestBuilder_ == null) {
        if (requestTypeCase_ == 1
            && requestType_
                != com.google.cloud.pubsublite.proto.InitialPublishRequest.getDefaultInstance()) {
          requestType_ =
              com.google.cloud.pubsublite.proto.InitialPublishRequest.newBuilder(
                      (com.google.cloud.pubsublite.proto.InitialPublishRequest) requestType_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          requestType_ = value;
        }
        onChanged();
      } else {
        if (requestTypeCase_ == 1) {
          initialRequestBuilder_.mergeFrom(value);
        } else {
          initialRequestBuilder_.setMessage(value);
        }
      }
      requestTypeCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Initial request on the stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.InitialPublishRequest initial_request = 1;</code>
     */
    public Builder clearInitialRequest() {
      if (initialRequestBuilder_ == null) {
        if (requestTypeCase_ == 1) {
          requestTypeCase_ = 0;
          requestType_ = null;
          onChanged();
        }
      } else {
        if (requestTypeCase_ == 1) {
          requestTypeCase_ = 0;
          requestType_ = null;
        }
        initialRequestBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Initial request on the stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.InitialPublishRequest initial_request = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.InitialPublishRequest.Builder
        getInitialRequestBuilder() {
      return getInitialRequestFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Initial request on the stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.InitialPublishRequest initial_request = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.pubsublite.proto.InitialPublishRequestOrBuilder
        getInitialRequestOrBuilder() {
      if ((requestTypeCase_ == 1) && (initialRequestBuilder_ != null)) {
        return initialRequestBuilder_.getMessageOrBuilder();
      } else {
        if (requestTypeCase_ == 1) {
          return (com.google.cloud.pubsublite.proto.InitialPublishRequest) requestType_;
        }
        return com.google.cloud.pubsublite.proto.InitialPublishRequest.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Initial request on the stream.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.InitialPublishRequest initial_request = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.InitialPublishRequest,
            com.google.cloud.pubsublite.proto.InitialPublishRequest.Builder,
            com.google.cloud.pubsublite.proto.InitialPublishRequestOrBuilder>
        getInitialRequestFieldBuilder() {
      if (initialRequestBuilder_ == null) {
        if (!(requestTypeCase_ == 1)) {
          requestType_ =
              com.google.cloud.pubsublite.proto.InitialPublishRequest.getDefaultInstance();
        }
        initialRequestBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.pubsublite.proto.InitialPublishRequest,
                com.google.cloud.pubsublite.proto.InitialPublishRequest.Builder,
                com.google.cloud.pubsublite.proto.InitialPublishRequestOrBuilder>(
                (com.google.cloud.pubsublite.proto.InitialPublishRequest) requestType_,
                getParentForChildren(),
                isClean());
        requestType_ = null;
      }
      requestTypeCase_ = 1;
      onChanged();
      return initialRequestBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.MessagePublishRequest,
            com.google.cloud.pubsublite.proto.MessagePublishRequest.Builder,
            com.google.cloud.pubsublite.proto.MessagePublishRequestOrBuilder>
        messagePublishRequestBuilder_;
    /**
     *
     *
     * <pre>
     * Request to publish messages.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.MessagePublishRequest message_publish_request = 2;</code>
     *
     * @return Whether the messagePublishRequest field is set.
     */
    @java.lang.Override
    public boolean hasMessagePublishRequest() {
      return requestTypeCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Request to publish messages.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.MessagePublishRequest message_publish_request = 2;</code>
     *
     * @return The messagePublishRequest.
     */
    @java.lang.Override
    public com.google.cloud.pubsublite.proto.MessagePublishRequest getMessagePublishRequest() {
      if (messagePublishRequestBuilder_ == null) {
        if (requestTypeCase_ == 2) {
          return (com.google.cloud.pubsublite.proto.MessagePublishRequest) requestType_;
        }
        return com.google.cloud.pubsublite.proto.MessagePublishRequest.getDefaultInstance();
      } else {
        if (requestTypeCase_ == 2) {
          return messagePublishRequestBuilder_.getMessage();
        }
        return com.google.cloud.pubsublite.proto.MessagePublishRequest.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Request to publish messages.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.MessagePublishRequest message_publish_request = 2;</code>
     */
    public Builder setMessagePublishRequest(
        com.google.cloud.pubsublite.proto.MessagePublishRequest value) {
      if (messagePublishRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        requestType_ = value;
        onChanged();
      } else {
        messagePublishRequestBuilder_.setMessage(value);
      }
      requestTypeCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Request to publish messages.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.MessagePublishRequest message_publish_request = 2;</code>
     */
    public Builder setMessagePublishRequest(
        com.google.cloud.pubsublite.proto.MessagePublishRequest.Builder builderForValue) {
      if (messagePublishRequestBuilder_ == null) {
        requestType_ = builderForValue.build();
        onChanged();
      } else {
        messagePublishRequestBuilder_.setMessage(builderForValue.build());
      }
      requestTypeCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Request to publish messages.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.MessagePublishRequest message_publish_request = 2;</code>
     */
    public Builder mergeMessagePublishRequest(
        com.google.cloud.pubsublite.proto.MessagePublishRequest value) {
      if (messagePublishRequestBuilder_ == null) {
        if (requestTypeCase_ == 2
            && requestType_
                != com.google.cloud.pubsublite.proto.MessagePublishRequest.getDefaultInstance()) {
          requestType_ =
              com.google.cloud.pubsublite.proto.MessagePublishRequest.newBuilder(
                      (com.google.cloud.pubsublite.proto.MessagePublishRequest) requestType_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          requestType_ = value;
        }
        onChanged();
      } else {
        if (requestTypeCase_ == 2) {
          messagePublishRequestBuilder_.mergeFrom(value);
        } else {
          messagePublishRequestBuilder_.setMessage(value);
        }
      }
      requestTypeCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Request to publish messages.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.MessagePublishRequest message_publish_request = 2;</code>
     */
    public Builder clearMessagePublishRequest() {
      if (messagePublishRequestBuilder_ == null) {
        if (requestTypeCase_ == 2) {
          requestTypeCase_ = 0;
          requestType_ = null;
          onChanged();
        }
      } else {
        if (requestTypeCase_ == 2) {
          requestTypeCase_ = 0;
          requestType_ = null;
        }
        messagePublishRequestBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Request to publish messages.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.MessagePublishRequest message_publish_request = 2;</code>
     */
    public com.google.cloud.pubsublite.proto.MessagePublishRequest.Builder
        getMessagePublishRequestBuilder() {
      return getMessagePublishRequestFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Request to publish messages.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.MessagePublishRequest message_publish_request = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.pubsublite.proto.MessagePublishRequestOrBuilder
        getMessagePublishRequestOrBuilder() {
      if ((requestTypeCase_ == 2) && (messagePublishRequestBuilder_ != null)) {
        return messagePublishRequestBuilder_.getMessageOrBuilder();
      } else {
        if (requestTypeCase_ == 2) {
          return (com.google.cloud.pubsublite.proto.MessagePublishRequest) requestType_;
        }
        return com.google.cloud.pubsublite.proto.MessagePublishRequest.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Request to publish messages.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.MessagePublishRequest message_publish_request = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.MessagePublishRequest,
            com.google.cloud.pubsublite.proto.MessagePublishRequest.Builder,
            com.google.cloud.pubsublite.proto.MessagePublishRequestOrBuilder>
        getMessagePublishRequestFieldBuilder() {
      if (messagePublishRequestBuilder_ == null) {
        if (!(requestTypeCase_ == 2)) {
          requestType_ =
              com.google.cloud.pubsublite.proto.MessagePublishRequest.getDefaultInstance();
        }
        messagePublishRequestBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.pubsublite.proto.MessagePublishRequest,
                com.google.cloud.pubsublite.proto.MessagePublishRequest.Builder,
                com.google.cloud.pubsublite.proto.MessagePublishRequestOrBuilder>(
                (com.google.cloud.pubsublite.proto.MessagePublishRequest) requestType_,
                getParentForChildren(),
                isClean());
        requestType_ = null;
      }
      requestTypeCase_ = 2;
      onChanged();
      return messagePublishRequestBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.pubsublite.v1.PublishRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.PublishRequest)
  private static final com.google.cloud.pubsublite.proto.PublishRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.pubsublite.proto.PublishRequest();
  }

  public static com.google.cloud.pubsublite.proto.PublishRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublishRequest> PARSER =
      new com.google.protobuf.AbstractParser<PublishRequest>() {
        @java.lang.Override
        public PublishRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<PublishRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublishRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.pubsublite.proto.PublishRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
