package LeetCode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ӡ�������
 * 
 * @author yangrui-lc
 *
 */
public class LeetCode118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();

		List<Integer> firstRow = new ArrayList<>();
		triangle.add(firstRow);
		triangle.get(0).add(1);
		if (numRows == 0)
			return triangle;

		for (int i = 1; i < numRows; i++) {
			List<Integer> row = new ArrayList<>();
			List<Integer> preRow = triangle.get(i - 1);

			row.add(1);

			for (int j = 1; j < i; j++) {
				row.add(preRow.get(j) + preRow.get(j - 1));
			}
			row.add(1);
			triangle.add(row);
		}
		return triangle;
	}

	public List<Integer> getRow(int rowIndex) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();

		List<Integer> firstRow = new ArrayList<>();
		triangle.add(firstRow);
		triangle.get(0).add(1);
		if (rowIndex == 0)
			return triangle.get(0);
		for (int i = 1; i < rowIndex + 1; i++) {
			List<Integer> row = new ArrayList<>();
			List<Integer> preRow = triangle.get(i - 1);

			row.add(1);

			for (int j = 1; j < i; j++) {
				row.add(preRow.get(j) + preRow.get(j - 1));
			}
			row.add(1);
			triangle.add(row);
		}
		return triangle.get(rowIndex);

	}

	public static void main(String[] args) {
		int row = 0;
		LeetCode118 demo = new LeetCode118();

		System.out.println(demo.getRow(row));
	}
}
