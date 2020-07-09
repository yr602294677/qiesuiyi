package LeetCode;
/**
 * 10��������ǰһǧ��  ��С����
 * @author yr
 */
public class topN {

    // ���ڵ�
    private int parent(int n) {
        return (n - 1) / 2;
    }

    // ����
    private int left(int n) {
        return 2 * n + 1;
    }

    // �Һ���
    private int right(int n) {
        return 2 * n + 2;
    }

    // ������
    private void buildHeap(int n, int[] data) {
        for(int i = 1; i < n; i++) {
            int t = i;
            // ������
            while(t != 0 && data[parent(t)] > data[t]) {
                int temp = data[t];
                data[t] = data[parent(t)];
                data[parent(t)] = temp;
                t = parent(t);
            }
        }
    }

    // ����data[i]
    private void adjust(int i, int n, int[] data) {
        if(data[i] <= data[0]) {
            return;
        }
        // �û��Ѷ�
        int temp = data[i];
        data[i] = data[0];
        data[0] = temp;
        // �����Ѷ�
        int t = 0;
        while( (left(t) < n && data[t] > data[left(t)])
            || (right(t) < n && data[t] > data[right(t)]) ) {
            if(right(t) < n && data[right(t)] < data[left(t)]) {
                // �Һ��Ӹ�С���û��Һ���
                temp = data[t];
                data[t] = data[right(t)];
                data[right(t)] = temp;
                t = right(t);
            } else {
                // �����û�����
                temp = data[t];
                data[t] = data[left(t)];
                data[left(t)] = temp;
                t = left(t);
            }
        }
    }

    // Ѱ��topN���÷����ı�data����topN�ŵ���ǰ��
    public void findTopN(int n, int[] data) {
        // �ȹ���n������С����
        buildHeap(n, data);
        // n����������е���
        for(int i = n; i < data.length; i++) {
            adjust(i, n, data);
        }
    }

    // ��ӡ����
    public void print(int[] data) {
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}
