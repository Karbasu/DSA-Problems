import java.util.Scanner;

class BuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of test cases");
        // taking no of test cases
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println("Enter the no. of days ");
            int n = sc.nextInt();
            int a[] = new int[n];
            System.out.println("Enter the price of stocks ");
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            // storing the first day stock value in temp and checking the min stock value
            // and storing
            int temp = a[0];
            int index = 0;
            for (int i = 1; i < n; i++) {
                if (temp > a[i]) {
                    temp = a[i];
                    index = i;
                }
            }
            // storing the final temp value in amt
            int amt = temp;
            // if min stock value is at last index or day then it return zero
            if (index == (n - 1))
                System.out.println("profit is :0");
            // it checks the stock values of next days to selected stock and finds the
            // maximum profit
            else {
                for (int i = index; i < n; i++) {
                    if (a[i] > amt)
                        amt = a[i];
                }
                System.out.println("max profit is -->" +  (amt - temp));
            }
        }

    }
}