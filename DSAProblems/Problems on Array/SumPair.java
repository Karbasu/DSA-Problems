class SumPair{
    public static void main(String[] args){
        int arr[] = {11, 15, 26, 38, 9, 10};
        int n = 35;
        pair(arr,n);
        
        
    }

    static void pair(int arr[],int n){
        boolean ans = false;
        int k = 0;
        for(int i=0;i<arr.length;i++){
            if(k!=i){
                if(arr[k]+arr[i]==n){
                    ans = true;
                    System.out.println(arr[k]+" "+arr[i]);
                    System.out.println(ans);return;
                }
            }
            if(i==arr.length-1 && k<arr.length){
                k++;
                i=0;
            }
            
        }
        System.out.println(ans);
    }
}