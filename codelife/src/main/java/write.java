import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class write {

  public static void main(String[] args) throws IOException {
    String path="d:\\lcsymdc";
    //20191122154201-5bb468c2a0674f7bbf9a4530ff1c87e8.txt
    String msg = "溯源码批次：5bb468c2a0674f7bbf9a4530ff1c87e8\n"
        + "产品名称：大豆油\n"
        + "溯源码类型：O\n"
        + "溯源码生成时间：2019-11-22 14:16:23\n"
        + "导出数量：12\n"
        + "OCAA002ANM01000000\n"
        + "OCAA002ANM01000001\n"
        + "OCAA002ANM01000002\n"
        + "OCAA002ANM01000003\n"
        + "OCAA002ANM01000004\n"
        + "OCAA002ANM01000005\n"
        + "OCAA002ANM01000006\n"
        + "OCAA002ANM01000007\n"
        + "OCAA002ANM01000008\n"
        + "OCAA002ANM01000009\n"
        + "OCAA002ANM01000010\n"
        + "OCAA002ANM01000011";
    File file=new File(path);
    if(!file.exists()){
      file.mkdir();
    }
    try {
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path+"\\20191122154201-5bb468c2a0674f7bbf9a4530ff1c87e8.txt"));
      bufferedWriter.write(msg);
      bufferedWriter.close();
    }catch(IOException e){

    }

  }
}
