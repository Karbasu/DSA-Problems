class SubSets{
    public static void main(String args[]){
        String name = "basu";
        subs(name,"",0);
    }
    static void subs(String str,String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0)
            System.out.println("null");
            else
            System.out.println(ans);
            return;
        }
        subs(str,ans+str.charAt(i),i+1); //for yes 
        subs(str,ans,i+1); //for no
    }
}
//this program prints subsets of given string , this methode can be used for others also