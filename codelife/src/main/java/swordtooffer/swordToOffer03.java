package swordtooffer;

public class swordToOffer03 {
  public static  String replaceSpace(String s) {
  while (s.indexOf(" ")!=-1){
    s=s.replace(" ","%20");
  }
    return s;
  }

  public static void main(String[] args) {
    System.out.println(replaceSpace("we are family."));
  }
}
