import java.util.Arrays;
import java.lang.Math;
class MajorityElement{
    static int majority(int arr[]){
        int ans=0,count=0,ans2=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else
            count =0;
               if(count>ans2){
            ans2 = count;
                ans = i;
        }
           
        }
        ans = arr[ans];
        return ans;
    }
    public static void main(String[] args){
        int arr[]  ={4,4,4,4,2,2};
        System.out.println(majority(arr));
    }
}