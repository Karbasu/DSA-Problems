class MergeSort{
    public static void main(String args[])
    {
        int arr[] = {9,5,2,10,52,-3};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
        return;}
        int mid = si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,mid,si,ei);
    }
    public static void merge(int arr[],int mid,int si,int ei){
        int temp[] = new int[ei-si+1];
        int i = si; //first array
        int j = mid+1;//second araay
        int k = 0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){//for left over elements
        temp[k++] = arr[i++];}
        while(j<=ei){ 
        temp[k++] = arr[j++];}
        for( k=0,i=si;k<temp.length;k++,i++)
        arr[i] = temp[k];

        
    }
}