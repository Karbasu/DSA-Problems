import java.util.Scanner;
import java.util.Arrays;

class RepeatAndMissingNoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1])
                temp = a[i];
        }

        System.out.println(temp + 1);

    }
}