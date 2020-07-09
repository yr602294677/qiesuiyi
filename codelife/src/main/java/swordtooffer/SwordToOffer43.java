package swordtooffer;

/**
 * @program: WorkCode_Git
 * @description: 1～n整数中1出现的次数
 * @author: 且随意
 * @create: 2020-07-05 11:13
 **/
public class SwordToOffer43 {

  public static int countDigitOne(int n) {

    return f(n);
  }

  private static int getNumOf1(String str) {

    int len1 = str.length();
    String str1 = str.replaceAll("1", "");
    int len2 = str1.length();
    return len1 - len2;
  }
  public static int f(int n){
    if (n==0) return 0;
    String string =String.valueOf(n);
    int high =string.charAt(0)-'0';
    int pow=(int)Math.pow(10,string.length()-1);
    int last=n-high*pow;
    if(high==1){
      return f(pow-1)+f(last)+last+1;
    }else{
      return pow+high*f(pow-1)+f(last);
    }
  }

  public static void main(String[] args) {
    System.out.println(countDigitOne(12));
    int n=278956122;

    System.out.println(Integer.parseInt(String.valueOf(String.valueOf(n).charAt(6))));
  }


}
