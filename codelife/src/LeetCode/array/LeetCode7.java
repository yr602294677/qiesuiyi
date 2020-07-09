package LeetCode.array;

public class LeetCode7 {

    public static int reverse(int x) {
        if (x < 0) {
            x = x * (-1);
            String s = String.valueOf(x);
            StringBuffer ss = new StringBuffer();
            ss.append(s);
            ss.reverse();
            try {
                int s2 = Integer.parseInt(ss.toString());
                return s2 * (-1);
            } catch (Exception e) {
                return 0;
            }
        } else {
            String s = String.valueOf(x);
            StringBuffer ss = new StringBuffer();
            ss.append(s);
            ss.reverse();
            try {
                int s2 = Integer.parseInt(ss.toString());
                return s2;
            } catch (Exception e) {
                return 0;
            }
        }
    }
}
