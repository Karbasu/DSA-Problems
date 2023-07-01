import java.util.Scanner;
import java.lang.Math;
class TrapRainWater{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();

        int heigth[] = new int[n];
        System.out.println("Enter the array values");
        for(int i=0;i<n;i++)
        heigth[i]= sc.nextInt();
        trappedWater(heigth);
        sc.close();
        
    }
    static void trappedWater(int heigth[]){
        int leftmax[] = new int[heigth.length];
        int rigthmax[] = new int[heigth.length];
        //claculating left max for each heigth 
        leftmax[0] =heigth[0];
        rigthmax[heigth.length-1]= heigth[heigth.length-1];
        for(int i=1;i<heigth.length;i++){
            leftmax[i] = Math.max(heigth[i],leftmax[i-1]);
            
        }
        System.out.println("left max values");
        for(int i=0;i<heigth.length;i++)
        System.out.print(leftmax[i]+" ");
        System.out.println();
        //claculating right max for each heigth
        for(int j=heigth.length-2;j>=0;j--){
            rigthmax[j] = Math.max(heigth[j],rigthmax[j+1]);
            
        }
        System.out.println("rigth max values");
        for(int i=0;i<heigth.length;i++)
        System.out.print(rigthmax[i]+" ");
        int trappedwater = 0;
        for(int k=0;k<heigth.length;k++){
            int waterlevel =Math.min(leftmax[k],rigthmax[k]);
            trappedwater += (waterlevel-heigth[k]);
        }
        System.out.println();
        System.out.println("trapped water in blocks is:"+trappedwater);

    }
}