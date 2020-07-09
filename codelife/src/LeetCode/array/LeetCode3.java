package LeetCode.array;

public class LeetCode3 {

  public static int lengthOfLongestSubstring(String s) {
    StringBuffer sqlBf = new StringBuffer("");
    int max = 0;
    for (int i = 0; i < s.length(); i++) {
      sqlBf.setLength(0);
      for (int j = i; j < s.length(); j++) {
        char c = s.charAt(j);
        if (sqlBf.toString().contains(String.valueOf(c))) {
          break;
        } else {
          sqlBf.append(String.valueOf(c));
        }
      }
      max = max > sqlBf.toString().length() ? max : sqlBf.toString().length();
    }
    return max;
  }

  public static void main(String[] args) {
    String s = "pwwkew";
    System.out.println(LeetCode3.lengthOfLongestSubstring(s));
  }

}
