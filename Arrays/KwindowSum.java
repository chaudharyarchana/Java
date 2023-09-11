import java.util.*;
class KwindowSum{
    public static void main(String[] args){
        int[] arr={5,2,1,4,3,9,7,6,8};
        int k=5;
        int N=(arr.length-k)+1;
        int[] brr=new int[N];
        for(int i=0;i<k;i++){
            brr[0]=brr[0]+arr[i];
        }
        for(int i=1;i<N;i++){
            brr[i]=brr[i-1]-arr[i-1]+arr[k];
            k++;
        }
        System.out.println(Arrays.toString(brr));
    }
}