// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Transaction.proto

package com.giffgaff.kafkalab.generated;

public final class TransactionPayload {
  private TransactionPayload() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code TransactionType}
   */
  public enum TransactionType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CARD = 0;</code>
     */
    CARD(0),
    /**
     * <code>BANK_TRANSFER = 1;</code>
     */
    BANK_TRANSFER(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CARD = 0;</code>
     */
    public static final int CARD_VALUE = 0;
    /**
     * <code>BANK_TRANSFER = 1;</code>
     */
    public static final int BANK_TRANSFER_VALUE = 1;


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
    public static TransactionType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TransactionType forNumber(int value) {
      switch (value) {
        case 0: return CARD;
        case 1: return BANK_TRANSFER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TransactionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TransactionType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TransactionType>() {
            public TransactionType findValueByNumber(int number) {
              return TransactionType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.giffgaff.kafkalab.generated.TransactionPayload.getDescriptor().getEnumTypes().get(0);
    }

    private static final TransactionType[] VALUES = values();

    public static TransactionType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TransactionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:TransactionType)
  }

  /**
   * Protobuf enum {@code TransactionDirection}
   */
  public enum TransactionDirection
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DEBIT = 0;</code>
     */
    DEBIT(0),
    /**
     * <code>CREDIT = 1;</code>
     */
    CREDIT(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>DEBIT = 0;</code>
     */
    public static final int DEBIT_VALUE = 0;
    /**
     * <code>CREDIT = 1;</code>
     */
    public static final int CREDIT_VALUE = 1;


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
    public static TransactionDirection valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TransactionDirection forNumber(int value) {
      switch (value) {
        case 0: return DEBIT;
        case 1: return CREDIT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TransactionDirection>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TransactionDirection> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TransactionDirection>() {
            public TransactionDirection findValueByNumber(int number) {
              return TransactionDirection.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.giffgaff.kafkalab.generated.TransactionPayload.getDescriptor().getEnumTypes().get(1);
    }

    private static final TransactionDirection[] VALUES = values();

    public static TransactionDirection valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TransactionDirection(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:TransactionDirection)
  }

  public interface TransactionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Transaction)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 accountId = 1;</code>
     * @return The accountId.
     */
    int getAccountId();

    /**
     * <code>int32 amount = 2;</code>
     * @return The amount.
     */
    int getAmount();

    /**
     * <code>.TransactionType transactionType = 3;</code>
     * @return The enum numeric value on the wire for transactionType.
     */
    int getTransactionTypeValue();
    /**
     * <code>.TransactionType transactionType = 3;</code>
     * @return The transactionType.
     */
    com.giffgaff.kafkalab.generated.TransactionPayload.TransactionType getTransactionType();

    /**
     * <code>.TransactionDirection transactionDirection = 4;</code>
     * @return The enum numeric value on the wire for transactionDirection.
     */
    int getTransactionDirectionValue();
    /**
     * <code>.TransactionDirection transactionDirection = 4;</code>
     * @return The transactionDirection.
     */
    com.giffgaff.kafkalab.generated.TransactionPayload.TransactionDirection getTransactionDirection();
  }
  /**
   * Protobuf type {@code Transaction}
   */
  public  static final class Transaction extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Transaction)
      TransactionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Transaction.newBuilder() to construct.
    private Transaction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Transaction() {
      transactionType_ = 0;
      transactionDirection_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Transaction();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Transaction(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              accountId_ = input.readInt32();
              break;
            }
            case 16: {

              amount_ = input.readInt32();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              transactionType_ = rawValue;
              break;
            }
            case 32: {
              int rawValue = input.readEnum();

              transactionDirection_ = rawValue;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.giffgaff.kafkalab.generated.TransactionPayload.internal_static_Transaction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.giffgaff.kafkalab.generated.TransactionPayload.internal_static_Transaction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.giffgaff.kafkalab.generated.TransactionPayload.Transaction.class, com.giffgaff.kafkalab.generated.TransactionPayload.Transaction.Builder.class);
    }

    public static final int ACCOUNTID_FIELD_NUMBER = 1;
    private int accountId_;
    /**
     * <code>int32 accountId = 1;</code>
     * @return The accountId.
     */
    public int getAccountId() {
      return accountId_;
    }

    public static final int AMOUNT_FIELD_NUMBER = 2;
    private int amount_;
    /**
     * <code>int32 amount = 2;</code>
     * @return The amount.
     */
    public int getAmount() {
      return amount_;
    }

    public static final int TRANSACTIONTYPE_FIELD_NUMBER = 3;
    private int transactionType_;
    /**
     * <code>.TransactionType transactionType = 3;</code>
     * @return The enum numeric value on the wire for transactionType.
     */
    public int getTransactionTypeValue() {
      return transactionType_;
    }
    /**
     * <code>.TransactionType transactionType = 3;</code>
     * @return The transactionType.
     */
    public com.giffgaff.kafkalab.generated.TransactionPayload.TransactionType getTransactionType() {
      @SuppressWarnings("deprecation")
      com.giffgaff.kafkalab.generated.TransactionPayload.TransactionType result = com.giffgaff.kafkalab.generated.TransactionPayload.TransactionType.valueOf(transactionType_);
      return result == null ? com.giffgaff.kafkalab.generated.TransactionPayload.TransactionType.UNRECOGNIZED : result;
    }

    public static final int TRANSACTIONDIRECTION_FIELD_NUMBER = 4;
    private int transactionDirection_;
    /**
     * <code>.TransactionDirection transactionDirection = 4;</code>
     * @return The enum numeric value on the wire for transactionDirection.
     */
    public int getTransactionDirectionValue() {
      return transactionDirection_;
    }
    /**
     * <code>.TransactionDirection transactionDirection = 4;</code>
     * @return The transactionDirection.
     */
    public com.giffgaff.kafkalab.generated.TransactionPayload.TransactionDirection getTransactionDirection() {
      @SuppressWarnings("deprecation")
      com.giffgaff.kafkalab.generated.TransactionPayload.TransactionDirection result = com.giffgaff.kafkalab.generated.TransactionPayload.TransactionDirection.valueOf(transactionDirection_);
      return result == null ? com.giffgaff.kafkalab.generated.TransactionPayload.TransactionDirection.UNRECOGNIZED : result;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (accountId_ != 0) {
        output.writeInt32(1, accountId_);
      }
      if (amount_ != 0) {
        output.writeInt32(2, amount_);
      }
      if (transactionType_ != com.giffgaff.kafkalab.generated.TransactionPayload.TransactionType.CARD.getNumber()) {
        output.writeEnum(3, transactionType_);
      }
      if (transactionDirection_ != com.giffgaff.kafkalab.generated.TransactionPayload.TransactionDirection.DEBIT.getNumber()) {
        output.writeEnum(4, transactionDirection_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (accountId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, accountId_);
      }
      if (amount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, amount_);
      }
      if (transactionType_ != com.giffgaff.kafkalab.generated.TransactionPayload.TransactionType.CARD.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, transactionType_);
      }
      if (transactionDirection_ != com.giffgaff.kafkalab.generated.TransactionPayload.TransactionDirection.DEBIT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, transactionDirection_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.giffgaff.kafkalab.generated.TransactionPayload.Transaction)) {
        return super.equals(obj);
      }
      com.giffgaff.kafkalab.generated.TransactionPayload.Transaction other = (com.giffgaff.kafkalab.generated.TransactionPayload.Transaction) obj;

      if (getAccountId()
          != other.getAccountId()) return false;
      if (getAmount()
          != other.getAmount()) return false;
      if (transactionType_ != other.transactionType_) return false;
      if (transactionDirection_ != other.transactionDirection_) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ACCOUNTID_FIELD_NUMBER;
      hash = (53 * hash) + getAccountId();
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAmount();
      hash = (37 * hash) + TRANSACTIONTYPE_FIELD_NUMBER;
      hash = (53 * hash) + transactionType_;
      hash = (37 * hash) + TRANSACTIONDIRECTION_FIELD_NUMBER;
      hash = (53 * hash) + transactionDirection_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.giffgaff.kafkalab.generated.TransactionPayload.Transaction parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.giffgaff.kafkalab.generated.TransactionPayload.Transaction parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.giffgaff.kafkalab.generated.TransactionPayload.Transaction parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.giffgaff.kafkalab.generated.TransactionPayload.Transaction parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.giffgaff.kafkalab.generated.TransactionPayload.Transaction parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.giffgaff.kafkalab.generated.TransactionPayload.Transaction parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.giffgaff.kafkalab.generated.TransactionPayload.Transaction parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.giffgaff.kafkalab.generated.TransactionPayload.Transaction parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.giffgaff.kafkalab.generated.TransactionPayload.Transaction parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.giffgaff.kafkalab.generated.TransactionPayload.Transaction parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.giffgaff.kafkalab.generated.TransactionPayload.Transaction parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.giffgaff.kafkalab.generated.TransactionPayload.Transaction parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.giffgaff.kafkalab.generated.TransactionPayload.Transaction prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Transaction}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Transaction)
        com.giffgaff.kafkalab.generated.TransactionPayload.TransactionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.giffgaff.kafkalab.generated.TransactionPayload.internal_static_Transaction_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.giffgaff.kafkalab.generated.TransactionPayload.internal_static_Transaction_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.giffgaff.kafkalab.generated.TransactionPayload.Transaction.class, com.giffgaff.kafkalab.generated.TransactionPayload.Transaction.Builder.class);
      }

      // Construct using com.giffgaff.kafkalab.generated.TransactionPayload.Transaction.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        accountId_ = 0;

        amount_ = 0;

        transactionType_ = 0;

        transactionDirection_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.giffgaff.kafkalab.generated.TransactionPayload.internal_static_Transaction_descriptor;
      }

      @java.lang.Override
      public com.giffgaff.kafkalab.generated.TransactionPayload.Transaction getDefaultInstanceForType() {
        return com.giffgaff.kafkalab.generated.TransactionPayload.Transaction.getDefaultInstance();
      }

      @java.lang.Override
      public com.giffgaff.kafkalab.generated.TransactionPayload.Transaction build() {
        com.giffgaff.kafkalab.generated.TransactionPayload.Transaction result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.giffgaff.kafkalab.generated.TransactionPayload.Transaction buildPartial() {
        com.giffgaff.kafkalab.generated.TransactionPayload.Transaction result = new com.giffgaff.kafkalab.generated.TransactionPayload.Transaction(this);
        result.accountId_ = accountId_;
        result.amount_ = amount_;
        result.transactionType_ = transactionType_;
        result.transactionDirection_ = transactionDirection_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.giffgaff.kafkalab.generated.TransactionPayload.Transaction) {
          return mergeFrom((com.giffgaff.kafkalab.generated.TransactionPayload.Transaction)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.giffgaff.kafkalab.generated.TransactionPayload.Transaction other) {
        if (other == com.giffgaff.kafkalab.generated.TransactionPayload.Transaction.getDefaultInstance()) return this;
        if (other.getAccountId() != 0) {
          setAccountId(other.getAccountId());
        }
        if (other.getAmount() != 0) {
          setAmount(other.getAmount());
        }
        if (other.transactionType_ != 0) {
          setTransactionTypeValue(other.getTransactionTypeValue());
        }
        if (other.transactionDirection_ != 0) {
          setTransactionDirectionValue(other.getTransactionDirectionValue());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        com.giffgaff.kafkalab.generated.TransactionPayload.Transaction parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.giffgaff.kafkalab.generated.TransactionPayload.Transaction) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int accountId_ ;
      /**
       * <code>int32 accountId = 1;</code>
       * @return The accountId.
       */
      public int getAccountId() {
        return accountId_;
      }
      /**
       * <code>int32 accountId = 1;</code>
       * @param value The accountId to set.
       * @return This builder for chaining.
       */
      public Builder setAccountId(int value) {
        
        accountId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 accountId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAccountId() {
        
        accountId_ = 0;
        onChanged();
        return this;
      }

      private int amount_ ;
      /**
       * <code>int32 amount = 2;</code>
       * @return The amount.
       */
      public int getAmount() {
        return amount_;
      }
      /**
       * <code>int32 amount = 2;</code>
       * @param value The amount to set.
       * @return This builder for chaining.
       */
      public Builder setAmount(int value) {
        
        amount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 amount = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAmount() {
        
        amount_ = 0;
        onChanged();
        return this;
      }

      private int transactionType_ = 0;
      /**
       * <code>.TransactionType transactionType = 3;</code>
       * @return The enum numeric value on the wire for transactionType.
       */
      public int getTransactionTypeValue() {
        return transactionType_;
      }
      /**
       * <code>.TransactionType transactionType = 3;</code>
       * @param value The enum numeric value on the wire for transactionType to set.
       * @return This builder for chaining.
       */
      public Builder setTransactionTypeValue(int value) {
        transactionType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.TransactionType transactionType = 3;</code>
       * @return The transactionType.
       */
      public com.giffgaff.kafkalab.generated.TransactionPayload.TransactionType getTransactionType() {
        @SuppressWarnings("deprecation")
        com.giffgaff.kafkalab.generated.TransactionPayload.TransactionType result = com.giffgaff.kafkalab.generated.TransactionPayload.TransactionType.valueOf(transactionType_);
        return result == null ? com.giffgaff.kafkalab.generated.TransactionPayload.TransactionType.UNRECOGNIZED : result;
      }
      /**
       * <code>.TransactionType transactionType = 3;</code>
       * @param value The transactionType to set.
       * @return This builder for chaining.
       */
      public Builder setTransactionType(com.giffgaff.kafkalab.generated.TransactionPayload.TransactionType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        transactionType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.TransactionType transactionType = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTransactionType() {
        
        transactionType_ = 0;
        onChanged();
        return this;
      }

      private int transactionDirection_ = 0;
      /**
       * <code>.TransactionDirection transactionDirection = 4;</code>
       * @return The enum numeric value on the wire for transactionDirection.
       */
      public int getTransactionDirectionValue() {
        return transactionDirection_;
      }
      /**
       * <code>.TransactionDirection transactionDirection = 4;</code>
       * @param value The enum numeric value on the wire for transactionDirection to set.
       * @return This builder for chaining.
       */
      public Builder setTransactionDirectionValue(int value) {
        transactionDirection_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.TransactionDirection transactionDirection = 4;</code>
       * @return The transactionDirection.
       */
      public com.giffgaff.kafkalab.generated.TransactionPayload.TransactionDirection getTransactionDirection() {
        @SuppressWarnings("deprecation")
        com.giffgaff.kafkalab.generated.TransactionPayload.TransactionDirection result = com.giffgaff.kafkalab.generated.TransactionPayload.TransactionDirection.valueOf(transactionDirection_);
        return result == null ? com.giffgaff.kafkalab.generated.TransactionPayload.TransactionDirection.UNRECOGNIZED : result;
      }
      /**
       * <code>.TransactionDirection transactionDirection = 4;</code>
       * @param value The transactionDirection to set.
       * @return This builder for chaining.
       */
      public Builder setTransactionDirection(com.giffgaff.kafkalab.generated.TransactionPayload.TransactionDirection value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        transactionDirection_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.TransactionDirection transactionDirection = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTransactionDirection() {
        
        transactionDirection_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Transaction)
    }

    // @@protoc_insertion_point(class_scope:Transaction)
    private static final com.giffgaff.kafkalab.generated.TransactionPayload.Transaction DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.giffgaff.kafkalab.generated.TransactionPayload.Transaction();
    }

    public static com.giffgaff.kafkalab.generated.TransactionPayload.Transaction getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Transaction>
        PARSER = new com.google.protobuf.AbstractParser<Transaction>() {
      @java.lang.Override
      public Transaction parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Transaction(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Transaction> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Transaction> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.giffgaff.kafkalab.generated.TransactionPayload.Transaction getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Transaction_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Transaction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021Transaction.proto\"\220\001\n\013Transaction\022\021\n\ta" +
      "ccountId\030\001 \001(\005\022\016\n\006amount\030\002 \001(\005\022)\n\017transa" +
      "ctionType\030\003 \001(\0162\020.TransactionType\0223\n\024tra" +
      "nsactionDirection\030\004 \001(\0162\025.TransactionDir" +
      "ection*.\n\017TransactionType\022\010\n\004CARD\020\000\022\021\n\rB" +
      "ANK_TRANSFER\020\001*-\n\024TransactionDirection\022\t" +
      "\n\005DEBIT\020\000\022\n\n\006CREDIT\020\001B5\n\037com.giffgaff.ka" +
      "fkalab.generatedB\022TransactionPayloadb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Transaction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Transaction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Transaction_descriptor,
        new java.lang.String[] { "AccountId", "Amount", "TransactionType", "TransactionDirection", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}