/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.imebra;

public class StringsList {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StringsList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StringsList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        imebraJNI.delete_StringsList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StringsList() {
    this(imebraJNI.new_StringsList__SWIG_0(), true);
  }

  public StringsList(long n) {
    this(imebraJNI.new_StringsList__SWIG_1(n), true);
  }

  public long size() {
    return imebraJNI.StringsList_size(swigCPtr, this);
  }

  public long capacity() {
    return imebraJNI.StringsList_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    imebraJNI.StringsList_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return imebraJNI.StringsList_isEmpty(swigCPtr, this);
  }

  public void clear() {
    imebraJNI.StringsList_clear(swigCPtr, this);
  }

  public void add(String x) {
    imebraJNI.StringsList_add(swigCPtr, this, x);
  }

  public String get(int i) {
    return imebraJNI.StringsList_get(swigCPtr, this, i);
  }

  public void set(int i, String val) {
    imebraJNI.StringsList_set(swigCPtr, this, i, val);
  }

}
