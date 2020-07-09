import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipFileTest {

  public static void main(String[] args) throws IOException {
    unzip("g:\\2", new File("G:\\1.zip"));
  }

  private static void unzip(String directory, File zipFile) throws IOException {
    System.setProperty("sun.zip.encoding", System.getProperty("sun.jnu.encoding"));
    ZipInputStream zin = new ZipInputStream(new FileInputStream(zipFile));
    BufferedInputStream bin = new BufferedInputStream(zin);
    ZipEntry entry = zin.getNextEntry();
    while (entry != null && !entry.isDirectory()) {
      File Fout = new File(directory, entry.getName());
      if (!Fout.exists()) {
        (new File(Fout.getParent())).mkdirs();
      }
      FileOutputStream out = new FileOutputStream(Fout);
      BufferedOutputStream Bout = new BufferedOutputStream(out);
      int b;
      while ((b = bin.read()) != -1) {
        Bout.write(b);
      }
      Bout.close();
      out.close();
    }
    bin.close();
    zin.close();
  }
}
