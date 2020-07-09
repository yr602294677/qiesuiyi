package main.java.tools;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class MD5Util{


private static byte[] createChecksum(String filename) {
    InputStream fis = null;
    try {
    fis = new FileInputStream(filename);
    byte[] buffer = new byte[1024];
    MessageDigest complete = MessageDigest.getInstance("MD5");
    int numRead = -1;

    while ((numRead = fis.read(buffer)) != -1) {
    complete.update(buffer, 0, numRead);
    }
    return complete.digest();
    } catch (FileNotFoundException e) {
    e.printStackTrace();
    } catch (NoSuchAlgorithmException e) {
    e.printStackTrace();
    } catch (IOException e) {
    e.printStackTrace();
    } finally {
    try {
    if (null != fis) {
    fis.close();
    }
    } catch (IOException e) {
    e.printStackTrace();
    }
    }
    return null;

    }

public static String generateMD5(String filePath) {
    if (!new File(filePath).isFile()) {
    System.err.println("Error: " + filePath + " is not a valid file.");
    return null;
    }
    byte[] b = createChecksum(filePath);
    if (null == b) {
    System.err.println(("Error:create md5 string failure!"));
    return null;
    }
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < b.length; i++) {
    result.append(Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1));
    }
    return result.toString();
    }

    //  69/73  a65c414ccbc01ae5b00a254e23de5028
    //
public static void main(String[] args) {
    String filePath = "C://inetpub/wwwroot/dxplatform_ng9.3.zip";
    String aaa = generateMD5(filePath);
    System.out.println(aaa);
    }
    }
