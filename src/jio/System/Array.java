package jio.System;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.*;
import jio.System.Collections.*;

public abstract class Array
    implements ICloneable,
        IList,
        ICollection,
        IEnumerable,
        IStructuralComparable,
        IStructuralEquatable,
        Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.IEnumerable_GetEnumerator();
  }

  public Array(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res = javonetHandle.explicitInterface("IEnumerable").invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object IList_get_Item(java.lang.Integer index) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("IList")
              .invoke("System.Collections.IList.get_Item", index);
      if (res == null) return null;
      return (Object) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void IList_set_Item(java.lang.Integer index, Object value) {
    try {
      javonetHandle
          .explicitInterface("IList")
          .invoke("System.Collections.IList.set_Item", index, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer IList_Add(Object value) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("IList").invoke("System.Collections.IList.Add", value);
      if (res == null) return 0;
      return javonetHandle.explicitInterface("IList").invoke("System.Collections.IList.Add", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Boolean IList_Contains(Object value) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("IList")
              .invoke("System.Collections.IList.Contains", value);
      if (res == null) return false;
      return javonetHandle
          .explicitInterface("IList")
          .invoke("System.Collections.IList.Contains", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void IList_Clear() {
    try {
      javonetHandle.explicitInterface("IList").invoke("System.Collections.IList.Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer IList_IndexOf(Object value) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IList")
              .invoke("System.Collections.IList.IndexOf", value);
      if (res == null) return 0;
      return javonetHandle
          .explicitInterface("IList")
          .invoke("System.Collections.IList.IndexOf", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void IList_Insert(java.lang.Integer index, Object value) {
    try {
      javonetHandle
          .explicitInterface("IList")
          .invoke("System.Collections.IList.Insert", index, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void IList_Remove(Object value) {
    try {
      javonetHandle.explicitInterface("IList").invoke("System.Collections.IList.Remove", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void IList_RemoveAt(java.lang.Integer index) {
    try {
      javonetHandle.explicitInterface("IList").invoke("System.Collections.IList.RemoveAt", index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer get_Count() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("ICollection")
              .invoke("System.Collections.ICollection.get_Count");
      if (res == null) return 0;
      return javonetHandle
          .explicitInterface("ICollection")
          .invoke("System.Collections.ICollection.get_Count");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer CompareTo(Object other, IComparer comparer) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IStructuralComparable")
              .invoke("System.Collections.IStructuralComparable.CompareTo", other, comparer);
      if (res == null) return 0;
      return javonetHandle
          .explicitInterface("IStructuralComparable")
          .invoke("System.Collections.IStructuralComparable.CompareTo", other, comparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Boolean Equals(Object other, IEqualityComparer comparer) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("IStructuralEquatable")
              .invoke("System.Collections.IStructuralEquatable.Equals", other, comparer);
      if (res == null) return false;
      return javonetHandle
          .explicitInterface("IStructuralEquatable")
          .invoke("System.Collections.IStructuralEquatable.Equals", other, comparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Integer GetHashCode(IEqualityComparer comparer) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IStructuralEquatable")
              .invoke("System.Collections.IStructuralEquatable.GetHashCode", comparer);
      if (res == null) return 0;
      return javonetHandle
          .explicitInterface("IStructuralEquatable")
          .invoke("System.Collections.IStructuralEquatable.GetHashCode", comparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
