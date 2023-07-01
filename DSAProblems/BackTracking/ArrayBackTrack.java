//this code is example of backtraking
//in this code we will assign values to empty array and change the assugned values using backtrack
class ArrayBackTrack{
    public static void main(String[] args){
        int arr[] = new int[15];
        changeArr(arr,0,1);
        System.out.println();
        for(int k=0;k<arr.length;k++)
        System.out.print(arr[k]+" ");
    }
    static void changeArr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            for(int k=0;k<arr.length;k++)
            System.out.print(arr[k]+" ");
            return;
        }
        arr[i] = val;//assigning value to array
        changeArr(arr,i+1,val+1);//recursion
        arr[i] = arr[i]-2;
    }
}