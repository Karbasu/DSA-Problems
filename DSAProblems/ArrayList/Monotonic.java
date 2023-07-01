import java.util.ArrayList;
class Monotonic{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); 
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(3);
        System.out.println(sol(list));
    }
    static boolean sol(ArrayList<Integer> list){
        boolean ans = false;
        if(list.get(0)<=list.get(1)){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i+1)>=list.get(i))
            ans = true;
            else{
            return false;}
        }}
        else{
            for(int i=list.size()-1;i>=1;i--){
                if(list.get(i)<=list.get(i-1))
                ans = true;
                else
                return false;
            }   
        }
        return ans;
    }
}