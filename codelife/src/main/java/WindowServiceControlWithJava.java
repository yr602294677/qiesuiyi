package main.java;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;
public class WindowServiceControlWithJava {

  public static void main(String[] args) throws InterruptedException {
    while (true) {
      try {
        Socket socket = new Socket("127.0.0.1", 8080);
        socket.close();
        System.out.println("8080 运行中....");
      } catch (IOException e) {
        try {
          System.out.println("开始重启 dxp_ng");
          // 调用 cmd命令，执行 net start mysql， /c 必须要有
          // 两个连续命令之间用& 连接
          Process p = Runtime.getRuntime().exec("cmd.exe /c cd /d F:\\WorkCode_Git\\target & "
              + "dxp_ng start ");

          InputStream inputStream = p.getInputStream();
          Scanner scanner = new Scanner(inputStream, "GBK");
          scanner.useDelimiter("\\A");
          while (scanner.hasNext()) {
            scanner.next();
          }
          scanner.close();
        } catch (Exception e1) {
          System.out.println("重启错误");
        }
        System.out.println("重启完成");
      }
      Thread.sleep(60000);
    }
  }
}