//WAP to find the sum btw given ranges
import java.util.*;
class SumInRange{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] array={1,3,5,2,8,4,9,8};
        System.out.println("Enter the range for sum of subarray start and end points");
        int start=sc.nextInt();
        int end =sc.nextInt();
        int sum=0;
        int[] sums=new int[array.length];
        sums[0]=array[0];
        for(int i=1;i<array.length;i++){
           sums[i]=sums[i-1]+array[i];
        }
        sum=sums[end]-sums[start];
        System.out.println("sum is"+ sum);
    }
}