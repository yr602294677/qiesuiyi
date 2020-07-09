package LeetCode.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * 最长回文子串
 */
public class LeetCode5 {

  public static void main(String[] args) {
     System.out.println(longestPalindrome("adbda"));

  }

  public static  String longestPalindrome(String s) {
    int n = s.length();
    String res = "";
    boolean[][] dp = new boolean[n][n];
    for (int i = n - 1; i >= 0; i--) {
      for (int j = i; j < n; j++) {
        dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1]);
        //j - i 代表长度减去 1

        if (dp[i][j] && j - i + 1 > res.length()) {
          System.out.println(i+" "+j+" "+s.substring(i, j + 1));
          res = s.substring(i, j + 1);
        }
      }
    }
    return res;
  }

        //暴力  超时
        private static String longestPalindromeBaoli (String str){
          if ("".equals(str) || str == null) {
            return "";
          }
          String result = str.substring(0, 1);
          String temp = "";
          for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
              temp = str.substring(i, j);
              if (palindrome(temp)) {
                result = temp.length() > result.length() ? temp : result;
              }
            }
          }
          return result;
        }

        private static boolean palindrome (String str){
          String reversedStr = (new StringBuilder(str + "")).reverse().toString();
          return (str + "").equals(reversedStr);
        }

        //个人想法
        public static String longestPalindromePerson (String s){
          char[] array = s.toCharArray();
          int left = 0, right = array.length - 1;
          List<Character> list = new ArrayList<>();
          List<Character> maxlist = new ArrayList<>();
          for (int i = 0; i < array.length; i++) {
            left = i;
            right = array.length - 1;
            while (left < right) {
              while (array[right] != array[left]) {
                System.out.println("left:" + array[left] + " right:" + array[right]);

                right--;
                continue;
              }
              while (array[right] == array[left]) {
                list.add(array[left]);
                left++;
                right--;
              }
              maxlist = list.size() > maxlist.size() ? list : maxlist;

            }


          }
          return maxlist.toString();
        }
      }
