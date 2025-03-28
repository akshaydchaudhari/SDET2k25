package Array;

public class MergewArrays {
    public static void main(String[] args) {
        int a[] = {9, 3, 5, 7, 1};
        int b[] = {2, 4, 6, 8};
        int c[] = mergeArrays(a, b);
        for (int num : c) {
            System.out.print(num + " ");
        }
        System.out.println();
        int e[] = {9, 3, 5, 7, 1};
        int f[] = {2, 4, 6, 8};
        int d[] = mergeArrays(e, f);
        for (int num : d) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        int n = a.length, m = b.length, i = 0, j = 0, k = 0;
        int[] c = new int[n + m];

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];

            } else {
                c[k++] = b[j++];
            }
        }
        while (i < n) c[k++] = a[i++];
        while (j < m) c[k++] = b[j++];
        return c;
    }

    public static int[] mergeArrays1(int[] a, int[] b) {
        int n = a.length, m = b.length, k = 0;
        int[] c = new int[n + m];

        // Copy elements from array a to c
        for (int i = 0; i < n; i++) {
            c[k++] = a[i];
        }

        // Copy elements from array b to c
        for (int j = 0; j < m; j++) {
            c[k++] = b[j];
        }

        // Manually sort the merged array using Bubble Sort
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - i - 1; j++) {
                if (c[j] > c[j + 1]) {
                    // Swap c[j] and c[j + 1]
                    int temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }

        return c;
    }
}
