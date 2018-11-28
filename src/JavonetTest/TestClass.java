package JavonetTest;

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
import JavonetTest.*;
import jio.System.Collections.Generic.*;

public class TestClass {
  protected NObject javonetHandle;

  public TestClass() {
    try {
      javonetHandle = Javonet.New("JavonetTest.TestClass");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TestClass(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public List<java.lang.Integer> testMethod(TestClass c) {
    try {
      Object res = javonetHandle.invoke("testMethod", c);
      if (res == null) return null;
      return new List<java.lang.Integer>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static java.lang.Float[] stTestMethod(TestClass c) {
    try {
      Object[] res = Javonet.getType("TestClass").invoke("stTestMethod", c);
      if (res == null) return null;
      return Helper.ConvertNObjectToDestinationType((NObject[]) res, java.lang.Float[].class);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
