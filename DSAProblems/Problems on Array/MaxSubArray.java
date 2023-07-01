class MaxSubArray{
    static void subArrays(int arr[]){
        //Finding sub arrays of array using brute force methode
        // printing all sub arrays
        //printing sub arrays  sum
        //printing maximum sum among the sub arrays
        int sum=0, count =0,maxsum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    sum = sum+arr[k];
                    System.out.print(arr[k]+" ");
                }
                count++;
                System.out.println("sum:"+sum);
                if(maxsum<sum)
                maxsum=sum;
                sum =0;
                
            }
        }
        System.out.println("Total no of Sub Arrays are:"+count);
        System.out.println("Maximum sum among the suarrya:"+maxsum);
    }
    public static void main(String []args){
        int arr[] = {1,2,5,8,9,4,63,58,14,32};
        
        subArrays(arr);

    }
}