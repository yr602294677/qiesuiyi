package LeetCode.array;

/*
 * 66.��һ
 * ����һ����������ɵķǿ���������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��
 *���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢һ�����֡�
 *����Լ���������� 0 ֮�⣬��������������㿪ͷ��
 *
 *ʾ��������: [1,2,3]  ���: [1,2,4]
 *
*/

public class LeetCode66 {

	public int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			digits[i]++;
			digits[i] = digits[i] % 10;
			if (digits[i] != 0) {
				return digits;
			}
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;

	}

	public static void main(String[] args) {
		int[] digits = { 9, 9, 9 };

		LeetCode66 demo = new LeetCode66();
		int[] results = demo.plusOne(digits);
		for (int result : results) {
			System.out.println(result);
		}

	}
}
