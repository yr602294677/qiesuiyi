package test;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

public class doPostCircle {
  public static void main(String[] args) throws Exception {
    String url;
    url = "https://api.ownthink.com/kg/ambiguous";
    String param = "mention=苹果";
    System.out.println(url);
    System.out.println(param);
    System.out.println(dispachPackageDataByPostUrl(url, param));
    //Runnable recvTask = new HttpBridgeReceiveRequest(url,param);
    //recvTask.run();
  }

  // 涓庢帴鍙ｈ繘琛屾暟鎹皟搴�POST鏂规硶
  public static String dispachPackageDataByPostUrl(String url, String param) {
    PrintWriter out = null;
    BufferedReader in = null;
    String result = "";
    try {
      URL realUrl = new URL(url);
      // 鎵撳紑鍜孶RL涔嬮棿鐨勮繛鎺�
      URLConnection conn = realUrl.openConnection();
      // 璁剧疆閫氱敤鐨勮姹傚睘鎬�
      conn.setRequestProperty("accept", "*/*");
      conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      conn.setRequestProperty("connection", "Keep-Alive");
      conn.setRequestProperty("Accept-Charset", "utf-8"); // 璁剧疆缂栫爜璇█
      conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
      // 鍙戦�POST璇锋眰蹇呴』璁剧疆濡備笅涓よ
      conn.setDoOutput(true);
      conn.setDoInput(true);
      // 鑾峰彇URLConnection瀵硅薄瀵瑰簲鐨勮緭鍑烘祦
      out = new PrintWriter(new OutputStreamWriter(conn.getOutputStream(), "utf-8"));
      // 鍙戦�璇锋眰鍙傛暟

      out.print(param);
      // flush杈撳嚭娴佺殑缂撳啿
      out.flush();
      // 瀹氫箟BufferedReader杈撳叆娴佹潵璇诲彇URL鐨勫搷搴�
      InputStream instr = conn.getInputStream();
      byte[] bis = input2byte(instr);
      result = new String(bis, "UTF-8");
    } catch (Exception e) {
      System.out.println("*************" + e);
      e.printStackTrace();
    }
    // 浣跨敤finally鍧楁潵鍏抽棴杈撳嚭娴併�杈撳叆娴�
    finally {
      try {
        if (out != null) {
          out.close();
        }
        if (in != null) {
          in.close();
        }
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
    return result;
  }

  public static final byte[] input2byte(InputStream inStream) throws IOException {
    ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
    byte[] buff = new byte[100];
    int rc = 0;
    while ((rc = inStream.read(buff, 0, 100)) > 0) {
      swapStream.write(buff, 0, rc);
    }
    byte[] in2b = swapStream.toByteArray();
    return in2b;
  }
  static class HttpBridgeReceiveRequest implements Runnable {
    private String URL;
    private String topic;
    private String groupId;

    HttpBridgeReceiveRequest(String URL, String param) {
      this.URL = URL;
      this.topic = topic;
      this.groupId = groupId;
    }

    public void run() {
      boolean stopRequestLoop=false;
      String param = "10.200.64.54:8081/dxplatform/httpbridge";
      int i=0;
     // while (!stopRequestLoop) {
        // 循环发起请求，
        try {
          System.out.println(dispachPackageDataByPostUrl(URL, param));
        } catch (Exception e) {// 注意请求等待超时等情况
          e.printStackTrace();
        }
      //}
    }
  }
}
