package LeetCode.array;

public class LeetCode58 {
	//�����һ������˼·
	public static int lengthOfLastWord(String s) {
		int length=s.length();
		
		if(s==" "||" ".equals(s)) {return 0;}
		//if((s.charAt(length-1)==' '&&s.charAt(0)!=' ')||(s.charAt(0)==' '&&s.charAt(length-1)!=' ')) {return }
		s.trim();
		
		
		if(length==0) {
			return 0;
		}
		for (int i=length-1;i>-1;i--) {
			if (s.charAt(i)==' ') {
				if(length>1) {
					return length-i-1;
				}else {
					return 1;
				}
				
			};
		} 
		return length;
	}
/*	// �⺯��˼·
	public static int lengthOfLastWord(String s) {
		String[] splitS = s.split(" ");
		
		int max = 0;
		int length = splitS.length;

		if (length != 0) {
			max = splitS[length - 1].length();
		}
		return max;
	}*/

	public static void main(String[] args) {
		String string = " a sdf ";
//		System.out.println("as ".trim());
//		System.out.println(" as ".trim());
//		System.out.println(" as".trim());
//		System.out.println("as sd ".trim());
//		System.out.println(" as sd ".trim());
		System.out.println(lengthOfLastWord(string));
	}

}
