// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.google.googlex.glass.common.proto;

@SuppressWarnings("hiding")
public interface TimelineNano {
  
  // enum SourceType
  public interface SourceType {
    public static final int GLASSWARE = 0;
    public static final int GLASS_DEVICE = 1;
    public static final int COMPANIONWARE = 2;
  }
  
  public static final class TimelineItem extends
      com.google.protobuf.nano.MessageNano {
    
    public static final TimelineItem[] EMPTY_ARRAY = {};
    
    public TimelineItem() {
      clear();
    }
    
    // optional string id = 1;
    public java.lang.String id;
    
    // optional uint64 creationTime = 2;
    public java.lang.Long creationTime;
    
    // optional uint64 modifiedTime = 3;
    public java.lang.Long modifiedTime;
    
    // optional string source = 4;
    public java.lang.String source;
    
    // optional .TimelineNano.Entity creator = 5;
    public com.google.googlex.glass.common.proto.TimelineNano.Entity creator;
    
    // repeated .TimelineNano.Entity arrayOfEntity = 6;
    public com.google.googlex.glass.common.proto.TimelineNano.Entity[] arrayOfEntity;
    
    // optional string inReplyTo = 7;
    public java.lang.String inReplyTo;
    
    // optional string text = 8;
    public java.lang.String text;
    
    // optional .TimelineNano.SourceType sourceType = 14;
    public java.lang.Integer sourceType;
    
    // optional bool isDeleted = 15;
    public java.lang.Boolean isDeleted;
    
    // optional uint64 displayTime = 17;
    public java.lang.Long displayTime;
    
    // optional string speakableText = 19;
    public java.lang.String speakableText;
    
    // optional string title = 23;
    public java.lang.String title;
    
    // optional string html = 24;
    public java.lang.String html;
    
    public TimelineItem clear() {
      id = null;
      creationTime = null;
      modifiedTime = null;
      source = null;
      creator = null;
      arrayOfEntity = com.google.googlex.glass.common.proto.TimelineNano.Entity.EMPTY_ARRAY;
      inReplyTo = null;
      text = null;
      sourceType = null;
      isDeleted = null;
      displayTime = null;
      speakableText = null;
      title = null;
      html = null;
      cachedSize = -1;
      return this;
    }
    
    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof TimelineItem)) {
        return false;
      }
      TimelineItem other = (TimelineItem) o;
      if (this.id == null) {
        if (other.id != null) {
          return false;
        }
      } else if (!this.id.equals(other.id)) {
        return false;
      }
      if (this.creationTime == null) {
        if (other.creationTime != null) {
          return false;
        }
      } else if (!this.creationTime.equals(other.creationTime)) {
        return false;
      }
      if (this.modifiedTime == null) {
        if (other.modifiedTime != null) {
          return false;
        }
      } else if (!this.modifiedTime.equals(other.modifiedTime)) {
        return false;
      }
      if (this.source == null) {
        if (other.source != null) {
          return false;
        }
      } else if (!this.source.equals(other.source)) {
        return false;
      }
      if (this.creator == null) { 
        if (other.creator != null) {
          return false;
        }
      } else {
        if (!this.creator.equals(other.creator)) {
          return false;
        }
      }
      if (!com.google.protobuf.nano.InternalNano.equals(
          this.arrayOfEntity, other.arrayOfEntity)) {
        return false;
      }
      if (this.inReplyTo == null) {
        if (other.inReplyTo != null) {
          return false;
        }
      } else if (!this.inReplyTo.equals(other.inReplyTo)) {
        return false;
      }
      if (this.text == null) {
        if (other.text != null) {
          return false;
        }
      } else if (!this.text.equals(other.text)) {
        return false;
      }
      if (this.sourceType == null) {
        if (other.sourceType != null) {
          return false;
        }
      } else if (!this.sourceType.equals(other.sourceType)) {
        return false;}
      if (this.isDeleted == null) {
        if (other.isDeleted != null) {
          return false;
        }
      } else if (!this.isDeleted.equals(other.isDeleted)) {
        return false;
      }
      if (this.displayTime == null) {
        if (other.displayTime != null) {
          return false;
        }
      } else if (!this.displayTime.equals(other.displayTime)) {
        return false;
      }
      if (this.speakableText == null) {
        if (other.speakableText != null) {
          return false;
        }
      } else if (!this.speakableText.equals(other.speakableText)) {
        return false;
      }
      if (this.title == null) {
        if (other.title != null) {
          return false;
        }
      } else if (!this.title.equals(other.title)) {
        return false;
      }
      if (this.html == null) {
        if (other.html != null) {
          return false;
        }
      } else if (!this.html.equals(other.html)) {
        return false;
      }
      return true;
    }
    
    @Override
    public int hashCode() {
      int result = 17;
      result = 31 * result
          + (this.id == null ? 0 : this.id.hashCode());
      result = 31 * result
          + (this.creationTime == null ? 0 : this.creationTime.hashCode());
      result = 31 * result
          + (this.modifiedTime == null ? 0 : this.modifiedTime.hashCode());
      result = 31 * result
          + (this.source == null ? 0 : this.source.hashCode());
      result = 31 * result +
          (this.creator == null ? 0 : this.creator.hashCode());
      result = 31 * result
          + com.google.protobuf.nano.InternalNano.hashCode(this.arrayOfEntity);
      result = 31 * result
          + (this.inReplyTo == null ? 0 : this.inReplyTo.hashCode());
      result = 31 * result
          + (this.text == null ? 0 : this.text.hashCode());
      result = 31 * result + (this.sourceType == null ? 0 : this.sourceType);
      result = 31 * result
          + (this.isDeleted == null ? 0 : this.isDeleted.hashCode());
      result = 31 * result
          + (this.displayTime == null ? 0 : this.displayTime.hashCode());
      result = 31 * result
          + (this.speakableText == null ? 0 : this.speakableText.hashCode());
      result = 31 * result
          + (this.title == null ? 0 : this.title.hashCode());
      result = 31 * result
          + (this.html == null ? 0 : this.html.hashCode());
      return result;
    }
    
    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.id != null) {
        output.writeString(1, this.id);
      }
      if (this.creationTime != null) {
        output.writeUInt64(2, this.creationTime);
      }
      if (this.modifiedTime != null) {
        output.writeUInt64(3, this.modifiedTime);
      }
      if (this.source != null) {
        output.writeString(4, this.source);
      }
      if (this.creator != null) {
        output.writeMessage(5, this.creator);
      }
      if (this.arrayOfEntity != null && this.arrayOfEntity.length > 0) {
        for (int i = 0; i < this.arrayOfEntity.length; i++) {
          com.google.googlex.glass.common.proto.TimelineNano.Entity element = this.arrayOfEntity[i];
          if (element != null) {
            output.writeMessage(6, element);
          }
        }
      }
      if (this.inReplyTo != null) {
        output.writeString(7, this.inReplyTo);
      }
      if (this.text != null) {
        output.writeString(8, this.text);
      }
      if (this.sourceType != null) {
        output.writeInt32(14, this.sourceType);
      }
      if (this.isDeleted != null) {
        output.writeBool(15, this.isDeleted);
      }
      if (this.displayTime != null) {
        output.writeUInt64(17, this.displayTime);
      }
      if (this.speakableText != null) {
        output.writeString(19, this.speakableText);
      }
      if (this.title != null) {
        output.writeString(23, this.title);
      }
      if (this.html != null) {
        output.writeString(24, this.html);
      }
    }
    
    @Override
    public int getSerializedSize() {
      int size = super.getSerializedSize();
      if (this.id != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(1, this.id);
      }
      if (this.creationTime != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt64Size(2, this.creationTime);
      }
      if (this.modifiedTime != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt64Size(3, this.modifiedTime);
      }
      if (this.source != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(4, this.source);
      }
      if (this.creator != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeMessageSize(5, this.creator);
      }
      if (this.arrayOfEntity != null && this.arrayOfEntity.length > 0) {
        for (int i = 0; i < this.arrayOfEntity.length; i++) {
          com.google.googlex.glass.common.proto.TimelineNano.Entity element = this.arrayOfEntity[i];
          if (element != null) {
            size += com.google.protobuf.nano.CodedOutputByteBufferNano
              .computeMessageSize(6, element);
          }
        }
      }
      if (this.inReplyTo != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(7, this.inReplyTo);
      }
      if (this.text != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(8, this.text);
      }
      if (this.sourceType != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(14, this.sourceType);
      }
      if (this.isDeleted != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(15, this.isDeleted);
      }
      if (this.displayTime != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt64Size(17, this.displayTime);
      }
      if (this.speakableText != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(19, this.speakableText);
      }
      if (this.title != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(23, this.title);
      }
      if (this.html != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(24, this.html);
      }
      cachedSize = size;
      return size;
    }
    
    @Override
    public TimelineItem mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 10: {
            this.id = input.readString();
            break;
          }
          case 16: {
            this.creationTime = input.readUInt64();
            break;
          }
          case 24: {
            this.modifiedTime = input.readUInt64();
            break;
          }
          case 34: {
            this.source = input.readString();
            break;
          }
          case 42: {
            if (this.creator == null) {
              this.creator = new com.google.googlex.glass.common.proto.TimelineNano.Entity();
            }
            input.readMessage(this.creator);
            break;
          }
          case 50: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 50);
            int i = this.arrayOfEntity == null ? 0 : this.arrayOfEntity.length;
            com.google.googlex.glass.common.proto.TimelineNano.Entity[] newArray =
                new com.google.googlex.glass.common.proto.TimelineNano.Entity[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.arrayOfEntity, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = new com.google.googlex.glass.common.proto.TimelineNano.Entity();
              input.readMessage(newArray[i]);
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = new com.google.googlex.glass.common.proto.TimelineNano.Entity();
            input.readMessage(newArray[i]);
            this.arrayOfEntity = newArray;
            break;
          }
          case 58: {
            this.inReplyTo = input.readString();
            break;
          }
          case 66: {
            this.text = input.readString();
            break;
          }
          case 112: {
            this.sourceType = input.readInt32();
            break;
          }
          case 120: {
            this.isDeleted = input.readBool();
            break;
          }
          case 136: {
            this.displayTime = input.readUInt64();
            break;
          }
          case 154: {
            this.speakableText = input.readString();
            break;
          }
          case 186: {
            this.title = input.readString();
            break;
          }
          case 194: {
            this.html = input.readString();
            break;
          }
        }
      }
    }
    
    public static TimelineItem parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new TimelineItem(), data);
    }
    
    public static TimelineItem parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new TimelineItem().mergeFrom(input);
    }
  }
  
  public static final class Entity extends
      com.google.protobuf.nano.MessageNano {
    
    public static final Entity[] EMPTY_ARRAY = {};
    
    public Entity() {
      clear();
    }
    
    // optional string source = 1;
    public java.lang.String source;
    
    // optional string id = 2;
    public java.lang.String id;
    
    // optional string displayName = 3;
    public java.lang.String displayName;
    
    // optional bool shouldSync = 5;
    public java.lang.Boolean shouldSync;
    
    // optional int32 type = 6;
    public java.lang.Integer type;
    
    // optional string phoneNumber = 7;
    public java.lang.String phoneNumber;
    
    // optional string email = 8;
    public java.lang.String email;
    
    // repeated string acceptType = 9;
    public java.lang.String[] acceptType;
    
    // optional bool isCommunicationTarget = 10;
    public java.lang.Boolean isCommunicationTarget;
    
    // repeated string imageUrl = 12;
    public java.lang.String[] imageUrl;
    
    // repeated string secondaryPhoneNumber = 13;
    public java.lang.String[] secondaryPhoneNumber;
    
    // repeated string secondaryEmail = 15;
    public java.lang.String[] secondaryEmail;
    
    // repeated string acceptCommand = 16;
    public java.lang.String[] acceptCommand;
    
    // optional string speakableName = 17;
    public java.lang.String speakableName;
    
    // optional uint64 creationTime = 21;
    public java.lang.Long creationTime;
    
    // optional string nickname = 23;
    public java.lang.String nickname;
    
    // optional string fullname = 26;
    public java.lang.String fullname;
    
    public Entity clear() {
      source = null;
      id = null;
      displayName = null;
      shouldSync = null;
      type = null;
      phoneNumber = null;
      email = null;
      acceptType = com.google.protobuf.nano.WireFormatNano.EMPTY_STRING_ARRAY;
      isCommunicationTarget = null;
      imageUrl = com.google.protobuf.nano.WireFormatNano.EMPTY_STRING_ARRAY;
      secondaryPhoneNumber = com.google.protobuf.nano.WireFormatNano.EMPTY_STRING_ARRAY;
      secondaryEmail = com.google.protobuf.nano.WireFormatNano.EMPTY_STRING_ARRAY;
      acceptCommand = com.google.protobuf.nano.WireFormatNano.EMPTY_STRING_ARRAY;
      speakableName = null;
      creationTime = null;
      nickname = null;
      fullname = null;
      cachedSize = -1;
      return this;
    }
    
    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof Entity)) {
        return false;
      }
      Entity other = (Entity) o;
      if (this.source == null) {
        if (other.source != null) {
          return false;
        }
      } else if (!this.source.equals(other.source)) {
        return false;
      }
      if (this.id == null) {
        if (other.id != null) {
          return false;
        }
      } else if (!this.id.equals(other.id)) {
        return false;
      }
      if (this.displayName == null) {
        if (other.displayName != null) {
          return false;
        }
      } else if (!this.displayName.equals(other.displayName)) {
        return false;
      }
      if (this.shouldSync == null) {
        if (other.shouldSync != null) {
          return false;
        }
      } else if (!this.shouldSync.equals(other.shouldSync)) {
        return false;
      }
      if (this.type == null) {
        if (other.type != null) {
          return false;
        }
      } else if (!this.type.equals(other.type)) {
        return false;
      }
      if (this.phoneNumber == null) {
        if (other.phoneNumber != null) {
          return false;
        }
      } else if (!this.phoneNumber.equals(other.phoneNumber)) {
        return false;
      }
      if (this.email == null) {
        if (other.email != null) {
          return false;
        }
      } else if (!this.email.equals(other.email)) {
        return false;
      }
      if (!com.google.protobuf.nano.InternalNano.equals(
          this.acceptType, other.acceptType)) {
        return false;
      }
      if (this.isCommunicationTarget == null) {
        if (other.isCommunicationTarget != null) {
          return false;
        }
      } else if (!this.isCommunicationTarget.equals(other.isCommunicationTarget)) {
        return false;
      }
      if (!com.google.protobuf.nano.InternalNano.equals(
          this.imageUrl, other.imageUrl)) {
        return false;
      }
      if (!com.google.protobuf.nano.InternalNano.equals(
          this.secondaryPhoneNumber, other.secondaryPhoneNumber)) {
        return false;
      }
      if (!com.google.protobuf.nano.InternalNano.equals(
          this.secondaryEmail, other.secondaryEmail)) {
        return false;
      }
      if (!com.google.protobuf.nano.InternalNano.equals(
          this.acceptCommand, other.acceptCommand)) {
        return false;
      }
      if (this.speakableName == null) {
        if (other.speakableName != null) {
          return false;
        }
      } else if (!this.speakableName.equals(other.speakableName)) {
        return false;
      }
      if (this.creationTime == null) {
        if (other.creationTime != null) {
          return false;
        }
      } else if (!this.creationTime.equals(other.creationTime)) {
        return false;
      }
      if (this.nickname == null) {
        if (other.nickname != null) {
          return false;
        }
      } else if (!this.nickname.equals(other.nickname)) {
        return false;
      }
      if (this.fullname == null) {
        if (other.fullname != null) {
          return false;
        }
      } else if (!this.fullname.equals(other.fullname)) {
        return false;
      }
      return true;
    }
    
    @Override
    public int hashCode() {
      int result = 17;
      result = 31 * result
          + (this.source == null ? 0 : this.source.hashCode());
      result = 31 * result
          + (this.id == null ? 0 : this.id.hashCode());
      result = 31 * result
          + (this.displayName == null ? 0 : this.displayName.hashCode());
      result = 31 * result
          + (this.shouldSync == null ? 0 : this.shouldSync.hashCode());
      result = 31 * result
          + (this.type == null ? 0 : this.type.hashCode());
      result = 31 * result
          + (this.phoneNumber == null ? 0 : this.phoneNumber.hashCode());
      result = 31 * result
          + (this.email == null ? 0 : this.email.hashCode());
      result = 31 * result
          + com.google.protobuf.nano.InternalNano.hashCode(this.acceptType);
      result = 31 * result
          + (this.isCommunicationTarget == null ? 0 : this.isCommunicationTarget.hashCode());
      result = 31 * result
          + com.google.protobuf.nano.InternalNano.hashCode(this.imageUrl);
      result = 31 * result
          + com.google.protobuf.nano.InternalNano.hashCode(this.secondaryPhoneNumber);
      result = 31 * result
          + com.google.protobuf.nano.InternalNano.hashCode(this.secondaryEmail);
      result = 31 * result
          + com.google.protobuf.nano.InternalNano.hashCode(this.acceptCommand);
      result = 31 * result
          + (this.speakableName == null ? 0 : this.speakableName.hashCode());
      result = 31 * result
          + (this.creationTime == null ? 0 : this.creationTime.hashCode());
      result = 31 * result
          + (this.nickname == null ? 0 : this.nickname.hashCode());
      result = 31 * result
          + (this.fullname == null ? 0 : this.fullname.hashCode());
      return result;
    }
    
    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.source != null) {
        output.writeString(1, this.source);
      }
      if (this.id != null) {
        output.writeString(2, this.id);
      }
      if (this.displayName != null) {
        output.writeString(3, this.displayName);
      }
      if (this.shouldSync != null) {
        output.writeBool(5, this.shouldSync);
      }
      if (this.type != null) {
        output.writeInt32(6, this.type);
      }
      if (this.phoneNumber != null) {
        output.writeString(7, this.phoneNumber);
      }
      if (this.email != null) {
        output.writeString(8, this.email);
      }
      if (this.acceptType != null && this.acceptType.length > 0) {
        for (int i = 0; i < this.acceptType.length; i++) {
          java.lang.String element = this.acceptType[i];
          if (element != null) {
            output.writeString(9, element);
          }
        }
      }
      if (this.isCommunicationTarget != null) {
        output.writeBool(10, this.isCommunicationTarget);
      }
      if (this.imageUrl != null && this.imageUrl.length > 0) {
        for (int i = 0; i < this.imageUrl.length; i++) {
          java.lang.String element = this.imageUrl[i];
          if (element != null) {
            output.writeString(12, element);
          }
        }
      }
      if (this.secondaryPhoneNumber != null && this.secondaryPhoneNumber.length > 0) {
        for (int i = 0; i < this.secondaryPhoneNumber.length; i++) {
          java.lang.String element = this.secondaryPhoneNumber[i];
          if (element != null) {
            output.writeString(13, element);
          }
        }
      }
      if (this.secondaryEmail != null && this.secondaryEmail.length > 0) {
        for (int i = 0; i < this.secondaryEmail.length; i++) {
          java.lang.String element = this.secondaryEmail[i];
          if (element != null) {
            output.writeString(15, element);
          }
        }
      }
      if (this.acceptCommand != null && this.acceptCommand.length > 0) {
        for (int i = 0; i < this.acceptCommand.length; i++) {
          java.lang.String element = this.acceptCommand[i];
          if (element != null) {
            output.writeString(16, element);
          }
        }
      }
      if (this.speakableName != null) {
        output.writeString(17, this.speakableName);
      }
      if (this.creationTime != null) {
        output.writeUInt64(21, this.creationTime);
      }
      if (this.nickname != null) {
        output.writeString(23, this.nickname);
      }
      if (this.fullname != null) {
        output.writeString(26, this.fullname);
      }
    }
    
    @Override
    public int getSerializedSize() {
      int size = super.getSerializedSize();
      if (this.source != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(1, this.source);
      }
      if (this.id != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(2, this.id);
      }
      if (this.displayName != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(3, this.displayName);
      }
      if (this.shouldSync != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(5, this.shouldSync);
      }
      if (this.type != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(6, this.type);
      }
      if (this.phoneNumber != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(7, this.phoneNumber);
      }
      if (this.email != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(8, this.email);
      }
      if (this.acceptType != null && this.acceptType.length > 0) {
        int dataCount = 0;
        int dataSize = 0;
        for (int i = 0; i < this.acceptType.length; i++) {
          java.lang.String element = this.acceptType[i];
          if (element != null) {
            dataCount++;
            dataSize += com.google.protobuf.nano.CodedOutputByteBufferNano
                .computeStringSizeNoTag(element);
          }
        }
        size += dataSize;
        size += 1 * dataCount;
      }
      if (this.isCommunicationTarget != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(10, this.isCommunicationTarget);
      }
      if (this.imageUrl != null && this.imageUrl.length > 0) {
        int dataCount = 0;
        int dataSize = 0;
        for (int i = 0; i < this.imageUrl.length; i++) {
          java.lang.String element = this.imageUrl[i];
          if (element != null) {
            dataCount++;
            dataSize += com.google.protobuf.nano.CodedOutputByteBufferNano
                .computeStringSizeNoTag(element);
          }
        }
        size += dataSize;
        size += 1 * dataCount;
      }
      if (this.secondaryPhoneNumber != null && this.secondaryPhoneNumber.length > 0) {
        int dataCount = 0;
        int dataSize = 0;
        for (int i = 0; i < this.secondaryPhoneNumber.length; i++) {
          java.lang.String element = this.secondaryPhoneNumber[i];
          if (element != null) {
            dataCount++;
            dataSize += com.google.protobuf.nano.CodedOutputByteBufferNano
                .computeStringSizeNoTag(element);
          }
        }
        size += dataSize;
        size += 1 * dataCount;
      }
      if (this.secondaryEmail != null && this.secondaryEmail.length > 0) {
        int dataCount = 0;
        int dataSize = 0;
        for (int i = 0; i < this.secondaryEmail.length; i++) {
          java.lang.String element = this.secondaryEmail[i];
          if (element != null) {
            dataCount++;
            dataSize += com.google.protobuf.nano.CodedOutputByteBufferNano
                .computeStringSizeNoTag(element);
          }
        }
        size += dataSize;
        size += 1 * dataCount;
      }
      if (this.acceptCommand != null && this.acceptCommand.length > 0) {
        int dataCount = 0;
        int dataSize = 0;
        for (int i = 0; i < this.acceptCommand.length; i++) {
          java.lang.String element = this.acceptCommand[i];
          if (element != null) {
            dataCount++;
            dataSize += com.google.protobuf.nano.CodedOutputByteBufferNano
                .computeStringSizeNoTag(element);
          }
        }
        size += dataSize;
        size += 2 * dataCount;
      }
      if (this.speakableName != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(17, this.speakableName);
      }
      if (this.creationTime != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeUInt64Size(21, this.creationTime);
      }
      if (this.nickname != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(23, this.nickname);
      }
      if (this.fullname != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(26, this.fullname);
      }
      cachedSize = size;
      return size;
    }
    
    @Override
    public Entity mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 10: {
            this.source = input.readString();
            break;
          }
          case 18: {
            this.id = input.readString();
            break;
          }
          case 26: {
            this.displayName = input.readString();
            break;
          }
          case 40: {
            this.shouldSync = input.readBool();
            break;
          }
          case 48: {
            this.type = input.readInt32();
            break;
          }
          case 58: {
            this.phoneNumber = input.readString();
            break;
          }
          case 66: {
            this.email = input.readString();
            break;
          }
          case 74: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 74);
            int i = this.acceptType == null ? 0 : this.acceptType.length;
            java.lang.String[] newArray = new java.lang.String[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.acceptType, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = input.readString();
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = input.readString();
            this.acceptType = newArray;
            break;
          }
          case 80: {
            this.isCommunicationTarget = input.readBool();
            break;
          }
          case 98: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 98);
            int i = this.imageUrl == null ? 0 : this.imageUrl.length;
            java.lang.String[] newArray = new java.lang.String[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.imageUrl, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = input.readString();
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = input.readString();
            this.imageUrl = newArray;
            break;
          }
          case 106: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 106);
            int i = this.secondaryPhoneNumber == null ? 0 : this.secondaryPhoneNumber.length;
            java.lang.String[] newArray = new java.lang.String[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.secondaryPhoneNumber, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = input.readString();
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = input.readString();
            this.secondaryPhoneNumber = newArray;
            break;
          }
          case 122: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 122);
            int i = this.secondaryEmail == null ? 0 : this.secondaryEmail.length;
            java.lang.String[] newArray = new java.lang.String[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.secondaryEmail, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = input.readString();
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = input.readString();
            this.secondaryEmail = newArray;
            break;
          }
          case 130: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 130);
            int i = this.acceptCommand == null ? 0 : this.acceptCommand.length;
            java.lang.String[] newArray = new java.lang.String[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.acceptCommand, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = input.readString();
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = input.readString();
            this.acceptCommand = newArray;
            break;
          }
          case 138: {
            this.speakableName = input.readString();
            break;
          }
          case 168: {
            this.creationTime = input.readUInt64();
            break;
          }
          case 186: {
            this.nickname = input.readString();
            break;
          }
          case 210: {
            this.fullname = input.readString();
            break;
          }
        }
      }
    }
    
    public static Entity parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new Entity(), data);
    }
    
    public static Entity parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new Entity().mergeFrom(input);
    }
  }
}