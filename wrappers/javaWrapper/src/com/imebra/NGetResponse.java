/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.imebra;

public class NGetResponse extends DimseResponse {
  private transient long swigCPtr;

  protected NGetResponse(long cPtr, boolean cMemoryOwn) {
    super(imebraJNI.NGetResponse_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NGetResponse obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        imebraJNI.delete_NGetResponse(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public NGetResponse(NGetCommand receivedCommand, dimseStatusCode_t responseCode, DataSet attributeList) {
    this(imebraJNI.new_NGetResponse__SWIG_0(NGetCommand.getCPtr(receivedCommand), receivedCommand, responseCode.swigValue(), DataSet.getCPtr(attributeList), attributeList), true);
  }

  public NGetResponse(NGetCommand receivedCommand, dimseStatusCode_t responseCode) {
    this(imebraJNI.new_NGetResponse__SWIG_1(NGetCommand.getCPtr(receivedCommand), receivedCommand, responseCode.swigValue()), true);
  }

  public NGetResponse(NGetResponse source) {
    this(imebraJNI.new_NGetResponse__SWIG_2(NGetResponse.getCPtr(source), source), true);
  }

}