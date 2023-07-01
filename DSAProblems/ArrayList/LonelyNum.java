import java.util.ArrayList;
import java.util.Collections;
class LonelyNum{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        System.out.println(lonely(list));
    }
    static ArrayList<Integer> lonely(ArrayList<Integer> list){
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.sort(list);
        boolean a = false;
        for(int i=0;i<list.size()-1;i++){
            if(list.contains(list.get(i)-1) || list.contains(list.get(i)+1) || (list.get(i)==list.get(i+1)) )
            a = true;
            else
            ans.add(list.get(i));
        }
        if(list.get(list.size()-1)!=list.get(list.size()-2))
            if(list.contains(list.get(list.size()-1)-1) || list.contains(list.get(list.size()-1)+1))
            a = true;
            ans.add(list.get(list.size()-1));
        return ans;
    }
}