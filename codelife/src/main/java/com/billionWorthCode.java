package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: WorkCode_Git
 * @description: 价值百万人工代码
 * @author: 且随意
 * @create: 2020-05-26 17:26
 **/
public class billionWorthCode {

  public static void main(String args[]) throws IOException {
    // 使用 System.in 创建 BufferedReader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str;
    System.out.println("请输入问题：");
    do {
      // 从控制台读取一行数据，返回值字符串
      str = br.readLine();
      System.out.println("答案:");
      System.out.println(str.replace("你","我").replace("吗","").replace("？","!"));

    } while (!str.equals("exit"));
  }
}
