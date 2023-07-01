class Permutations{
    public static void main(String args[]){
        String str = "abc";
        permut(str,"");
    }
    static void permut(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1); //delets the i th cahr from string and store in new str 
            permut(newstr,ans+curr); //recursion
        }
    }
}