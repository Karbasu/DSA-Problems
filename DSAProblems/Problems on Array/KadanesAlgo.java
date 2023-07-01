import java.lang.Math;
class KadanesAlgo{
    public static void main(String args[]){
        int array[] = {-2,-3,4,-1,-2,1,5,-3};
        MaxsumSubArray(array);

    }
    static void MaxsumSubArray(int array[]){
        int msum = Integer.MIN_VALUE,csum=0;
        for(int i=0;i<array.length;i++){
            
            csum =csum+ array[i];
            if(csum<0)
            csum=0;
            msum = Math.max(csum,msum);


        }
        System.out.println("max sum is:"+msum);
    }
}