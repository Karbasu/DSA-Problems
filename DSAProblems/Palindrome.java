import java.util.Scanner;

class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder str1 = new StringBuilder("");
        for (int i = (str.length() - 1); i >= 0; i--)
            str1.append(str.charAt(i));

        int count =0;
        System.out.println(str1 + " " );
        for(int i=0;i<str.length()-1;i++){
        if (str.charAt(i)==str1.charAt(i)) {
            count++;
            
        } 
        }
        if(count==str.length()-1)
        System.out.println("Plalindrome");
        else
        System.out.println("not a palindrome");

}
}