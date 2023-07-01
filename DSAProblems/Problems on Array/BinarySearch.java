import java.util.*;
class BinarySearch{
    public int search(int array[],int key){
        int start=0,end=array.length-1;
        
        while(start<=end){
           int  mid = (start+end)/2;
            if(array[mid]==key){
                return mid;
                
            
            }
            else if(array[mid]<key){
                start =mid+1;
            }
            else
            end = mid-1;
            

        }
        
        return -1;
    }
    public static void main(String args[]){


        int array[] = {1,2,3,4,5,6,7,8,9,10,11};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
       BinarySearch obj = new BinarySearch();
       System.out.print(obj.search(array,key));
       
        sc.close();

    }
}