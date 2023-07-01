class ProductArrayExceptSelf
{
    public static void product(int nums[]){
        int ans[] = new int[nums.length];
        int temp = 1;
        for(int i = 0; i< nums.length; i++) {
            ans[i] = temp;
            temp *= nums[i];
        }
        for(int i=0;i<nums.length;i++)
        System.out.print(ans[i]+" ");
         temp = 1;
        for(int i = nums.length-1; i >= 0; i--) {
            ans[i] *= temp;
            System.out.println("ans[i]: "+ans[i]);
            temp *= nums[i];
            System.out.println("temp: "+temp);
        }
        System.out.println();
         for(int i=0;i<nums.length;i++)
        System.out.print(ans[i]+" ");
    } 
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        product(arr);
    }
}