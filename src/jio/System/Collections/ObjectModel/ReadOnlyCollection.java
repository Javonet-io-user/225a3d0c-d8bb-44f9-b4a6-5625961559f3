package jio.System.Collections.ObjectModel;

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
import jio.System.Collections.ObjectModel.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;
import jio.System.*;

public class ReadOnlyCollection<T>
    implements jio.System.Collections.Generic.IList<T>,
        jio.System.Collections.Generic.ICollection<T>,
        jio.System.Collections.Generic.IEnumerable<T>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IList,
        jio.System.Collections.ICollection,
        IReadOnlyList<T>,
        IReadOnlyCollection<T>,
        Iterable<T> {
  protected NObject javonetHandle;

  @Override
  public Iterator<T> iterator() {
    return (Iterator<T>) this.GetEnumerator();
  }
  /** GetProperty */

  public java.lang.Integer getCount() {
    try {
      java.lang.Integer res = javonetHandle.explicitInterface("ICollection").invoke("Count");
      if (res == null) return 0;
      return javonetHandle.explicitInterface("ICollection").invoke("Count");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public T get_ItemProperty(java.lang.Integer index, Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("get_Item", index);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GenericConstructor */

  public ReadOnlyCollection(jio.System.Collections.Generic.IList<T> list, Class<?> T) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.ObjectModel.ReadOnlyCollection`1", getReturnObjectName(T))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ReadOnlyCollection(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerator<T> GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean Contains(T value) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Contains", value);
      if (res == null) return false;
      return javonetHandle.invoke("Contains", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void CopyTo(T[] array, java.lang.Integer index) {
    try {
      javonetHandle.invoke("CopyTo", new Object[] {array}, index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer IndexOf(T value) {
    try {
      java.lang.Integer res = javonetHandle.invoke("IndexOf", value);
      if (res == null) return 0;
      return javonetHandle.invoke("IndexOf", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public T get_Item(java.lang.Integer index, Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("System.Collections.Generic.IList<T>.get_Item", index);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void set_Item(java.lang.Integer index, T value) {
    try {
      javonetHandle.invoke("System.Collections.Generic.IList<T>.set_Item", index, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Insert(java.lang.Integer index, T value) {
    try {
      javonetHandle.invoke("System.Collections.Generic.IList<T>.Insert", index, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void RemoveAt(java.lang.Integer index) {
    try {
      javonetHandle.invoke("System.Collections.Generic.IList<T>.RemoveAt", index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean get_IsReadOnly() {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke("System.Collections.Generic.ICollection<T>.get_IsReadOnly");
      if (res == null) return false;
      return javonetHandle.invoke("System.Collections.Generic.ICollection<T>.get_IsReadOnly");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void Add(T value) {
    try {
      javonetHandle.invoke("System.Collections.Generic.ICollection<T>.Add", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Clear() {
    try {
      javonetHandle.invoke("System.Collections.Generic.ICollection<T>.Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean Remove(T value) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke("System.Collections.Generic.ICollection<T>.Remove", value);
      if (res == null) return false;
      return javonetHandle.invoke("System.Collections.Generic.ICollection<T>.Remove", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public jio.System.Collections.IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("IEnumerable")
              .invoke("System.Collections.IEnumerable.GetEnumerator");
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

  public java.lang.Boolean IList_get_IsReadOnly() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("IList")
              .invoke("System.Collections.IList.get_IsReadOnly");
      if (res == null) return false;
      return javonetHandle
          .explicitInterface("IList")
          .invoke("System.Collections.IList.get_IsReadOnly");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean IList_get_IsFixedSize() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("IList")
              .invoke("System.Collections.IList.get_IsFixedSize");
      if (res == null) return false;
      return javonetHandle
          .explicitInterface("IList")
          .invoke("System.Collections.IList.get_IsFixedSize");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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

  public void ICollection_CopyTo(java.lang.reflect.Array array, java.lang.Integer index) {
    try {
      javonetHandle
          .explicitInterface("ICollection")
          .invoke("System.Collections.ICollection.CopyTo", array, index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Object ICollection_get_SyncRoot() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("ICollection")
              .invoke("System.Collections.ICollection.get_SyncRoot");
      if (res == null) return null;
      return (Object) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean ICollection_get_IsSynchronized() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("ICollection")
              .invoke("System.Collections.ICollection.get_IsSynchronized");
      if (res == null) return false;
      return javonetHandle
          .explicitInterface("ICollection")
          .invoke("System.Collections.ICollection.get_IsSynchronized");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
