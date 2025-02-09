/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class ChainUpdateEdgeRequest implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ChainUpdateEdgeRequest");
  private static final TField UPDATE_EDGE_REQUEST_FIELD_DESC = new TField("update_edge_request", TType.STRUCT, (short)1);
  private static final TField TERM_FIELD_DESC = new TField("term", TType.I64, (short)2);
  private static final TField EDGE_VERSION_FIELD_DESC = new TField("edge_version", TType.I64, (short)3);
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)4);
  private static final TField PARTS_FIELD_DESC = new TField("parts", TType.LIST, (short)5);

  public UpdateEdgeRequest update_edge_request;
  public long term;
  public long edge_version;
  public int space_id;
  public List<Integer> parts;
  public static final int UPDATE_EDGE_REQUEST = 1;
  public static final int TERM = 2;
  public static final int EDGE_VERSION = 3;
  public static final int SPACE_ID = 4;
  public static final int PARTS = 5;

  // isset id assignments
  private static final int __TERM_ISSET_ID = 0;
  private static final int __EDGE_VERSION_ISSET_ID = 1;
  private static final int __SPACE_ID_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(UPDATE_EDGE_REQUEST, new FieldMetaData("update_edge_request", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, UpdateEdgeRequest.class)));
    tmpMetaDataMap.put(TERM, new FieldMetaData("term", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(EDGE_VERSION, new FieldMetaData("edge_version", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PARTS, new FieldMetaData("parts", TFieldRequirementType.REQUIRED, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(ChainUpdateEdgeRequest.class, metaDataMap);
  }

  public ChainUpdateEdgeRequest() {
  }

  public ChainUpdateEdgeRequest(
      List<Integer> parts) {
    this();
    this.parts = parts;
  }

  public ChainUpdateEdgeRequest(
      UpdateEdgeRequest update_edge_request,
      long term,
      int space_id,
      List<Integer> parts) {
    this();
    this.update_edge_request = update_edge_request;
    this.term = term;
    setTermIsSet(true);
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
  }

  public ChainUpdateEdgeRequest(
      UpdateEdgeRequest update_edge_request,
      long term,
      long edge_version,
      int space_id,
      List<Integer> parts) {
    this();
    this.update_edge_request = update_edge_request;
    this.term = term;
    setTermIsSet(true);
    this.edge_version = edge_version;
    setEdge_versionIsSet(true);
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
  }

  public static class Builder {
    private UpdateEdgeRequest update_edge_request;
    private long term;
    private long edge_version;
    private int space_id;
    private List<Integer> parts;

    BitSet __optional_isset = new BitSet(3);

    public Builder() {
    }

    public Builder setUpdate_edge_request(final UpdateEdgeRequest update_edge_request) {
      this.update_edge_request = update_edge_request;
      return this;
    }

    public Builder setTerm(final long term) {
      this.term = term;
      __optional_isset.set(__TERM_ISSET_ID, true);
      return this;
    }

    public Builder setEdge_version(final long edge_version) {
      this.edge_version = edge_version;
      __optional_isset.set(__EDGE_VERSION_ISSET_ID, true);
      return this;
    }

    public Builder setSpace_id(final int space_id) {
      this.space_id = space_id;
      __optional_isset.set(__SPACE_ID_ISSET_ID, true);
      return this;
    }

    public Builder setParts(final List<Integer> parts) {
      this.parts = parts;
      return this;
    }

    public ChainUpdateEdgeRequest build() {
      ChainUpdateEdgeRequest result = new ChainUpdateEdgeRequest();
      result.setUpdate_edge_request(this.update_edge_request);
      if (__optional_isset.get(__TERM_ISSET_ID)) {
        result.setTerm(this.term);
      }
      if (__optional_isset.get(__EDGE_VERSION_ISSET_ID)) {
        result.setEdge_version(this.edge_version);
      }
      if (__optional_isset.get(__SPACE_ID_ISSET_ID)) {
        result.setSpace_id(this.space_id);
      }
      result.setParts(this.parts);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ChainUpdateEdgeRequest(ChainUpdateEdgeRequest other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetUpdate_edge_request()) {
      this.update_edge_request = TBaseHelper.deepCopy(other.update_edge_request);
    }
    this.term = TBaseHelper.deepCopy(other.term);
    this.edge_version = TBaseHelper.deepCopy(other.edge_version);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    if (other.isSetParts()) {
      this.parts = TBaseHelper.deepCopy(other.parts);
    }
  }

  public ChainUpdateEdgeRequest deepCopy() {
    return new ChainUpdateEdgeRequest(this);
  }

  public UpdateEdgeRequest getUpdate_edge_request() {
    return this.update_edge_request;
  }

  public ChainUpdateEdgeRequest setUpdate_edge_request(UpdateEdgeRequest update_edge_request) {
    this.update_edge_request = update_edge_request;
    return this;
  }

  public void unsetUpdate_edge_request() {
    this.update_edge_request = null;
  }

  // Returns true if field update_edge_request is set (has been assigned a value) and false otherwise
  public boolean isSetUpdate_edge_request() {
    return this.update_edge_request != null;
  }

  public void setUpdate_edge_requestIsSet(boolean __value) {
    if (!__value) {
      this.update_edge_request = null;
    }
  }

  public long getTerm() {
    return this.term;
  }

  public ChainUpdateEdgeRequest setTerm(long term) {
    this.term = term;
    setTermIsSet(true);
    return this;
  }

  public void unsetTerm() {
    __isset_bit_vector.clear(__TERM_ISSET_ID);
  }

  // Returns true if field term is set (has been assigned a value) and false otherwise
  public boolean isSetTerm() {
    return __isset_bit_vector.get(__TERM_ISSET_ID);
  }

  public void setTermIsSet(boolean __value) {
    __isset_bit_vector.set(__TERM_ISSET_ID, __value);
  }

  public long getEdge_version() {
    return this.edge_version;
  }

  public ChainUpdateEdgeRequest setEdge_version(long edge_version) {
    this.edge_version = edge_version;
    setEdge_versionIsSet(true);
    return this;
  }

  public void unsetEdge_version() {
    __isset_bit_vector.clear(__EDGE_VERSION_ISSET_ID);
  }

  // Returns true if field edge_version is set (has been assigned a value) and false otherwise
  public boolean isSetEdge_version() {
    return __isset_bit_vector.get(__EDGE_VERSION_ISSET_ID);
  }

  public void setEdge_versionIsSet(boolean __value) {
    __isset_bit_vector.set(__EDGE_VERSION_ISSET_ID, __value);
  }

  public int getSpace_id() {
    return this.space_id;
  }

  public ChainUpdateEdgeRequest setSpace_id(int space_id) {
    this.space_id = space_id;
    setSpace_idIsSet(true);
    return this;
  }

  public void unsetSpace_id() {
    __isset_bit_vector.clear(__SPACE_ID_ISSET_ID);
  }

  // Returns true if field space_id is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_id() {
    return __isset_bit_vector.get(__SPACE_ID_ISSET_ID);
  }

  public void setSpace_idIsSet(boolean __value) {
    __isset_bit_vector.set(__SPACE_ID_ISSET_ID, __value);
  }

  public List<Integer> getParts() {
    return this.parts;
  }

  public ChainUpdateEdgeRequest setParts(List<Integer> parts) {
    this.parts = parts;
    return this;
  }

  public void unsetParts() {
    this.parts = null;
  }

  // Returns true if field parts is set (has been assigned a value) and false otherwise
  public boolean isSetParts() {
    return this.parts != null;
  }

  public void setPartsIsSet(boolean __value) {
    if (!__value) {
      this.parts = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case UPDATE_EDGE_REQUEST:
      if (__value == null) {
        unsetUpdate_edge_request();
      } else {
        setUpdate_edge_request((UpdateEdgeRequest)__value);
      }
      break;

    case TERM:
      if (__value == null) {
        unsetTerm();
      } else {
        setTerm((Long)__value);
      }
      break;

    case EDGE_VERSION:
      if (__value == null) {
        unsetEdge_version();
      } else {
        setEdge_version((Long)__value);
      }
      break;

    case SPACE_ID:
      if (__value == null) {
        unsetSpace_id();
      } else {
        setSpace_id((Integer)__value);
      }
      break;

    case PARTS:
      if (__value == null) {
        unsetParts();
      } else {
        setParts((List<Integer>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case UPDATE_EDGE_REQUEST:
      return getUpdate_edge_request();

    case TERM:
      return new Long(getTerm());

    case EDGE_VERSION:
      return new Long(getEdge_version());

    case SPACE_ID:
      return new Integer(getSpace_id());

    case PARTS:
      return getParts();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof ChainUpdateEdgeRequest))
      return false;
    ChainUpdateEdgeRequest that = (ChainUpdateEdgeRequest)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetUpdate_edge_request(), that.isSetUpdate_edge_request(), this.update_edge_request, that.update_edge_request)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.term, that.term)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetEdge_version(), that.isSetEdge_version(), this.edge_version, that.edge_version)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetParts(), that.isSetParts(), this.parts, that.parts)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {update_edge_request, term, edge_version, space_id, parts});
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case UPDATE_EDGE_REQUEST:
          if (__field.type == TType.STRUCT) {
            this.update_edge_request = new UpdateEdgeRequest();
            this.update_edge_request.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case TERM:
          if (__field.type == TType.I64) {
            this.term = iprot.readI64();
            setTermIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case EDGE_VERSION:
          if (__field.type == TType.I64) {
            this.edge_version = iprot.readI64();
            setEdge_versionIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case SPACE_ID:
          if (__field.type == TType.I32) {
            this.space_id = iprot.readI32();
            setSpace_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PARTS:
          if (__field.type == TType.LIST) {
            {
              TList _list306 = iprot.readListBegin();
              this.parts = new ArrayList<Integer>(Math.max(0, _list306.size));
              for (int _i307 = 0; 
                   (_list306.size < 0) ? iprot.peekList() : (_i307 < _list306.size); 
                   ++_i307)
              {
                int _elem308;
                _elem308 = iprot.readI32();
                this.parts.add(_elem308);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.update_edge_request != null) {
      oprot.writeFieldBegin(UPDATE_EDGE_REQUEST_FIELD_DESC);
      this.update_edge_request.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(TERM_FIELD_DESC);
    oprot.writeI64(this.term);
    oprot.writeFieldEnd();
    if (isSetEdge_version()) {
      oprot.writeFieldBegin(EDGE_VERSION_FIELD_DESC);
      oprot.writeI64(this.edge_version);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(SPACE_ID_FIELD_DESC);
    oprot.writeI32(this.space_id);
    oprot.writeFieldEnd();
    if (this.parts != null) {
      oprot.writeFieldBegin(PARTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I32, this.parts.size()));
        for (int _iter309 : this.parts)        {
          oprot.writeI32(_iter309);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("ChainUpdateEdgeRequest");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("update_edge_request");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getUpdate_edge_request() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getUpdate_edge_request(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("term");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getTerm(), indent + 1, prettyPrint));
    first = false;
    if (isSetEdge_version())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("edge_version");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this.getEdge_version(), indent + 1, prettyPrint));
      first = false;
    }
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("space_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getSpace_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("parts");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getParts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getParts(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (parts == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'parts' was not present! Struct: " + toString());
    }
  }

}

