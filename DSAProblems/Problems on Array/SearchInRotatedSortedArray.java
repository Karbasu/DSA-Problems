import java.util.*;
class SearchInRotatedSortedArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();

        System.out.println("Enter the pivot index");
        int p = sc.nextInt();
        int newar[] = new int[n];
        int x = 0;
        for (int i = p; i < n; i++) {
            newar[x] = array[i];
            x++;
        }
        for (int i = 0; i < p; i++) {
            newar[x] = array[i];
            x++;
        }
        System.out.println("Enter the number you want t get index of");
        int num = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (newar[i] == num) {
                System.out.println("index " + i);
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(newar[i]+" ");
    }
}