package LeetCode.array;

public class LeetCode28 {

	public int strStr(String haystack, String needle) {
		int m = needle.length();
		int n = haystack.length();
		if (m == 0 & n == 0) {
			return 0;
		}
		for (int i = 0; i <= n - m; i++) {
			int j;
			for (j = 0; j < m; j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}
			}
			if (j == m) {
				return i;
			}
		}
		return -1;
	}

}
