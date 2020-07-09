package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {

  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    Class testClass=Class.forName("reflect.User");

    Method method =  testClass.getMethod("main",java.lang.String[].class);
    method.invoke(null,(Object)new String[]{});
  }
}
