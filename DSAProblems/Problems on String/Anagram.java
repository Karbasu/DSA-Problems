import java.util.*;
class Anagram{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String rw = in.next();
        int count = word.length();
        System.out.println(count);
        
        //now checking rewritten word contain only those letters which are given in word
        for(int i=0;i<word.length();i++){
        for(int j=0;j<word.length();j++){
            if(rw.charAt(i)==(word.charAt(j))){
            count--;
            break;   
        }
        }
        }
        if(count==0)
        System.out.println("true");
        else
        System.out.println("false");
        System.out.println(count);
        
    }
}