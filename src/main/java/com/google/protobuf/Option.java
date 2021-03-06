// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/type.proto

package com.google.protobuf;

/**
 * <pre>
 * A protocol buffer option, which can be attached to a message, field,
 * enumeration, etc.
 * </pre>
 *
 * Protobuf type {@code google.protobuf.Option}
 */
public  final class Option extends
    com.google.protobuf.GeneratedMessageLite<
        Option, Option.Builder> implements
    // @@protoc_insertion_point(message_implements:google.protobuf.Option)
    OptionOrBuilder {
  private Option() {
    name_ = "";
  }
  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.String name_;
  /**
   * <pre>
   * The option's name. For example, `"java_package"`.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * The option's name. For example, `"java_package"`.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * The option's name. For example, `"java_package"`.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  private void setName(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    name_ = value;
  }
  /**
   * <pre>
   * The option's name. For example, `"java_package"`.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  private void clearName() {
    
    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * The option's name. For example, `"java_package"`.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    name_ = value.toStringUtf8();
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.google.protobuf.Any value_;
  /**
   * <pre>
   * The option's value. For example, `"com.google.protobuf"`.
   * </pre>
   *
   * <code>optional .google.protobuf.Any value = 2;</code>
   */
  public boolean hasValue() {
    return value_ != null;
  }
  /**
   * <pre>
   * The option's value. For example, `"com.google.protobuf"`.
   * </pre>
   *
   * <code>optional .google.protobuf.Any value = 2;</code>
   */
  public com.google.protobuf.Any getValue() {
    return value_ == null ? com.google.protobuf.Any.getDefaultInstance() : value_;
  }
  /**
   * <pre>
   * The option's value. For example, `"com.google.protobuf"`.
   * </pre>
   *
   * <code>optional .google.protobuf.Any value = 2;</code>
   */
  private void setValue(com.google.protobuf.Any value) {
    if (value == null) {
      throw new NullPointerException();
    }
    value_ = value;
    
    }
  /**
   * <pre>
   * The option's value. For example, `"com.google.protobuf"`.
   * </pre>
   *
   * <code>optional .google.protobuf.Any value = 2;</code>
   */
  private void setValue(
      com.google.protobuf.Any.Builder builderForValue) {
    value_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * The option's value. For example, `"com.google.protobuf"`.
   * </pre>
   *
   * <code>optional .google.protobuf.Any value = 2;</code>
   */
  private void mergeValue(com.google.protobuf.Any value) {
    if (value_ != null &&
        value_ != com.google.protobuf.Any.getDefaultInstance()) {
      value_ =
        com.google.protobuf.Any.newBuilder(value_).mergeFrom(value).buildPartial();
    } else {
      value_ = value;
    }
    
  }
  /**
   * <pre>
   * The option's value. For example, `"com.google.protobuf"`.
   * </pre>
   *
   * <code>optional .google.protobuf.Any value = 2;</code>
   */
  private void clearValue() {  value_ = null;
    
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!name_.isEmpty()) {
      output.writeString(1, getName());
    }
    if (value_ != null) {
      output.writeMessage(2, getValue());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!name_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getName());
    }
    if (value_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValue());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.protobuf.Option parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Option parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Option parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Option parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Option parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Option parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.protobuf.Option parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Option parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.protobuf.Option parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Option parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.protobuf.Option prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * A protocol buffer option, which can be attached to a message, field,
   * enumeration, etc.
   * </pre>
   *
   * Protobuf type {@code google.protobuf.Option}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.protobuf.Option, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.Option)
      com.google.protobuf.OptionOrBuilder {
    // Construct using com.google.protobuf.Option.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The option's name. For example, `"java_package"`.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * The option's name. For example, `"java_package"`.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * The option's name. For example, `"java_package"`.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <pre>
     * The option's name. For example, `"java_package"`.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * The option's name. For example, `"java_package"`.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <pre>
     * The option's value. For example, `"com.google.protobuf"`.
     * </pre>
     *
     * <code>optional .google.protobuf.Any value = 2;</code>
     */
    public boolean hasValue() {
      return instance.hasValue();
    }
    /**
     * <pre>
     * The option's value. For example, `"com.google.protobuf"`.
     * </pre>
     *
     * <code>optional .google.protobuf.Any value = 2;</code>
     */
    public com.google.protobuf.Any getValue() {
      return instance.getValue();
    }
    /**
     * <pre>
     * The option's value. For example, `"com.google.protobuf"`.
     * </pre>
     *
     * <code>optional .google.protobuf.Any value = 2;</code>
     */
    public Builder setValue(com.google.protobuf.Any value) {
      copyOnWrite();
      instance.setValue(value);
      return this;
      }
    /**
     * <pre>
     * The option's value. For example, `"com.google.protobuf"`.
     * </pre>
     *
     * <code>optional .google.protobuf.Any value = 2;</code>
     */
    public Builder setValue(
        com.google.protobuf.Any.Builder builderForValue) {
      copyOnWrite();
      instance.setValue(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The option's value. For example, `"com.google.protobuf"`.
     * </pre>
     *
     * <code>optional .google.protobuf.Any value = 2;</code>
     */
    public Builder mergeValue(com.google.protobuf.Any value) {
      copyOnWrite();
      instance.mergeValue(value);
      return this;
    }
    /**
     * <pre>
     * The option's value. For example, `"com.google.protobuf"`.
     * </pre>
     *
     * <code>optional .google.protobuf.Any value = 2;</code>
     */
    public Builder clearValue() {  copyOnWrite();
      instance.clearValue();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.protobuf.Option)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.protobuf.Option();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.google.protobuf.Option other = (com.google.protobuf.Option) arg1;
        name_ = visitor.visitString(!name_.isEmpty(), name_,
            !other.name_.isEmpty(), other.name_);
        value_ = visitor.visitMessage(value_, other.value_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readStringRequireUtf8();

                name_ = s;
                break;
              }
              case 18: {
                com.google.protobuf.Any.Builder subBuilder = null;
                if (value_ != null) {
                  subBuilder = value_.toBuilder();
                }
                value_ = input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(value_);
                  value_ = subBuilder.buildPartial();
                }

                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.google.protobuf.Option.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.protobuf.Option)
  private static final com.google.protobuf.Option DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Option();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.protobuf.Option getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Option> PARSER;

  public static com.google.protobuf.Parser<Option> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

