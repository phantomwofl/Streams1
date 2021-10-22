package homeworks.stream1;

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        int j = 0;
        int tmp;

        for (int i : list) {
            if ((i > 0) && (i % 2 == 0)) {
                j += 1;
            }
        }

        int[] sort = new int[j];

        for (int i = 0; i < sort.length; ) {
            for (int k : list) {
                if ((k > 0) && (k % 2 == 0)) {
                    sort[i] = k;
                    i++;
                }
            }
        }

        for (int k = 0; k < sort.length; k++) {
            for (int i = 0; i < sort.length ; i++) {
                if (sort[k] < sort[i]) {
                    tmp = sort[k];
                    sort[k] = sort[i];
                    sort[i] = tmp;
                }
            }
        }

        for (int i : sort) {
            System.out.println(i);
        }
    }
}

