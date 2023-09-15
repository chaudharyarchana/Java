//[2,0,2,1,1,0] o/p= [0,0,1,1,2,2]
import java.util.Arrays;
class SortColors{
    public static void main(String[] args){
        int[] nums={2,0,2,1,1,0};
        //  int[] brr=new int[3];
        // for(int i=0;i<nums.length;i++){
        //     brr[nums[i]]++;
        // }
        // for(int i=0;i<brr[0];i++){
        //     System.out.print("0");
        // }
        // for(int i=0;i<brr[1];i++){
        //     System.out.print("1");
        // }
        // for(int i=0;i<brr[2];i++){
        //     System.out.print("2");
        // }
             int zeros=0;
     int twos=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[zeros];
                nums[zeros]=temp;
            zeros++;
        }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==2){
                 int temp=nums[i];
                nums[i]=nums[twos];
                nums[twos]=temp;
                twos--;
            }
        }
        System.out.print(Arrays.toString(nums));
    }
}