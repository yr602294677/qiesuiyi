package jdk8.optional;

import java.util.Optional;

public class OptionalDemo {
  private static String getName() {
    System.out.println("调用getName方法");
    return "xiaoming";
  }
  public static void main(String[] args) {
//    String name = "xiaogang";
//
//    System.out.println("orElse:");
//    String str1 = Optional.ofNullable(name).orElse(getName());
//    System.out.println(str1);
//
//    System.out.println("orElseGet:");
//    String str2 = Optional.ofNullable(name).orElseGet(()->getName());
//    System.out.println(str2);

    String str1 ="aa163.com";
    String result =
        Optional.ofNullable(str1).filter(u -> u!= null && u.contains("@")).orElse("bb@163.com");
    System.out.println(result);
  }


}
