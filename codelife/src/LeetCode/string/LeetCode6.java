package LeetCode.string;

import java.util.ArrayList;
import java.util.List;

public class LeetCode6 {
  public static String convert(String s, int numRows) {
    if (numRows==1) return s;
    List<StringBuffer> list = new ArrayList<>();
    for (int i = 0; i <Math.min(numRows, s.length()) ; i++) {
      list.add(new StringBuffer());
    }
    //移动方向标志位
    boolean goingDown=false;
    int curRow = 0;
    for(char c:s.toCharArray()){
      list.get(curRow).append(c);
      if(curRow==0||curRow==numRows-1)goingDown=!goingDown;
      curRow+= goingDown?1:-1;
    }
    StringBuffer result=new StringBuffer();
    for(StringBuffer stringBuffer:list){
      result.append(stringBuffer.toString());
    }
    return result.toString();
  }

  public static void main(String[] args)
  {
    System.out.println(convert("LEETCODEISHIRING",4));
  }

}
